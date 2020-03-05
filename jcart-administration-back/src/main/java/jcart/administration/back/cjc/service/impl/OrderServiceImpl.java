package jcart.administration.back.cjc.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import jcart.administration.back.cjc.dao.OrderDetailMapper;
import jcart.administration.back.cjc.dao.OrderMapper;
import jcart.administration.back.cjc.dto.out.OrderListOutDTO;
import jcart.administration.back.cjc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public Page<OrderListOutDTO> search(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<OrderListOutDTO> page = orderMapper.search();

        return page;
    }
}
