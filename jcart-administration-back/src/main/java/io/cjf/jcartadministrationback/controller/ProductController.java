package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.cjf.jcartadministrationback.dto.out.PageOutDTO;
import io.cjf.jcartadministrationback.dto.out.ProductListOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 14:00
 **/

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,@RequestParam Integer pageNum){
        return  null;
    }

}
