package jcart.administration.back.cjc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("jcart.administration.back.cjc.dao")
public class JcartAdministrationBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JcartAdministrationBackApplication.class);

    }

}
