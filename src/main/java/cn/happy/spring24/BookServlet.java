package cn.happy.spring24;

import cn.happy.spring24.entity.Book;
import cn.happy.spring24.service.IBookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.IOException;

/**
 * Created by linlin on 2017/8/7.
 */
public class BookServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String bookname=request.getParameter("bookName");
        int bookprice=Integer.parseInt(request.getParameter("bookPrice"));

        Book book =new Book();
        book.setBookprice(bookprice);
        book.setBookname(bookname);
 /*    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext20smm24.xml");*/

        WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        System.out.println("ctx="+ctx);
        IBookService i=(IBookService)ctx.getBean("bookService");
        i.addBook(book);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
doPost(request,response);
    }
}
