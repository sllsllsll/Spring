package cn.happy.spring08staticproxy;

/**
 * Created by linlin on 2017/7/31.
 */
public class RealSubject implements Subject {
    public void request() {
        System.out.println("request");
    }
}
