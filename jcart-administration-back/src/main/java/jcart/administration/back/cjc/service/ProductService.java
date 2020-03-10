package jcart.administration.back.cjc.service;

import com.github.pagehelper.Page;
import jcart.administration.back.cjc.dto.in.ProductCreateInDTO;
import jcart.administration.back.cjc.dto.in.ProductSearchInDTO;
import jcart.administration.back.cjc.dto.in.ProductUpdateInDTO;
import jcart.administration.back.cjc.dto.out.ProductListOutDTO;
import jcart.administration.back.cjc.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                   Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

}
