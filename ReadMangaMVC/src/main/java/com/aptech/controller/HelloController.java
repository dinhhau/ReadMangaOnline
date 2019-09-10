package com.aptech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public  String sayHello(ModelMap modelMap){
        modelMap.addAttribute("h","Hello A Hau");
        //chuyen den trang hello.jsp
        return "hello";
    }
}
