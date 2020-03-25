package io.cjc.jcartstoreback.es.repo;

import io.cjc.jcartstoreback.es.doc.ProductDoc;
import io.cjc.jcartstoreback.po.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-24 18:58
 **/
public interface ProductRepo extends ElasticsearchRepository<ProductDoc,Integer> {

    List<ProductDoc> findByProductNameLikeOrProductAbstractLike(String productName,String productAbstract);

}
