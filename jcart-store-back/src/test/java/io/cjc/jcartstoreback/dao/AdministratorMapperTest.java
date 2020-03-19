package io.cjc.jcartstoreback.dao;
import io.cjc.jcartstoreback.po.Administrator;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


@MybatisTest
class AdministratorMapperTest {
    @Autowired
    private AdministratorMapper administratorMapper;
    @Test
    void selectByPrimaryKey() {
        Administrator administrator = administratorMapper.selectByPrimaryKey(1);
        System.out.println(administrator);
    }
}