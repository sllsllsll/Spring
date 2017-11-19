package cn.happy.spring20aspectj02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by linlin on 2017/8/2.
 */
@Aspect
public class MyAspectj {
    @Pointcut("execution(* *..spring20aspectj02.*.*(..))")
    private void insert(){};

    @Pointcut("execution(* *..spring20aspectj02.*.*(..))")
    private void update(){};
    @Pointcut("execution(* *..spring20aspectj02.*.*(..))")
    private void delete(){

    };

  /*  @Before("insert()||update()||delete()")
    public void before(){

        System.out.println("==============before=====");
    }*/

  /* @AfterReturning("execution(* *..spring20aspectj02.*.*(..))")
    public void after(){

        System.out.println("==============after=====");
    }*/
  /*  @Around("execution(* *..spring20aspectj02.*.*(..))")
    public void arount(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("========before======");
        pjp.proceed();
        System.out.println("==============after=====");
    }*/

 /* @AfterThrowing("execution(* *..spring20aspectj02.*.*(..))")
  public void throwing(){
      System.out.println("==============出错=====");
  }*/

@After("execution(* *..spring20aspectj02.*.*(..))")
  public void after(){

      System.out.println("==============最终增强=====");
  }
}
