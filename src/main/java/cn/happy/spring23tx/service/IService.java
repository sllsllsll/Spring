package cn.happy.spring23tx.service;

import cn.happy.spring23tx.entity.Account;
import cn.happy.spring23tx.entity.Stock;
import cn.happy.spring23tx.entity.StockExection;

/**
 * Created by linlin on 2017/8/4.
 */
public interface IService {

    public boolean addAccount(Account account);
    public boolean addStock(Stock stock);
    public void buyStock(int sid,int count,int aid,double money) throws StockExection;
}
