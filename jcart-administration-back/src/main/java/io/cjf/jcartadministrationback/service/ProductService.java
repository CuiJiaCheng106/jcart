package io.cjf.jcartadministrationback.service;

import io.cjf.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.cjf.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.cjf.jcartadministrationback.po.Product;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-26 14:34
 **/
public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);
}
