package jcart.administration.back.cjc.controller;

import jcart.administration.back.cjc.dto.in.AdministratorLoginInDTO;
import jcart.administration.back.cjc.dto.out.AdministratorLoginOutDTO;
import jcart.administration.back.cjc.exception.ClientException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdministratorControllerTest {

    @Autowired
    private  AdministratorController administratorController;

    @Test
    void login() throws ClientException {
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("123456");
        AdministratorLoginOutDTO login = administratorController.login(administratorLoginInDTO);
        assertNotNull(login);

        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("abcdef");
        login = administratorController.login(administratorLoginInDTO);

    }
}