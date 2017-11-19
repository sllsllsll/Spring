package cn.happy.spring19aspectj01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


/**
 * Created by linlin on 2017/8/2.
 */
@Aspect
public class Aspectj {
 @Before("execution(* *..spring19aspectj01.*.*(..))")
    public void before(){
        System.out.println("=============before");

    }
    public void after(){
        System.out.println("=============after");

    }
}
