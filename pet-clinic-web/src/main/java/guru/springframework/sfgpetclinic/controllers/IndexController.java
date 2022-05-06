package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Project sfg-pet-clinic
 * @Author loyd_ on 5/5/2022
 **/
@Controller
public class IndexController {

    @RequestMapping({"","/", "index.html"})
    public String index(){
        return "index";
    }
}
