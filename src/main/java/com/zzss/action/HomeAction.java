package com.zzss.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zzss.common.PageBean;
import com.zzss.entity.Home;
import com.zzss.service.HomeManager;
import com.zzss.web.ImageTools;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by songs on 2015/10/10.
 */
public class HomeAction extends ActionSupport {

    private HomeManager homeManager;

    private Home home;

    private PageBean<Home> pageBean;

//    图片上传

    private File imag;
    private String imagContentType;
    private String imagFileName;

    public File getImag() {
        return imag;
    }

    public void setImag(File imag) {
        this.imag = imag;
    }

    public String getImagContentType() {
        return imagContentType;
    }

    public void setImagContentType(String imagContentType) {
        this.imagContentType = imagContentType;
    }

    public String getImagFileName() {
        return imagFileName;
    }

    public void setImagFileName(String imagFileName) {
        this.imagFileName = imagFileName;
    }

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
        String url = ImageTools.getImageUrl(getImag(), getImagFileName());
        System.out.println(url);
        getHome().setHomeImager(url);
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
        String url = ImageTools.getImageUrl(getImag(), getImagFileName());
        getHome().setHomeImager(url);
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
