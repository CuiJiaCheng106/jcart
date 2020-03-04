package io.cjc.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.cjc.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.cjc.jcartstoreback.dto.out.OrderShowOutDTO;
import io.cjc.jcartstoreback.po.Order;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);

}
