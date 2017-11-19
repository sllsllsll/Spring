package cn.happy.spring22jdbc.entity;

/**
 * Created by linlin on 2017/8/2.
 */
public class Book {
    private int bookid;
    private String bookname;
    private int bookprice;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookprice() {
        return bookprice;
    }

    public void setBookprice(int bookprice) {
        this.bookprice = bookprice;
    }
}
