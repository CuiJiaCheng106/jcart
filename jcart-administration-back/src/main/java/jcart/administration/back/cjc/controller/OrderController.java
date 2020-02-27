package jcart.administration.back.cjc.controller;

import jcart.administration.back.cjc.dto.in.OrderSearchInDTO;

import jcart.administration.back.cjc.dto.out.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 14:46
 **/

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getInvoiceInfo")
    public OrderInvoiceShowOutDTO getInvoiceInfo(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getShipInfo")
    public OrderShipShowOutDTO getShipInfo(@RequestParam Long orderId){
        return  null;
    }

}
