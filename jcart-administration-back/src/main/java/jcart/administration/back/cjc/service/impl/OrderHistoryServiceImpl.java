package jcart.administration.back.cjc.service.impl;

import jcart.administration.back.cjc.dao.OrderHistoryMapper;
import jcart.administration.back.cjc.po.Order;
import jcart.administration.back.cjc.po.OrderHistory;
import jcart.administration.back.cjc.service.OrderHistoryService;
import jcart.administration.back.cjc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Autowired
    private OrderService orderService;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistories;
    }

    @Override
    @Transactional
    public Long create(OrderHistory orderHistory) {
        orderHistoryMapper.insertSelective(orderHistory);
        Order order = new Order();
        order.setOrderId(orderHistory.getOrderId());
        order.setStatus(orderHistory.getOrderStatus());
        order.setUpdateTime(new Date());

        Long orderHistoryId = orderHistory.getOrderHistoryId();
        return orderHistoryId;
    }
}
