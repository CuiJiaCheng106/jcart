package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.cjf.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.cjf.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.cjf.jcartadministrationback.dto.out.PageOutDTO;
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
