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
    //��ͨ�û���¼��ѯ
    public List<User> findUserNameAndPass(User user) {
        return find("select u.username,u.password from User u  where  u.judge=0 and u.username=?0 and u.password = ?1",
                user.getUsername(), user.getPassword());
    }

    //����Ա�û���¼��ѯ
    public List<User> findAdminNameAndPass(User user) {
        return find("select u.username,u.password from User u  where  u.judge=1 and u.username=?0 and u.password = ?1",
                user.getUsername(), user.getPassword());
    }

    //ע���û�����ѯ
    public int findRegisterName(User user) {

        return find("select u.username from User u where u.username=?0", user.getUsername()).size();

    }

    //ע���û�
    public void userRegister(User user) {
        user.setJudge('0');
        user.setRegisterTime(new Date());
        save(user);
    }

    //��ѯ�����û�
    public List<User> findAllUser() {
        return findAll(User.class);
    }

    //�����û�ID��ѯ�û�
    public User findUserById(User user) {
        return get(User.class, user.getId());
    }

    //�����û�ID�޸��û�
    public void updateUser(User user) {
        update(user);
    }

    //�����û�IDɾ���û�
    public void deleteUser(User user) {
        delete(User.class, user.getId());
    }

}
