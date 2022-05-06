package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Project sfg-pet-clinic
 * @Author loyd_ on 5/6/2022
 **/
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(){
        return "owners/index";
    }

}
