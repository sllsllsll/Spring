package cn.happy.spring23tx.dao;

import cn.happy.spring23tx.entity.Account;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by linlin on 2017/8/4.
 */
public class AccountDao extends JdbcDaoSupport implements IAccountDao{
    public boolean addAccount(Account account) {
        return false;
    }

    public boolean updateAccount(int aid, double money,boolean isBuy) {
            boolean flag=false;
            String sql=null;
            if(isBuy){
                sql="update Account set balance=balance-? where aid=?";
            }else{
                sql="update Account set balance=balance+? where aid=?";
            }
            int count1=this.getJdbcTemplate().update(sql,money,aid);
            if(count1>0){
                flag=true;
            }
            return flag;

    }
}
