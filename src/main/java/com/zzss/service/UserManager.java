package com.zzss.service;

import com.zzss.entity.User;

import java.util.List;

/**
 * Created by shach on 2015/9/15.
 */
public interface UserManager {

    // ��¼ʧ��
    public static final int LOGIN_FAIL = 0;
    // ����ͨ�û���¼
    public static final int LOGIN_USER = 1;
    // �Թ���Ա��¼
    public static final int LOGIN_ADMIN = 2;

    /**
     * ��¼��֤
     *
     * @param user ����user����
     * @return ������Ӧ��ֵ��0Ϊ��¼ʧ�ܣ�1Ϊ��ͨ�û���2Ϊ����Ա��¼
     */
    int validLogin(User user);

    /**
     * ע���û�
     *
     * @param user ����user����
     * @return ������Ӧ��ֵ��0����ʧ�ܣ�1����ɹ�
     */
    int validregister(User user);


    /**
     * ��ѯ�����û�
     */
    List<User> findAllUser();

    /**
     * �����û�IDȥ��ѯ�û�
     *
     * @param user
     * @return �����û�����
     */
    User findUserById(User user);

    /**
     * ����ID�޸��û�
     *
     * @param user
     * @return �޷��ؽ��
     */
    void updateUser(User user);

    /**
     * ����IDɾ���û�
     *
     * @param user
     */
    void deleteUser(User user);

}
