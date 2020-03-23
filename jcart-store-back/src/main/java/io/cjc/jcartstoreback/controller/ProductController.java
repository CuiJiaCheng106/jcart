package io.cjc.jcartstoreback.controller;

import com.github.pagehelper.Page;
import io.cjc.jcartstoreback.dto.in.ProductSearchInDTO;
import io.cjc.jcartstoreback.dto.out.PageOutDTO;
import io.cjc.jcartstoreback.dto.out.ProductListOutDTO;
import io.cjc.jcartstoreback.dto.out.ProductShowOutDTO;
import io.cjc.jcartstoreback.service.ProductOperationService;
import io.cjc.jcartstoreback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductOperationService productOperationService;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        Page<ProductListOutDTO> page = productService.search(pageNum);
        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getShowById(productId);
        //productOperationService.count(productId);
        kafkaTemplate.send("hotproduct",productId);
        return productShowOutDTO;
    }

    @GetMapping("/hot")
    public List<ProductListOutDTO> hot(){
        return null;
    }

}
