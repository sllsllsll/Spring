package cn.happy.spring03;

import cn.happy.spring24.entity.Book;
import cn.happy.spring24.service.IBookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linlin on 2017/8/7.
 */
public class Test0807 {

    @Test
    public void test01() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext20smm24.xml");
        IBookService i=(IBookService)ctx.getBean("bookService");
        Book b=new Book();
        b.setBookname("haha");
        b.setBookprice(12);
        i.addBook(b);

    }
}
