package jcart.administration.back.cjc.service;

import jcart.administration.back.cjc.po.Address;

import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-05 17:55
 **/
public interface AddressService {
    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);
}
