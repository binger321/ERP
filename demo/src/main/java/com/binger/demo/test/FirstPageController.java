package com.binger.demo.test;

import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/12/9 0009
 * Time: 10:46
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@RestController
public class FirstPageController {
    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name){
//        return "Hello "+name+"!";
        return "{\n" +
                "  \"status\": 1 ,\n" +
                "  \"msg\": \"登录成功\",\n" +
                "  \"data\": \"hello "+name+"\",\n" +
                "  \"page\": null \n" +
                "}";
    }

}