package io.cjc.jcartstoreback.service;

import io.cjc.jcartstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

}
