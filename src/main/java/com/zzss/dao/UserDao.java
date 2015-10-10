package com.zzss.dao;

import com.zzss.common.BaseDao;
import com.zzss.entity.User;

import java.util.List;

/**
 * Created by shach on 2015/9/15.
 */
public interface UserDao extends BaseDao<User> {


    /**
     * ��֤��ͨ�û���¼
     *
     * @param user
     * @return
     */
    List<User> findUserNameAndPass(User user);

    /**
     * ��֤����Ա��¼
     *
     * @param user
     * @return
     */
    List<User> findAdminNameAndPass(User user);


    /**
     * ע����֤����ѯ�Ƿ��д��û���
     *
     * @param user
     * @return
     */

    int findRegisterName(User user);



    /**
     * ע���û�
     *
     * @param user
     */
    void userRegister(User user);

    /**
     * ��ѯ�����û�
     */
    List<User> findAllUser();


    /**
     * �����û�ID��ѯ�û�
     *
     * @param user
     * @return ����һ���û�����
     */
    User findUserById(User user);

    /**
     * �����û�ID�޸��û�
     *
     * @param user
     */
    void updateUser(User user);

    /**
     * �����û�IDɾ���û�
     *
     * @param user
     */
    void deleteUser(User user);

}
