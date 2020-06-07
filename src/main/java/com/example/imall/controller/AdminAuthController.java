package com.example.imall.controller;

import com.example.imall.util.ResponseUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/auth")
public class AdminAuthController {

    @RequestMapping("/login")
    public Object login(){
        String s = "6e75cad9-5fb6-44ea-84a5-e5508d6bbe86";
        return ResponseUtil.ok(s);
    }

//    TODO ？ 这个接口的意义
    @RequestMapping("/info")
    public String info(){
        return "{\"errno\":0,\"data\":{\"roles\":[\"超级管理员\"],\"name\":\"admin123\",\"perms\":[\"*\"],\"avatar\":\"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif\"},\"errmsg\":\"成功\"}";
    }

}
