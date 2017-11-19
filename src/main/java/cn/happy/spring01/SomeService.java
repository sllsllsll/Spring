package cn.happy.spring01;

/**
 * Created by linlin on 2017/7/24.
 */
public class SomeService {
    private String info;
    public void work(){
        System.out.println("Hello"+info);
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
