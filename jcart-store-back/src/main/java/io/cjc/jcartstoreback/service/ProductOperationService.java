package io.cjc.jcartstoreback.service;

import io.cjc.jcartstoreback.dto.out.ProductListOutDTO;

import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-22 13:36
 **/
public interface ProductOperationService {

    void  count(Integer productId);

    List<ProductListOutDTO> selectHotProduct();

}
