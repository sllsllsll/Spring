package cn.happy.spring01;

import cn.happy.spring02.Student;
import cn.happy.spring03.printer.Print;
import cn.happy.spring04.aop.LoggerBeforeAdvice;
import cn.happy.spring04.dao.UserDAOImpl;
import cn.happy.spring04.entity.User;
import cn.happy.spring04.service.IUserService;
import cn.happy.spring04.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linlin on 2017/7/24.
 */
public class SomeServiceTest {

    @Test
    public void Spring1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService service=(SomeService)ctx.getBean("someService");
        SomeService service1=(SomeService)ctx.getBean("someService");
        System.out.println(service);
        System.out.println(service1);
       /* service.setInfo("Spring");
        service.work();*/

    }
    @Test
    public void Spring2(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s=(Student)ctx.getBean("stu");
        System.out.println(s);

    }

    @Test
    public void Spring3(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Print p=(Print)ctx.getBean("pp");
        System.out.println(p.getInk().inkcolor());
        System.out.println(p.getP().Apaper());
        System.out.println(p);

    }
    @Test
    public void Spring4(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext04aop.xml");
        IUserService userService=(IUserService)ctx.getBean("userService");
        User u=new User();
        u.setUsername("小傻瓜");
        userService.save2(u);
    }
}
