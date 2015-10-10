package com.zzss.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zzss.common.PageBean;
import com.zzss.entity.Journal;
import com.zzss.entity.User;
import com.zzss.service.JournalManager;

/**
 * Created by ���� on 2015/9/28.
 */
public class JournalAction extends ActionSupport {

    //������־�������ķ����
    private JournalManager journalManager;

    // ��װ��־���������
    private Journal journal;

    //��װ��ҳ����
    private PageBean<Journal> pageBean;


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

    //�����־
    public String addJournal() throws Exception {
        journalManager.addJournal(getJournal());
        return "journalList";
    }

    //��ʾ������־(��̨ʹ��)
    public String listJournalAll() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("journalListAll", journalManager.listAll());
        return "journalList";
    }

    //�޸��û�(��һ����ѯ��־)
    public String queryById() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("journalAList", journalManager.queryById(getJournal()));
        return "updateJournal";
    }

    //�޸���־(�ڶ����޸���־)
    public String updateJournal() throws Exception {
        journalManager.updateJournal(getJournal());
        return "journalList";
    }

    //ɾ����־
    public String deleteJournal() throws Exception {
        journalManager.deleteJournalById(getJournal());
        return "journalList";
    }

    //ǰ̨��ʾ+��ҳ
    public String receptionJournal() {
        ActionContext act = ActionContext.getContext();
        int pc = getPageBean().getPc();
        int ps = 10;
        act.put("journalList", journalManager.receptionJournal(pc, ps));
        act.put("journalRece", journalManager.receptionNewJournal());
        act.put("journalClick", journalManager.receptionClickJournal());
        return "receptionJournal";
    }

    //�Ķ�ȫ��Action
    public String clickJournal() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("journalList", journalManager.queryById(getJournal()));
        return "articleJournalList";
    }
}
