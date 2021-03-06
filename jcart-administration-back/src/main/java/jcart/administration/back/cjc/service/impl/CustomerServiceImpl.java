package jcart.administration.back.cjc.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import jcart.administration.back.cjc.dao.CustomerMapper;
import jcart.administration.back.cjc.dto.in.CustomerSearchInDTO;
import jcart.administration.back.cjc.dto.in.CustomerSetStatusInDTO;
import jcart.administration.back.cjc.po.Customer;
import jcart.administration.back.cjc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-05 17:39
 **/
@Service
public class CustomerServiceImpl  implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<Customer> page = customerMapper
                .search(customerSearchInDTO.getUsername(),
                        customerSearchInDTO.getRealName(),
                        customerSearchInDTO.getMobile(),
                        customerSearchInDTO.getEmail(),
                        customerSearchInDTO.getStatus());
        return page;
    }

    @Override
    public Customer getById(Integer customerId) {
        Customer customer = customerMapper.selectByPrimaryKey(customerId);
        return  customer;
    }

    @Override
    public void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO) {
        Customer customer = new Customer();
        customer.setCustomerId(customerSetStatusInDTO.getCustomerId());
        customer.setStatus(customerSetStatusInDTO.getStatus());
        customerMapper.updateByPrimaryKeySelective(customer);
    }
}
