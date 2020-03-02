package jcart.administration.back.cjc.service;

import jcart.administration.back.cjc.po.Administrator;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);

}
