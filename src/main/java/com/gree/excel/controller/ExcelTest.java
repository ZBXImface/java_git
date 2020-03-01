package com.gree.excel.controller;

import com.alibaba.fastjson.JSONObject;
import com.gree.common.utilis.PoiUtil;
import com.sun.corba.se.impl.oa.poa.POAImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/excel")
public class ExcelTest {
    @Autowired
    private PoiUtil poiUtil;
    @RequestMapping("/getExcel")
    public List<JSONObject> getExcel(){
        return poiUtil.getDataFromExcel();
    }
}
