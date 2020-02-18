package com.gree.book.service;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface BookService {
    /*通过图书id获取图书信息*/
    public JSONObject getBookInfoById(Integer bookId);
    /*获取所有有效图书信息*/
    public List<JSONObject> getBookInfo();
}
