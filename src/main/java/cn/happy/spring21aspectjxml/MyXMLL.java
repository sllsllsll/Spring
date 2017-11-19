package cn.happy.spring21aspectjxml;

import org.aspectj.lang.JoinPoint;

/**
 * Created by linlin on 2017/8/2.
 */
public class MyXMLL {
    public void before(){
        System.out.println("===========before");
    }
    public void after(JoinPoint jp){

        System.out.println("=========after");
        System.out.println("===="+jp);
    }
}
