package com.zzss.dao.impl;

import com.zzss.common.PageBean;
import com.zzss.common.impl.BaseDaoImpl;
import com.zzss.dao.HomeDao;
import com.zzss.entity.Home;

import java.util.Date;
import java.util.List;

/**
 * Created by songs on 2015/10/10.
 */
public class HomeDaoImpl extends BaseDaoImpl<Home> implements HomeDao {


    //    �����ҳ���£���̨��
    public void addHome(Home home) {
        save(home);
    }

    //      ��ѯ����
    public List<Home> findAll() {
        return findAll(Home.class);
    }

    //    ����ID��ѯ��¼
    public Home findById(Home home) {
        return get(Home.class, home.getId());
    }

    //    �޸���ҳ���£���̨��
    public void updateHome(Home home) {
        update(home);
    }


    //      ɾ����ҳ���£���̨��
    public void deleteHome(Home home) {
        delete(Home.class, home.getId());
    }

    //    ��ѯ���£�ǰ�󣩷�ҳ
    public PageBean<Home> queryHome(int pc, int ps) {
        PageBean<Home> pageBean = new PageBean<Home>();

        pageBean.setPc(pc);
        pageBean.setPs(ps);
        int tr = (int) findCount(Home.class);
        pageBean.setTr(tr);
        String hql = "select hl from Home hl order by hl.homeLevel desc";
        List<Home> homes = findByPage(hql, pc, ps);
        pageBean.setBeanList(homes);
        return pageBean;
    }

    //    ǰ̨��ʾ��������־����
    public List<Home> receptionNewHome() {
        String hql = "select hr from Home hr order by hr.homeTime desc";
        return findByPage(hql, 0, 8);
    }

    //    ǰ̨��ʾ�������־����
    public List<Home> receptionClickHome() {
        String hql = "select rc from Home rc order by rc.homeClick desc";
        return findByPage(hql, 0, 5);
    }

    //   ��������
    public void clickHome() {
        click("update Home set homeClick = homeClick + 1");
    }

}
