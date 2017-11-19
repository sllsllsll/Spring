package cn.happy.spring02;

import cn.happy.spring05.Coll;
import cn.happy.spring05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linlin on 2017/7/26.
 */
public class Spring05XML {
    @Test
   public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05DIXML.xml");
        Student s = (Student) ctx.getBean("stu");
        System.out.println(s);
    }
    @Test
    public void test01p(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05DIXML.xml");
        Student s = (Student) ctx.getBean("stu2");
        System.out.println(s);
    }
    @Test
    public void test01coll(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05DIXML.xml");
        Coll c=(Coll)ctx.getBean("array");
        System.out.println(c.getNames());
    }
    @Test
    public void test01colllist(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05DIXML.xml");
        Coll c=(Coll)ctx.getBean("list");
        System.out.println(c.getList());
    }
    @Test
    public void test01collset(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05DIXML.xml");
        Coll c=(Coll)ctx.getBean("set");
        System.out.println(c.getSet());
    }
    @Test
    public void test01collmap(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05DIXML.xml");
        Coll c=(Coll)ctx.getBean("map");
        System.out.println(c.getMap());
    }
    @Test
    public void test01collpro(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05DIXML.xml");
        Coll c=(Coll)ctx.getBean("properties");
        System.out.println(c.getProperties());
    }
}
