package io.cjc.jcartstoreback.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-23 19:23
 **/
@Component
public class ProductScheduler {


    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RedisTemplate redisTemplate;

    @Scheduled(fixedDelay = 30*1000)
    public void removeHotProduct(){
        logger.info("remove hot product");
        String key="HotProduct::SimpleKey[]";
        Boolean aBoolean = redisTemplate.delete(key);
    }

}
