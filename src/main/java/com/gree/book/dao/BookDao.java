package com.gree.book.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {
    JSONObject getBookInfoById(Integer bookId);
    List<JSONObject> getBookInfo();
}
