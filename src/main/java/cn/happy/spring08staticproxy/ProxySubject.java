package cn.happy.spring08staticproxy;

/**
 * Created by linlin on 2017/7/31.
 */
public class ProxySubject implements Subject{
private Subject subject;
    public void request() {
        System.out.println("================before=============");
        subject.request();
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
