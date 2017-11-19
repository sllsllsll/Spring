package cn.happy.spring14;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by linlin on 2017/7/31.
 */
public class MyThrowsAdvice implements ThrowsAdvice{
    public void afterThrowing(UserException ex){
        System.out.println("错误提示："+ex.getMessage());
    }

}
