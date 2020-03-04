package io.cjc.jcartstoreback.service;

import io.cjc.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.cjc.jcartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    Customer getByEmail(String email);

    void update(Customer customer);

}
