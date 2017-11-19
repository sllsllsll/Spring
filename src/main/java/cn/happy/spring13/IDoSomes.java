package cn.happy.spring13;

/**
 * Created by linlin on 2017/7/31.
 */
public class IDoSomes implements IDoSome {
    public void add() {
        System.out.println("=========1=======");
    }
    public String add1() {
        System.out.println("=========2=======");
        return "呵呵abc";
    }

    public void add2() {
        System.out.println("=========3=======");
    }

}
