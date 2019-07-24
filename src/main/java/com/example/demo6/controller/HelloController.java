package com.example.demo6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping({"/","login"})
    public String index(Map<String,String> map){
        return "login";
    }

    @RequestMapping("success")
    public String success(Map<String,String> map){
        map.put("hello","你好");
        return "success";
    }

    @RequestMapping("main.html")
    public String main(){
        return "dashboard";
    }

}
