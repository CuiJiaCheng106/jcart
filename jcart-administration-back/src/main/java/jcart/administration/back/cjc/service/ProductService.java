package jcart.administration.back.cjc.service;

import com.github.pagehelper.Page;
import jcart.administration.back.cjc.dto.in.ProductCreateInDTO;
import jcart.administration.back.cjc.dto.in.ProductUpdateInDTO;
import jcart.administration.back.cjc.dto.out.ProductListOutDTO;
import jcart.administration.back.cjc.dto.out.ProductShowOutDTO;

import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-26 14:34
 **/
public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);
}
