package jcart.administration.back.cjc.service;

import com.github.pagehelper.Page;
import jcart.administration.back.cjc.dto.out.OrderListOutDTO;
import jcart.administration.back.cjc.dto.out.OrderShowOutDTO;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-05 16:10
 **/
public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
