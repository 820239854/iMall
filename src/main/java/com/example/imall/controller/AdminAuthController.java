package com.example.imall.controller;

import com.example.imall.util.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/admin/auth")
@Api(tags = "AdminAuthController")
public class AdminAuthController {

    @RequestMapping("/login")
    @ApiOperation(value = "Login",tags = "AdminAuthController")
    public Object login(){
        String s = "6e75cad9-5fb6-44ea-84a5-e5508d6bbe86";
        return ResponseUtil.ok(s);
    }

//    TODO ？ 这个接口的意义
    @RequestMapping("/info")
    @ApiOperation(value = "Info",tags = "AdminAuthController")
    public Object info(){
        Map<String, Object> data = new HashMap<>();
        Set<String> roles = new HashSet<>();
        roles.add("超级管理员");
        data.put("roles",roles);

        data.put("name","admin123");
        Set<String> perms = new HashSet<>();
        perms.add("*");
        data.put("perms",perms);
        data.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return ResponseUtil.ok(data);
    }

}
