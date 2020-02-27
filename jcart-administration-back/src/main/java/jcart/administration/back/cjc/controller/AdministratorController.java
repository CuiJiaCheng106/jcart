package jcart.administration.back.cjc.controller;

import jcart.administration.back.cjc.dto.in.*;
import jcart.administration.back.cjc.dto.out.AdministratorGetProfileOutDTO;
import jcart.administration.back.cjc.dto.out.AdministratorListOutDTO;
import jcart.administration.back.cjc.dto.out.AdministratorShowOutDTO;
import jcart.administration.back.cjc.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){
        return null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId){
        return null;
    }

    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @GetMapping("/getPadResetCode")
    public String getPadResetCode(@RequestParam String email){
        return  null;
    }

    @PostMapping("/resetPwd")
    public void restPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    private AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
        return  null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }
}
