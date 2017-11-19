package cn.happy.spring03;

import cn.happy.spring22jdbc.entity.Book;
import cn.happy.spring22jdbc.service.IBookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by linlin on 2017/8/2.
 */
public class Test0802 {

    @Test
    public void test02(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext13auto01.xml");
        cn.happy.spring17auto01.IDoSome i=(cn.happy.spring17auto01.IDoSome)ctx.getBean("Idosome");
      i.adTd1();
      i.adTd();
        i.add2();
    }

    @Test
    public void test03(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext14auto02.xml");
        cn.happy.spring18auto02.IDoSome i=(cn.happy.spring18auto02.IDoSome)ctx.getBean("Idosome");
        i.adTd1();
        i.adTd();
        i.add2();
    }

    @Test
    public void test04aspectj(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext15aspectj01.xml");
        cn.happy.spring19aspectj01.IDoSome i=(cn.happy.spring19aspectj01.IDoSome)ctx.getBean("Idosome");
        i.adTd1();
        i.adTd();
        i.add2();
    }
    @Test
    public void test04aspectj02(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext16aspectj02.xml");
        cn.happy.spring20aspectj02.ImyAspectj i=(cn.happy.spring20aspectj02.ImyAspectj)ctx.getBean("Idosome");
      i.delete();
      i.insert();
      i.select();
      i.update();
    }
    @Test
    public void test05aspectjxml(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext17aspectjxml.xml");
        cn.happy.spring21aspectjxml.ImyAspectj i=(cn.happy.spring21aspectjxml.ImyAspectj)ctx.getBean("Idosome");
        i.delete();
        i.insert();
        i.select();
        i.update();
    }

    @Test
    public void test05aspectjjdbc(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext18jdbc.xml");
        IBookService i=(IBookService)ctx.getBean("bookService");
        List<Book> list=i.getList();
        for (Book item:list) {
            System.out.println(item.getBookname());
        }
    }
}
