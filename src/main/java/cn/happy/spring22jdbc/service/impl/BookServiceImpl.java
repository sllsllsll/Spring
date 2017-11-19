package cn.happy.spring22jdbc.service.impl;

import cn.happy.spring22jdbc.dao.IBookDao;
import cn.happy.spring22jdbc.entity.Book;
import cn.happy.spring22jdbc.service.IBookService;

import java.util.List;

/**
 * Created by linlin on 2017/8/2.
 */
public class BookServiceImpl implements IBookService{
    private IBookDao dao;
    public List<Book> getList() {
        return dao.getList();
    }

    public IBookDao getDao() {
        return dao;
    }

    public void setDao(IBookDao dao) {
        this.dao = dao;
    }
}
