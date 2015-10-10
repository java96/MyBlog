package com.zzss.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zzss.common.PageBean;
import com.zzss.entity.Home;
import com.zzss.service.HomeManager;

/**
 * Created by songs on 2015/10/10.
 */
public class HomeAction extends ActionSupport {

    private HomeManager homeManager;

    private Home home;

    private PageBean<Home> pageBean;

    public void setHomeManager(HomeManager homeManager) {
        this.homeManager = homeManager;
    }

    public PageBean<Home> getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean<Home> pageBean) {
        this.pageBean = pageBean;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    //    添加首页文章（后台）
    public String addHome() throws Exception {
        homeManager.addHome(getHome());
        return "homeList";
    }

    //      查询所有(后台)
    public String findAll() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("homeList", homeManager.findAll());
        return "homeList";
    }

    //      查询单个记录
    public String findById() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("homeList", homeManager.findById(getHome()));
        return "homeUpdate";
    }

    //    修改首页文章（后台）
    public String updateHome() throws Exception {
        homeManager.updateHome(getHome());
        return "homeList";
    }

    //      删除首页文章（后台）
    public String deleteHome() throws Exception {
        homeManager.deleteHome(getHome());
        return "homeList";
    }


    //    前台显示(分页)
    public String receptionHome() throws Exception {
        ActionContext act = ActionContext.getContext();
        int pc = getPageBean().getPc();
        int ps = 10;
        act.put("homeList", homeManager.queryHome(pc, ps));
        act.put("homeTime", homeManager.receptionNewHome());
        act.put("homeClick", homeManager.receptionClickHome());
        return "receptionHome";
    }

    //阅读文章Action
    public String clickHome() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("homeList", homeManager.findById(getHome()));
        return "articleHomeList";
    }
}
