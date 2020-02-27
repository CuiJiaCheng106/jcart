package jcart.administration.back.cjc.controller;

import com.github.pagehelper.Page;
import jcart.administration.back.cjc.dto.in.ProductCreateInDTO;
import jcart.administration.back.cjc.dto.in.ProductSearchInDTO;
import jcart.administration.back.cjc.dto.in.ProductUpdateInDTO;
import jcart.administration.back.cjc.dto.out.PageOutDTO;
import jcart.administration.back.cjc.dto.out.ProductShowOutDTO;
import jcart.administration.back.cjc.dto.out.ProductListOutDTO;
import jcart.administration.back.cjc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO, @RequestParam Integer pageNum) {
        Page<ProductListOutDTO> search = productService.search(pageNum);
        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal((int) search.getTotal());
        pageOutDTO.setPageNum(search.getPageNum());
        pageOutDTO.setList(search);
        return pageOutDTO;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId) {
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO) {
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO) {
        productService.update(productUpdateInDTO);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId) {
        productService.delete(productId);
    }


    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds) {
        productService.batchDelete(productIds);
    }
}
