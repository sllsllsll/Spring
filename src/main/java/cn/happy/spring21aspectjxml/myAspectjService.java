package cn.happy.spring21aspectjxml;



/**
 * Created by linlin on 2017/8/2.
 */
public class myAspectjService implements ImyAspectj  {
    public void insert() {
        System.out.println("insert");
    }

    public void update() {
      /*  int r=5/0;*/
        System.out.println("update");
    }
    public void delete() {

        System.out.println("delete");
    }

    public void select() {
        System.out.println("select");
    }
}
