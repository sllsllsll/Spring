package cn.happy.spring22jdbc.dao.impl;

import cn.happy.spring22jdbc.dao.IBookDao;
import cn.happy.spring22jdbc.entity.Book;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by linlin on 2017/8/2.
 */
public class BookDaoImpl extends JdbcDaoSupport implements IBookDao{

    public List<Book> getList() {
        String sql="select * from book";
       List<Book> list=this.getJdbcTemplate().query(sql, new RowMapper<Book>() {
           public Book mapRow(ResultSet rs, int i) throws SQLException {
               Book book=new Book();
               book.setBookid(rs.getInt("bookid"));
              book.setBookname(rs.getString("bookname"));
              book.setBookprice(rs.getInt("bookprice"));
               return book;
           }
       });
       return list;
    }
}
