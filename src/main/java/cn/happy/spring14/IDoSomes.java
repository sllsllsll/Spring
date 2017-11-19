package cn.happy.spring14;

/**
 * Created by linlin on 2017/7/31.
 */
public class IDoSomes implements IDoSome {
    public void add() throws UserException {
        System.out.println("=========1=======");
        throw new UserException("总算有错了");
    }
    public String add1() {
        System.out.println("=========2=======");
        return "呵呵abc";
    }

    public void add2() {
        System.out.println("=========3=======");
    }

}
