package io.cjc.jcartstoreback.service.impl;

import io.cjc.jcartstoreback.dao.ProductOperationMapper;
import io.cjc.jcartstoreback.dto.out.ProductListOutDTO;
import io.cjc.jcartstoreback.po.ProductOperation;
import io.cjc.jcartstoreback.service.ProductOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-22 13:36
 **/
@Service
public class ProductOperationServiceImpl  implements ProductOperationService {

    @Autowired
    private ProductOperationMapper productOperationMapper;

    @Override
    public void count(Integer productId) {
        ProductOperation productOperation = productOperationMapper.selectByPrimaryKey(productId);
        if (productOperation==null){
            ProductOperation productOperation1 = new ProductOperation();
            productOperation.setProductId(productId);
            productOperation.setAllCount(1);
            productOperation.setDayCount(1);
            productOperation.setRecentTime(new Date());
            productOperationMapper.insertSelective(productOperation);
        }else{
            productOperation.setAllCount(productOperation.getAllCount()+1);
            productOperation.setDayCount(productOperation.getDayCount()+1);
            productOperation.setRecentTime(new Date());
            productOperationMapper.updateByPrimaryKeySelective(productOperation);
        }
    }

    @Override
    public List<ProductListOutDTO> selectHotProduct() {
        List<ProductListOutDTO> productListOutDTOS = productOperationMapper.selectHotProduct();
        return  productListOutDTOS;
    }
}
