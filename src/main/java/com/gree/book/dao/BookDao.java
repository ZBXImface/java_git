package com.gree.book.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao {
    JSONObject getBookInfoById(Integer bookId);
}
