package jcart.administration.back.cjc.service;

import com.github.pagehelper.Page;
import jcart.administration.back.cjc.dto.in.CustomerSearchInDTO;
import jcart.administration.back.cjc.dto.in.CustomerSetStatusInDTO;
import jcart.administration.back.cjc.po.Customer;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-05 17:38
 **/
public interface CustomerService {
    Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);
}
