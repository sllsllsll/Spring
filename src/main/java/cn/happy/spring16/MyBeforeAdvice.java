package cn.happy.spring16;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by linlin on 2017/7/31.
 */
public class MyBeforeAdvice implements MethodBeforeAdvice{
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("=========before=======");
    }
}
