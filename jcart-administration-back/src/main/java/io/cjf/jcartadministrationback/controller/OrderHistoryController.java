package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.dto.in.OrderHistoryCreateInDTO;
import io.cjf.jcartadministrationback.dto.out.OrderHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 15:07
 **/
@RestController
@RequestMapping("/OrderHistory")
public class OrderHistoryController {

    @GetMapping("/getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(@RequestParam Long orderId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){
        return null;
    }
}
