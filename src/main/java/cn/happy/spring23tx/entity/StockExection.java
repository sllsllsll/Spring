package cn.happy.spring23tx.entity;

/**
 * Created by linlin on 2017/8/4.
 */
public class StockExection extends Exception {
    public StockExection() {
        super();
    }

    public StockExection(String message) {
        super(message);
    }
}
