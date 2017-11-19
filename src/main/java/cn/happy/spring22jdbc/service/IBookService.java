package cn.happy.spring22jdbc.service;

import cn.happy.spring22jdbc.entity.Book;

import java.util.List;

/**
 * Created by linlin on 2017/8/2.
 */
public interface IBookService {
    public List<Book> getList();
}
