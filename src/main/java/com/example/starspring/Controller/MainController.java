package com.example.starspring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public  class MainController {
    @GetMapping("/starspring")
    @ResponseBody
    public String hello(){
        return "hello world";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }
}
