package jcart.administration.back.cjc.controller;

import jcart.administration.back.cjc.dto.out.AddressListOutDTO;
import jcart.administration.back.cjc.dto.out.AddressShowOutDTO;
import jcart.administration.back.cjc.po.Address;
import jcart.administration.back.cjc.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private AddressService addressService;

    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId){
        return null;
    }


    @GetMapping("/getById")
    public AddressShowOutDTO getById(@RequestParam Integer addressId){
        Address address = addressService.getById(addressId);
        AddressShowOutDTO addressShowOutDTO = new AddressShowOutDTO();
        addressShowOutDTO.setAddressId(address.getAddressId());
        addressShowOutDTO.setReceiverName(address.getReceiverName());
        addressShowOutDTO.setReceiverMobile(address.getReceiverMobile());
        addressShowOutDTO.setContent(address.getContent());
        addressShowOutDTO.setTag(address.getTag());
        return addressShowOutDTO;
    }
}
