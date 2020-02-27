package jcart.administration.back.cjc.controller;

import jcart.administration.back.cjc.dto.in.CustomerSearchInDTO;
import jcart.administration.back.cjc.dto.out.CustomerListOutDTO;
import jcart.administration.back.cjc.dto.out.CustomerShowOutDTO;
import jcart.administration.back.cjc.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 14:25
 **/
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO, @RequestParam Integer pageNum){
        return  null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }
}
