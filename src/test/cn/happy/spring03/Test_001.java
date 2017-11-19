package cn.happy.spring03;

import cn.happy.spring11.IDoSome;
import cn.happy.spring14.UserException;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linlin on 2017/7/31.
 */
public class Test_001 {

    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext07.xml");
        IDoSome i=(IDoSome)ctx.getBean("someProxy");
        i.add();
        i.add1();
        i.add2();
    }

    @Test
    public void test02(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext08.xml");
        cn.happy.spring12.IDoSome i=(cn.happy.spring12.IDoSome)ctx.getBean("someProxy");
        i.add();
       String id=i.add1();
        System.out.println(id);
        i.add2();
    }

    @Test
    public void test03(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext09.xml");
        cn.happy.spring13.IDoSome i=(cn.happy.spring13.IDoSome)ctx.getBean("someProxy");
        i.add();
        String id=i.add1();
        System.out.println(id);
        i.add2();
    }


    @Test
    public void test04(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext10.xml");
        cn.happy.spring14.IDoSome i=(cn.happy.spring14.IDoSome)ctx.getBean("someProxy");
        try {
            i.add();
        } catch (UserException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test05(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext11.xml");
        cn.happy.spring15.IDoSome i=(cn.happy.spring15.IDoSome)ctx.getBean("someProxy");
         i.add2();
         i.add1();
         i.add();
    }

    @Test
    public void test06(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext12.xml");
        cn.happy.spring16.IDoSome i=(cn.happy.spring16.IDoSome)ctx.getBean("someProxy");
        i.add2();
      i.adTd();
      i.adTd1();
    }
}
