package com.zzss.dao;

import com.zzss.common.PageBean;
import com.zzss.entity.Home;

import java.util.List;

/**
 * Created by songs on 2015/10/10.
 */
public interface HomeDao {

    //    添加首页文章（后台）
    void addHome(Home home);

    //    查询所有
    List<Home> findAll();

    //    按照ID查询记录
    Home findById(Home home);

    //    修改首页文章（后台）
    void updateHome(Home home);

    //      删除首页文章（后台）
    void deleteHome(Home home);

    //    查询文章（前后）分页
    PageBean<Home> queryHome(int pc, int ps);

    //    前台显示（最新日志排序）
    List<Home> receptionNewHome();

    //    前台显示（点击日志排序）
    List<Home> receptionClickHome();

    //   插入点击数
    void clickHome();
}
