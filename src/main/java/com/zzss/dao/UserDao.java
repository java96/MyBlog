package com.zzss.dao;

import com.zzss.common.BaseDao;
import com.zzss.entity.User;

import java.util.List;

/**
 * Created by shach on 2015/9/15.
 */
public interface UserDao extends BaseDao<User> {


    /**
     * 验证普通用户登录
     *
     * @param user
     * @return
     */
    List<User> findUserNameAndPass(User user);

    /**
     * 验证管理员登录
     *
     * @param user
     * @return
     */
    List<User> findAdminNameAndPass(User user);


    /**
     * 注册验证，查询是否有此用户名
     *
     * @param user
     * @return
     */

    int findRegisterName(User user);



    /**
     * 注册用户
     *
     * @param user
     */
    void userRegister(User user);

    /**
     * 查询所有用户
     */
    List<User> findAllUser();


    /**
     * 根据用户ID查询用户
     *
     * @param user
     * @return 返回一个用户对象
     */
    User findUserById(User user);

    /**
     * 根据用户ID修改用户
     *
     * @param user
     */
    void updateUser(User user);

    /**
     * 根据用户ID删除用户
     *
     * @param user
     */
    void deleteUser(User user);

}
