package io.cjc.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.cjc.jcartstoreback.dto.out.ProductListOutDTO;
import io.cjc.jcartstoreback.dto.out.ProductShowOutDTO;
import io.cjc.jcartstoreback.po.Product;

public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
