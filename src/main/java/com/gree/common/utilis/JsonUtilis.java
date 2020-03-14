package com.gree.common.utilis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonUtilis {
    public static JSONObject SuccessJSON(Integer returnCode, String returnMsg, Object returnData){
        Map<String,Object> returnMap=new HashMap<>();
        returnMap.put("returnCode",returnCode);
        returnMap.put("returnMsg",returnMsg);
        returnMap.put("returnData",returnData);
        return JSONObject.parseObject(JSONObject.toJSONString(returnMap));
    }
    public static JSONObject ErrorJSON(Integer returnCode,String returnMsg,Object returnData){
        Map<String,Object> returnMap=new HashMap<>();
        returnMap.put("returnCode",returnCode);
        returnMap.put("returnMsg",returnMsg);
        returnMap.put("returnData",returnData);
        return JSONObject.parseObject(JSONObject.toJSONString(returnMap));
    }
    public static JSONObject ErrorJSON(Integer returnCode,String returnMsg){
        Map<String,Object> returnMap=new HashMap<>();
        returnMap.put("returnCode",returnCode);
        returnMap.put("returnMsg",returnMsg);
        return JSONObject.parseObject(JSONObject.toJSONString(returnMap));
    }
}
