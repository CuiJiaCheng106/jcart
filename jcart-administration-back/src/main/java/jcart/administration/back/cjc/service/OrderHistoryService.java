package jcart.administration.back.cjc.service;

import jcart.administration.back.cjc.po.OrderHistory;

import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-06 16:19
 **/
public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);


}
