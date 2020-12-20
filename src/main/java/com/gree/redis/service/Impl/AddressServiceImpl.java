package com.gree.redis.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.gree.redis.dao.AddressDao;
import com.gree.redis.entity.Address;
import com.gree.redis.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

import static com.gree.common.utilis.JsonUtilis.ErrorJSON;
import static com.gree.common.utilis.JsonUtilis.SuccessJSON;

@Service
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressDao addressDao;
    @Override
    public JSONObject getAddress() {
        try{
            return SuccessJSON(100,"获取成功",addressDao.getAddress());
        }
        catch (Exception e){
            return ErrorJSON(502,"获取失败");
        }
    }

    @Override
    public JSONObject getNewName(String userId) {
        if (userId!=null){
            System.out.println("参数正常");
            return null;
        }else{
            System.out.println("参数错误");
            return null;
        }
    }
}
