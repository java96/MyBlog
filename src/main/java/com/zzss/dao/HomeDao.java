package com.zzss.dao;

import com.zzss.common.PageBean;
import com.zzss.entity.Home;

import java.util.List;

/**
 * Created by songs on 2015/10/10.
 */
public interface HomeDao {

    //    �����ҳ���£���̨��
    void addHome(Home home);

    //    ��ѯ����
    List<Home> findAll();

    //    ����ID��ѯ��¼
    Home findById(Home home);

    //    �޸���ҳ���£���̨��
    void updateHome(Home home);

    //      ɾ����ҳ���£���̨��
    void deleteHome(Home home);

    //    ��ѯ���£�ǰ�󣩷�ҳ
    PageBean<Home> queryHome(int pc, int ps);

    //    ǰ̨��ʾ��������־����
    List<Home> receptionNewHome();

    //    ǰ̨��ʾ�������־����
    List<Home> receptionClickHome();

    //   ��������
    void clickHome();
}
