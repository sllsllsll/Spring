package cn.happy.spring24.service;

import cn.happy.spring24.dao.IBookDao;
import cn.happy.spring24.entity.Book;

/**
 * Created by linlin on 2017/8/7.
 */
public class IBookServiceImpl implements IBookService {
     IBookDao dao;
    public int addBook(Book book) {
        return dao.addBook(book);
    }
    public IBookDao getDao() {
        return dao;
    }

    public void setDao(IBookDao dao) {
        this.dao = dao;
    }
}
