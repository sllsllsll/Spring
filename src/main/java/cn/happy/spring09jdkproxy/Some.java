package cn.happy.spring09jdkproxy;

/**
 * Created by linlin on 2017/7/31.
 */
public class Some implements ISome{
    public String str() {
        System.out.println("str");
return "proxy";
    }
}
