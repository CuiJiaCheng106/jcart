package jcart.administration.back.cjc.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import jcart.administration.back.cjc.dao.OrderDetailMapper;
import jcart.administration.back.cjc.dao.OrderMapper;
import jcart.administration.back.cjc.dto.in.OrderSearchInDTO;
import jcart.administration.back.cjc.dto.out.OrderListOutDTO;
import jcart.administration.back.cjc.dto.out.OrderShowOutDTO;
import jcart.administration.back.cjc.po.Customer;
import jcart.administration.back.cjc.po.Order;
import jcart.administration.back.cjc.po.OrderDetail;
import jcart.administration.back.cjc.service.CustomerService;
import jcart.administration.back.cjc.service.OrderService;
import jcart.administration.back.cjc.vo.OrderProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-05 16:12
 **/
@Service
public class OrderServiceImpl  implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;


    @Autowired
    private CustomerService customerService;

    @Override
    public Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<OrderListOutDTO> page = orderMapper.search(orderSearchInDTO.getOrderId(),
                orderSearchInDTO.getStatus(),
                orderSearchInDTO.getTotalPrice(),
                orderSearchInDTO.getCustomerName(),
                orderSearchInDTO.getStartTimestamp() == null ? null : new Date(orderSearchInDTO.getStartTimestamp()),
                orderSearchInDTO.getEndTimestamp() == null ? null : new Date(orderSearchInDTO.getEndTimestamp()));

        return page;
    }

    @Override
    public OrderShowOutDTO getById(Long orderId) {
        Order order = orderMapper.selectByPrimaryKey(Math.toIntExact(orderId));
        OrderDetail orderDetail = orderDetailMapper.selectByPrimaryKey(orderId);

        OrderShowOutDTO orderShowOutDTO = new OrderShowOutDTO();
        orderShowOutDTO.setOrderId(orderId);
        orderShowOutDTO.setCustomerId(order.getCustomerId());
        Customer customer = customerService.getById(order.getCustomerId());
        orderShowOutDTO.setStatus(order.getStatus());
        orderShowOutDTO.setTotalPrice(order.getTotalPrice());
        orderShowOutDTO.setRewordPoints(order.getRewordPoints());
        orderShowOutDTO.setCreateTimestamp(order.getCreateTime().getTime());
        orderShowOutDTO.setUpdateTimestamp(order.getUpdateTime().getTime());

        orderShowOutDTO.setShipMethod(orderDetail.getShipMethod());
        orderShowOutDTO.setShipAddress(orderDetail.getShipAddress());
        orderShowOutDTO.setShipPrice(orderDetail.getShipPrice());
        orderShowOutDTO.setPayMethod(orderDetail.getPayMethod());
        orderShowOutDTO.setInvoiceAddress(orderDetail.getInvoiceAddress());
        orderShowOutDTO.setInvoicePrice(orderDetail.getInvoicePrice());
        orderShowOutDTO.setComment(orderDetail.getComment());

        List<OrderProductVO> orderProductVOS = JSON.parseArray(orderDetail.getOrderProducts(), OrderProductVO.class);
        orderShowOutDTO.setOrderProducts(orderProductVOS);

        return orderShowOutDTO;
    }


}
