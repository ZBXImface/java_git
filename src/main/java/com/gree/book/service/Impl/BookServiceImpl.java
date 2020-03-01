package com.gree.book.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.gree.book.dao.BookDao;
import com.gree.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;
    @Override
    public JSONObject getBookInfoById(Integer bookId) {
        return bookDao.getBookInfoById(bookId);
    }

    @Override
    public List<JSONObject> getBookInfo() {
        return bookDao.getBookInfo();
    }
}
