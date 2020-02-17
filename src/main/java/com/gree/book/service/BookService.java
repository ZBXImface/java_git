package com.gree.book.service;

import com.alibaba.fastjson.JSONObject;

public interface BookService {
    /*通过图书id获取图书信息*/
    public JSONObject getBookInfoById(Integer bookId);
}
