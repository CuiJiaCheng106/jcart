package jcart.administration.back.cjc.service;

import com.github.pagehelper.Page;
import jcart.administration.back.cjc.po.Administrator;

import java.util.List;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);

    Integer create(Administrator administrator);

    void delete(Integer administrator);

    void batchDelete(List<Integer> administratorIds);

    Page<Administrator> getList(Integer pageNum);

    Administrator getByEmail(String email);

}
