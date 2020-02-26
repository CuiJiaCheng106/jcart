package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.cjf.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.cjf.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.cjf.jcartadministrationback.dto.out.PageOutDTO;
import io.cjf.jcartadministrationback.dto.out.ProductListOutDTO;
import io.cjf.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.cjf.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 14:00
 **/

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,@RequestParam Integer pageNum){
        return  null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return  null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

}
