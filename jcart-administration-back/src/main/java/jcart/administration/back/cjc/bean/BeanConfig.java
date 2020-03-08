package jcart.administration.back.cjc.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.SecureRandom;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-08 13:51
 **/

@Configuration
public class BeanConfig {

    @Bean
    public SecureRandom secureRandom(){
        return new SecureRandom();
    }

}
