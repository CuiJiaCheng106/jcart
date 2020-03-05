package jcart.administration.back.cjc.service;

import com.github.pagehelper.Page;
import jcart.administration.back.cjc.po.Customer;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-05 17:38
 **/
public interface CustomerService {
    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);
}
