package com.imooc.weixing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//@ResponseBody + @Controller:即此类中所有的方法都是ResponseBody()模式
public class hello {

    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String hello(){
        return "hello SptringBoot";
    }
}
