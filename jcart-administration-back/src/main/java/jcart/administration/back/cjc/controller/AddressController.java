package jcart.administration.back.cjc.controller;

import jcart.administration.back.cjc.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 14:40
 **/
@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId){
        return null;
    }

}
