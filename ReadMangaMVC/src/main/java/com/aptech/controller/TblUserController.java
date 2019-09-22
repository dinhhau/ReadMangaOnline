package com.aptech.controller;

import com.aptech.model.TblUserEntity;
import com.aptech.service.TblUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("api/")
public class TblUserController {
    @Autowired
    TblUserService tblUserService;

    @GetMapping("dangKy")
    public String dangKy(@RequestParam String email, @RequestParam String matkhau){
        boolean kt = true;
        TblUserEntity entity = new TblUserEntity();
        entity.setUsername(email);
        entity.setPassword(matkhau);
        TblUserEntity entity1 = tblUserService.save(entity);
        if(null == entity1){
            kt=false;
        }
        return "" + kt;
    }
}
