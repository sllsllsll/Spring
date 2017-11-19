package cn.happy.spring03;

import cn.happy.spring08staticproxy.ProxySubject;
import cn.happy.spring08staticproxy.RealSubject;
import cn.happy.spring08staticproxy.Subject;
import cn.happy.spring09jdkproxy.ISome;
import cn.happy.spring09jdkproxy.Some;
import cn.happy.spring10cglibproxy.SomeService;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by linlin on 2017/7/31.
 */
public class Test_Proxy {

    @Test
    public void test(){
        ProxySubject proxys=new ProxySubject();
Subject sub=new RealSubject();
proxys.setSubject(sub);
proxys.request();
    }
    @Test
public void testjdk(){
       final ISome s=new Some();
        ISome proxy=(ISome) Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("==============================before=======");
           Object result=method.invoke(s,args);
                return result;
            }
        });
String r=proxy.str();
       System.out.println(r);
    }


    @Test
    public void testcglib(){
        Enhancer enhancer=new Enhancer();
        final SomeService ser=new SomeService();
        enhancer.setSuperclass(ser.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("======cglib===");
                methodProxy.invoke(ser,objects);
                return null;
            }
        });
    SomeService proxy=(SomeService)enhancer.create();
    proxy.doSome();
    }
}
