package com.example.imall.controller;

import com.example.imall.bean.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/auth")
public class AdminAuthController {

    @RequestMapping("/login")
    public ResponseData login(){
        // TODO ? 泛型的省略
        ResponseData responseData = new ResponseData();
        responseData.setErrno(0);
        responseData.setErrmsg("成功");
        responseData.setData("96e50b56-108a-4335-b110-7c194dca3f9c");
        return responseData;
    }

//    TODO ？ 这个接口的意义
    @RequestMapping("/info")
    public String info(){
        return "{\"errno\":0,\"data\":{\"roles\":[\"超级管理员\"],\"name\":\"admin123\",\"perms\":[\"*\"],\"avatar\":\"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif\"},\"errmsg\":\"成功\"}";
    }

}
