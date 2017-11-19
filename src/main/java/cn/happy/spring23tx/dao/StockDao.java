package cn.happy.spring23tx.dao;

import cn.happy.spring23tx.entity.Stock;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by linlin on 2017/8/4.
 */
public class StockDao extends JdbcDaoSupport implements IStockDao {
    public boolean addStock(Stock stock) {
        return false;
    }

    public boolean updateStock(int sid, double count, boolean isBuy) {
        boolean flag=false;
        String sql=null;
        if(isBuy){
            sql="update Stock set count=count+? where sid=?";
        }else{
            sql="update Stock set count=count-? where sid=?";
        }
        int count1=this.getJdbcTemplate().update(sql,count,sid);
        if(count1>0){
            flag=true;
        }
        return flag;
    }
}
