package jcart.administration.back.cjc.controller;

import jcart.administration.back.cjc.dto.in.ReturnSearchInDTO;
import jcart.administration.back.cjc.dto.in.ReturnUpdateActionInDTO;
import jcart.administration.back.cjc.dto.out.PageOutDTO;
import jcart.administration.back.cjc.dto.out.ReturnListOutDTO;
import jcart.administration.back.cjc.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}