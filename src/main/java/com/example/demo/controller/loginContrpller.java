package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by ${chengbin.gu} on 2019/6/25.
 */
@RestController
public class loginContrpller {

    @Resource
    @RequestMapping(value = "/login",method = get )
    private indexServiceImol indexService;

    public String login(){
        if (indexCheck()){
            return "succeed";
        }else{
            return "error";
        }
    }
}
