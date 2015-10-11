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

//    ͼƬ�ϴ�

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

    //    �����ҳ���£���̨��
    public String addHome() throws Exception {
        String url = ImageTools.getImageUrl(getImag(), getImagFileName());
        System.out.println(url);
        getHome().setHomeImager(url);
        homeManager.addHome(getHome());
        return "homeList";
    }

    //      ��ѯ����(��̨)
    public String findAll() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("homeList", homeManager.findAll());
        return "homeList";
    }

    //      ��ѯ������¼
    public String findById() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("homeList", homeManager.findById(getHome()));
        return "homeUpdate";
    }

    //    �޸���ҳ���£���̨��
    public String updateHome() throws Exception {
        String url = ImageTools.getImageUrl(getImag(), getImagFileName());
        getHome().setHomeImager(url);
        homeManager.updateHome(getHome());
        return "homeList";
    }

    //      ɾ����ҳ���£���̨��
    public String deleteHome() throws Exception {
        homeManager.deleteHome(getHome());
        return "homeList";
    }


    //    ǰ̨��ʾ(��ҳ)
    public String receptionHome() throws Exception {
        ActionContext act = ActionContext.getContext();
        int pc = getPageBean().getPc();
        int ps = 10;
        act.put("homeList", homeManager.queryHome(pc, ps));
        act.put("homeTime", homeManager.receptionNewHome());
        act.put("homeClick", homeManager.receptionClickHome());
        return "receptionHome";
    }

    //�Ķ�����Action
    public String clickHome() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("homeList", homeManager.findById(getHome()));
        return "articleHomeList";
    }
}
