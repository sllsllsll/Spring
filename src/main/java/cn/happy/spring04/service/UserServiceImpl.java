package cn.happy.spring04.service;

import cn.happy.spring04.dao.IUserDAO;
import cn.happy.spring04.entity.User;

/**
 * Created by linlin on 2017/7/24.
 */
public class UserServiceImpl implements IUserService{
    private IUserDAO dao;
    //主业务
    public void save2(User user) {
        dao.save(user);
    }

    public IUserDAO getDao() {
        return dao;
    }

    public void setDao(IUserDAO dao) {
        this.dao = dao;
    }
}
