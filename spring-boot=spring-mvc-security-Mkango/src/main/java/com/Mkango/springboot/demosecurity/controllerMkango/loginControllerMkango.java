package com.Mkango.springboot.demosecurity.controllerMkango;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginControllerMkango {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage()
    {
        return "fancy-login";
    }

}
