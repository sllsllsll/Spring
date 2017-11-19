package cn.happy.spring23tx.dao;

import cn.happy.spring23tx.entity.Account;

/**
 * Created by linlin on 2017/8/4.
 */
public interface IAccountDao {
    public boolean addAccount(Account account);

    public boolean updateAccount(int aid,double money,boolean isBuy);
}
