package cn.happy.spring03;

import cn.happy.spring23tx.entity.StockExection;
import cn.happy.spring23tx.service.IService;
import cn.happy.spring23tx.service.ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linlin on 2017/8/4.
 */
public class Test0804 {
    @Test
    public void test01() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext19tx.xml");
        IService i=(IService)ctx.getBean("service");
        try {
            i.buyStock(1,2,1,1000);
        } catch (StockExection stockExection) {
            stockExection.printStackTrace();
        }
    }
}
