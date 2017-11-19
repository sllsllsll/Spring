package cn.happy.spring04.dao;

import cn.happy.spring04.entity.User;

/**
 * Created by linlin on 2017/7/24.
 */
public class UserDAOImpl implements IUserDAO {
    public void save(User user) {
        System.out.println("save success!");
    }
}
