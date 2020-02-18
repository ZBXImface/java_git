package com.gree.book.controller;

import com.alibaba.fastjson.JSONObject;
import com.gree.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping(value = "/getBookInfoById",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getBookInfoById(@RequestParam("bookId") Integer bookId){
        return bookService.getBookInfoById(bookId);
    }
    @RequestMapping("/getBookInfo")
    @ResponseBody
    public List<JSONObject> getBookInfo(){
        return bookService.getBookInfo();
    }
}
