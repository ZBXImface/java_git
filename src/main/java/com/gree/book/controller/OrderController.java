package com.gree.book.controller;

import com.alibaba.fastjson.JSONObject;
import com.sun.media.sound.JARSoundbankReader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @RequestMapping("/getOrderDetailsById")
    public JSONObject getOrderDetailsById(){
        return null;
    }
    @RequestMapping("/getOrderId")
    public JSONObject gtOrderId(){
        return null;
    }
}
