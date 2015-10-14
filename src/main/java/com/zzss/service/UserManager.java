package com.zzss.service;

import com.zzss.entity.User;

import java.util.List;

/**
 * Created by shach on 2015/9/15.
 */
public interface UserManager {

    // 登录失败
    public static final int LOGIN_FAIL = 0;
    // 以普通用户登录
    public static final int LOGIN_USER = 1;
    // 以管理员登录
    public static final int LOGIN_ADMIN = 2;

    /**
     * 登录验证
     *
     * @param user 传入user对象
     * @return 返回相应的值，0为登录失败，1为普通用户，2为管理员登录
     */
    int validLogin(User user);

    /**
     * 注册用户
     *
     * @param user 传入user对象
     * @return 返回相应的值，0代表失败，1代表成功
     */
    int validregister(User user);


    /**
     * 查询所有用户
     */
    List<User> findAllUser();

    /**
     * 根据用户ID去查询用户
     *
     * @param user
     * @return 返回用户对象
     */
    User findUserById(User user);

    /**
     * 根据ID修改用户
     *
     * @param user
     * @return 无返回结果
     */
    void updateUser(User user);

    /**
     * 根据ID删除用户
     *
     * @param user
     */
    void deleteUser(User user);

}
