package jcart.administration.back.cjc.service.impl;

import jcart.administration.back.cjc.dao.AddressMapper;
import jcart.administration.back.cjc.po.Address;
import jcart.administration.back.cjc.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-05 17:55
 **/
@Service
public class AddressServiceImpl  implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Address getById(Integer addressId) {
        Address address = addressMapper.selectByPrimaryKey(addressId);
        return address;
    }

    @Override
    public List<Address> getByCustomerId(Integer customerId) {
        List<Address> addresses = addressMapper.selectByCustomerId(customerId);
        return addresses;
    }
}
