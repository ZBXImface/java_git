package com.gree.book.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.gree.book.dao.BookDao;
import com.gree.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public JSONObject getBookInfoById(Integer bookId) {
        return bookDao.getBookInfoById(bookId);
    }
}
