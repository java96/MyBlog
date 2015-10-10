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
    //设置所依赖的Dao
    private HomeDao homeDao;

    public void setHomeDao(HomeDao homeDao) {
        this.homeDao = homeDao;
    }

    //    添加首页文章（后台）
    public void addHome(Home home) {
        home.setHomeTime(new Date());
        homeDao.addHome(home);

    }

    //      查询所有(后台)
    public List<Home> findAll() {
        return homeDao.findAll();
    }

    //    按照ID查询记录
    public Home findById(Home home) {
        return homeDao.findById(home);
    }

    //    修改首页文章（后台）
    public void updateHome(Home home) {
        homeDao.updateHome(home);
    }

    //      删除首页文章（后台）
    public void deleteHome(Home home) {
        homeDao.deleteHome(home);
    }

    //    查询文章（前后）分页
    public PageBean<Home> queryHome(int pc, int ps) {
        return homeDao.queryHome(pc, ps);
    }

    //    前台显示（最新日志排序）
    public List<Home> receptionNewHome() {
        return homeDao.receptionNewHome();
    }

    //    前台显示（点击日志排序）
    public List<Home> receptionClickHome() {
        return homeDao.receptionClickHome();
    }


}
