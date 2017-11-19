package cn.happy.spring23tx.service;

import cn.happy.spring23tx.dao.IAccountDao;
import cn.happy.spring23tx.dao.IStockDao;
import cn.happy.spring23tx.entity.Account;
import cn.happy.spring23tx.entity.Stock;
import cn.happy.spring23tx.entity.StockExection;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by linlin on 2017/8/4.
 */
public class ServiceImpl implements IService{

    private IAccountDao accountDao;
    private IStockDao stockDao;

    public IAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public IStockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(IStockDao stockDao) {
        this.stockDao = stockDao;
    }

    public boolean addAccount(Account account) {
        return false;
    }

    public boolean addStock(Stock stock) {
        return false;
    }
  /*   @Transactional(rollbackFor =StockExection.class )*/
    public void buyStock(int sid, int count, int aid, double money) throws StockExection {
        boolean isBuy=true;
        accountDao.updateAccount(aid,money,isBuy);
        if(1==1){
            throw new StockExection();
        }
        stockDao.updateStock(sid,count,isBuy);
    }

}
