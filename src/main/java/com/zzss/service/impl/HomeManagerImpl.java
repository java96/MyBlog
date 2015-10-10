package com.zzss.service.impl;

import com.zzss.common.PageBean;
import com.zzss.dao.HomeDao;
import com.zzss.entity.Home;
import com.zzss.service.HomeManager;

import java.util.Date;
import java.util.List;

/**
 * Created by songs on 2015/10/10.
 */
public class HomeManagerImpl implements HomeManager {
    //������������Dao
    private HomeDao homeDao;

    public void setHomeDao(HomeDao homeDao) {
        this.homeDao = homeDao;
    }

    //    �����ҳ���£���̨��
    public void addHome(Home home) {
        home.setHomeTime(new Date());
        homeDao.addHome(home);

    }

    //      ��ѯ����(��̨)
    public List<Home> findAll() {
        return homeDao.findAll();
    }

    //    ����ID��ѯ��¼
    public Home findById(Home home) {
        return homeDao.findById(home);
    }

    //    �޸���ҳ���£���̨��
    public void updateHome(Home home) {
        homeDao.updateHome(home);
    }

    //      ɾ����ҳ���£���̨��
    public void deleteHome(Home home) {
        homeDao.deleteHome(home);
    }

    //    ��ѯ���£�ǰ�󣩷�ҳ
    public PageBean<Home> queryHome(int pc, int ps) {
        return homeDao.queryHome(pc, ps);
    }

    //    ǰ̨��ʾ��������־����
    public List<Home> receptionNewHome() {
        return homeDao.receptionNewHome();
    }

    //    ǰ̨��ʾ�������־����
    public List<Home> receptionClickHome() {
        return homeDao.receptionClickHome();
    }


}
