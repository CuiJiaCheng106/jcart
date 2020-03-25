package jcart.administration.back.cjc.es.repo;

import jcart.administration.back.cjc.es.doc.ProductDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-24 18:58
 **/
public interface ProductRepo extends ElasticsearchRepository<ProductDoc,Integer> {


}
