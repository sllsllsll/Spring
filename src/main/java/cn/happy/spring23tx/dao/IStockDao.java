package cn.happy.spring23tx.dao;

import cn.happy.spring23tx.entity.Stock;

/**
 * Created by linlin on 2017/8/4.
 */
public interface IStockDao {

    public boolean addStock(Stock stock);

    public boolean updateStock(int sid,double count,boolean isBuy);
}
