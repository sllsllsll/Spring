package cn.happy.spring13;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by linlin on 2017/7/31.
 */
public class MethodAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("之前============");
       Object result=methodInvocation.proceed();
       String temp=null;
       if(result!=null){
           temp=(String)result;
           temp=temp.toUpperCase();
       }
        System.out.println("之后================");
        System.out.println("======temp========="+temp);
        return temp;
    }
}
