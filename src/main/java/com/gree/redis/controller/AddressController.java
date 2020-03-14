package com.gree.redis.controller;

import com.alibaba.fastjson.JSONObject;
import com.gree.redis.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/redis")
@ResponseBody
public class AddressController {
    @Autowired
    private AddressService addressService;
    @RequestMapping("/address")
    JSONObject getAddress(){
        return addressService.getAddress();
    }
}
