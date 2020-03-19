package jcart.administration.back.cjc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("jcart.administration.back.cjc.dao")
@EnableAsync
public class JcartAdministrationBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JcartAdministrationBackApplication.class);

    }

}
