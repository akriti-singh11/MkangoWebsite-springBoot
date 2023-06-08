package com.Mkango.springboot.demosecurity.controllerMkango;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoControllerMkango {
    @GetMapping("/")
    public String showHome()
    {
        return "home";
    }

}
