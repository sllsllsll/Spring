package cn.happy.spring23tx.entity;

/**
 * Created by linlin on 2017/8/4.
 */
public class Account {
    private int aid; //
    private String aname; //
    private double balance; //

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
