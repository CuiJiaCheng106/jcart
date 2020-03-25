package io.cjc.jcartstoreback.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import io.cjc.jcartstoreback.dto.in.ProductSearchInDTO;
import io.cjc.jcartstoreback.dto.out.PageOutDTO;
import io.cjc.jcartstoreback.dto.out.ProductListOutDTO;
import io.cjc.jcartstoreback.dto.out.ProductShowOutDTO;
import io.cjc.jcartstoreback.es.doc.ProductDoc;
import io.cjc.jcartstoreback.es.repo.ProductRepo;
import io.cjc.jcartstoreback.mq.HotProductDTO;
import io.cjc.jcartstoreback.po.ProductOperation;
import io.cjc.jcartstoreback.service.ProductOperationService;
import io.cjc.jcartstoreback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
    private ProductRepo productRepo;

    @Autowired
    private ProductOperationService productOperationService;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        String keyword = productSearchInDTO.getKeyword();
        List<ProductDoc> productDocs = productRepo.findByProductNameLikeOrProductAbstractLike(keyword, keyword);

        Page<ProductListOutDTO> page = productService.search(productSearchInDTO,pageNum);
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
        HotProductDTO hotProductDTO = new HotProductDTO();
        hotProductDTO.setProductId(productId);
        hotProductDTO.setProductCode(productShowOutDTO.getProductCode());
        kafkaTemplate.send("hotproduct", JSON.toJSONString(hotProductDTO));
        return productShowOutDTO;
    }

    @GetMapping("/hot")
   // @Cacheable(cacheNames="HotProduct")
    public List<ProductOperation> hot(){
        String hotProducts = redisTemplate.opsForValue().get("HotProducts");
        if (hotProducts!=null){
            List<ProductOperation> productOperations = JSON.parseArray(hotProducts, ProductOperation.class);
            return productOperations;
        }
        return null;

    }

}
