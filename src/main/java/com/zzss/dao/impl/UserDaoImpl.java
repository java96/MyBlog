package com.zzss.dao.impl;

import com.zzss.common.impl.BaseDaoImpl;
import com.zzss.dao.UserDao;
import com.zzss.entity.User;

import java.util.Date;
import java.util.List;

/**
 * Created by shach on 2015/9/15.
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    //普通用户登录查询
    public List<User> findUserNameAndPass(User user) {
        return find("select u.username,u.password from User u  where  u.judge=0 and u.username=?0 and u.password = ?1",
                user.getUsername(), user.getPassword());
    }

    //管理员用户登录查询
    public List<User> findAdminNameAndPass(User user) {
        return find("select u.username,u.password from User u  where  u.judge=1 and u.username=?0 and u.password = ?1",
                user.getUsername(), user.getPassword());
    }

    //注册用户名查询
    public int findRegisterName(User user) {

        return find("select u.username from User u where u.username=?0", user.getUsername()).size();

    }

    //注册用户
    public void userRegister(User user) {
        user.setJudge('0');
        user.setRegisterTime(new Date());
        save(user);
    }

    //查询所有用户
    public List<User> findAllUser() {
        return findAll(User.class);
    }

    //根据用户ID查询用户
    public User findUserById(User user) {
        return get(User.class, user.getId());
    }

    //根据用户ID修改用户
    public void updateUser(User user) {
        update(user);
    }

    //根据用户ID删除用户
    public void deleteUser(User user) {
        delete(User.class, user.getId());
    }

}
