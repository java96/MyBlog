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
     * �û���¼�߼�����
     *
     * @param user ����user����
     * @return
     */
    public int validLogin(User user) {
        //    ��ѯ��ͨ�û���ֵ�������0��ʾ��¼�ɹ�
        if (userDao.findUserNameAndPass(user).size() >= 1) {
            return LOGIN_USER;

        }
        //    ��ѯ����Ա��ֵ�������0��ʾ��¼�ɹ�
        else if (userDao.findAdminNameAndPass(user).size() >= 1) {
            return LOGIN_ADMIN;
        }
        //       ʲôҲû��ѯ������ʧ��
        else {
            return LOGIN_FAIL;
        }
    }

    /**
     * �û�ע���߼�����
     *
     * @param user ����user����
     * @return
     */

    public int validregister(User user) {

        //�����ж����ݿ����Ƿ���ڸ��û����������0��ʾ�û��������ڣ�ִ�����
        if (userDao.findRegisterName(user) == 0) {
            userDao.userRegister(user);
            return 1;
        }
        return 0;
    }

    /**
     * ��ѯ�����û�
     *
     * @return ���ز�ѯ����ѯ���
     */
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    /**
     * �����û�ID��ѯ�û�
     *
     * @param user
     * @return �����û�
     */
    public User findUserById(User user) {
        return userDao.findUserById(user);
    }

    /**
     * ����ID�޸��û�
     *
     * @param user
     */
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    /**
     * ����IDɾ���û�
     *
     * @param user
     */
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }



}
