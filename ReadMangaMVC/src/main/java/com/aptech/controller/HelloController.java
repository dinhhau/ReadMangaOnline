package com.aptech.controller;

import com.aptech.serviceIml.TblUserServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class HelloController {
    @Autowired
    TblUserServiceIml tblUserServiceIml;
    @RequestMapping(method = RequestMethod.GET)
    public  String sayHello(ModelMap modelMap){
        modelMap.addAttribute("h",tblUserServiceIml.getList());
        //chuyen den trang hello.jsp
        return "hello";
    }
}
