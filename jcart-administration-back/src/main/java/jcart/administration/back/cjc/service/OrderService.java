package jcart.administration.back.cjc.service;

import com.github.pagehelper.Page;
import jcart.administration.back.cjc.dto.out.OrderListOutDTO;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-05 16:10
 **/
public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);

}
