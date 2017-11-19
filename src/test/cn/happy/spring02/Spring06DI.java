package cn.happy.spring02;

import cn.happy.spring06.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linlin on 2017/7/26.
 */
public class Spring06DI {
    @Test
   public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext06XML.xml");
        Stu s = (Stu) ctx.getBean("stu");
        System.out.println(s.getName());
    }

}
