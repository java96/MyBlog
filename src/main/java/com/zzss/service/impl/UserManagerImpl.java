package com.zzss.service.impl;

import com.zzss.dao.UserDao;
import com.zzss.entity.User;
import com.zzss.service.UserManager;

import java.util.Date;
import java.util.List;

/**
 * Created by shach on 2015/9/15.
 */
public class UserManagerImpl implements UserManager {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 用户登录逻辑处理
     *
     * @param user 传入user对象
     * @return
     */
    public int validLogin(User user) {
        //    查询普通用户，值如果大于0表示登录成功
        if (userDao.findUserNameAndPass(user).size() >= 1) {
            return LOGIN_USER;

        }
        //    查询管理员，值如果大于0表示登录成功
        else if (userDao.findAdminNameAndPass(user).size() >= 1) {
            return LOGIN_ADMIN;
        }
        //       什么也没查询到返回失败
        else {
            return LOGIN_FAIL;
        }
    }

    /**
     * 用户注册逻辑处理
     *
     * @param user 传入user对象
     * @return
     */

    public int validregister(User user) {

        //首先判断数据库中是否存在该用户，如果等于0表示用户名不存在，执行语句
        if (userDao.findRegisterName(user) == 0) {
            userDao.userRegister(user);
            return 1;
        }
        return 0;
    }

    /**
     * 查询所有用户
     *
     * @return 返回查询所查询结果
     */
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    /**
     * 根据用户ID查询用户
     *
     * @param user
     * @return 返回用户
     */
    public User findUserById(User user) {
        return userDao.findUserById(user);
    }

    /**
     * 根据ID修改用户
     *
     * @param user
     */
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    /**
     * 根据ID删除用户
     *
     * @param user
     */
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }



}
