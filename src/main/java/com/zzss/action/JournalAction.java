package com.zzss.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zzss.common.PageBean;
import com.zzss.entity.Journal;
import com.zzss.entity.User;
import com.zzss.service.JournalManager;
import com.zzss.web.ImageTools;

import java.io.File;

/**
 * Created by 立鹏 on 2015/9/28.
 */
public class JournalAction extends ActionSupport {

    //配置日志所以来的服务层
    private JournalManager journalManager;

    // 封装日志的请求参数
    private Journal journal;

    //封装分页参数
    private PageBean<Journal> pageBean;
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


    public JournalManager getJournalManager() {
        return journalManager;
    }

    public Journal getJournal() {
        return journal;
    }

    public PageBean<Journal> getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean<Journal> pageBean) {
        this.pageBean = pageBean;
    }

    public void setJournalManager(JournalManager journalManager) {
        this.journalManager = journalManager;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    //添加日志
    public String addJournal() throws Exception {
        String url = ImageTools.getImageUrl(getImag(), getImagFileName());
        getJournal().setJournalImager(url);
        journalManager.addJournal(getJournal());
        return "journalList";
    }

    //显示所有日志(后台使用)
    public String listJournalAll() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("journalListAll", journalManager.listAll());
        return "journalList";
    }

    //修改用户(第一步查询日志)
    public String queryById() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("journalAList", journalManager.queryById(getJournal()));
        return "updateJournal";
    }

    //修改日志(第二步修改日志)
    public String updateJournal() throws Exception {
        if (null != imag) {
            String url = ImageTools.getImageUrl(getImag(), getImagFileName());
            getJournal().setJournalImager(url);
        }
        journalManager.updateJournal(getJournal());
        return "journalList";
    }

    //删除日志
    public String deleteJournal() throws Exception {
        journalManager.deleteJournalById(getJournal());
        return "journalList";
    }

    //前台显示+分页
    public String receptionJournal() {
        ActionContext act = ActionContext.getContext();
        int pc = getPageBean().getPc();
        int ps = 10;
        act.put("journalList", journalManager.receptionJournal(pc, ps));
        act.put("journalRece", journalManager.receptionNewJournal());
        act.put("journalClick", journalManager.receptionClickJournal());
        return "receptionJournal";
    }

    //阅读全文Action
    public String clickJournal() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("journalList", journalManager.queryById(getJournal()));
        return "articleJournalList";
    }
}
