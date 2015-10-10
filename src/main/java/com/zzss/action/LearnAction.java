package com.zzss.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zzss.common.PageBean;
import com.zzss.entity.Learn;
import com.zzss.service.LearnManager;

/**
 * Created by songs on 2015/10/2.
 */
public class LearnAction extends ActionSupport {

    private LearnManager learnManager;

    private Learn learn;

    //    ��ҳ��
    private PageBean<Learn> pageBean;

    public LearnManager getLearnManager() {
        return learnManager;
    }

    public Learn getLearn() {
        return learn;
    }

    public PageBean<Learn> getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean<Learn> pageBean) {
        this.pageBean = pageBean;
    }

    public void setLearn(Learn learn) {
        this.learn = learn;
    }

    public void setLearnManager(LearnManager learnManager) {
        this.learnManager = learnManager;
    }


    //    ���ѧ��ֹ��
    public String addLearn() throws Exception {
        learnManager.addLearn(getLearn());
        return "listLearn";
    }

    //    ��ѯ����ѧ��ֹ��
    public String listLearnAll() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("learnList", learnManager.listLearn());
        return "listLearn";
    }

    //��ѯѧ��ֹ��
    public String queryLearn() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("Alearn", learnManager.queryLearn(getLearn()));
        return "updateLearn";
    }

    //�޸�ѧ��ֹ��
    public String updateLearn() throws Exception {
        learnManager.updateLearn(getLearn());
        return "updateLearn";
    }

    //ɾ��ѧ��ֹ��
    public String deleteLearn() throws Exception {
        learnManager.deleteLearn(getLearn());
        return "updateLearn";
    }

    //ǰ̨��ʾ
    public String receptionLearn() throws Exception {
        ActionContext act = ActionContext.getContext();
        int pc = getPageBean().getPc();
        int ps = 10;
        act.put("learnList", learnManager.receptionLearn(pc, ps));
        act.put("recoTitle", learnManager.receptionNewLearn());
        act.put("clickTitle", learnManager.receptionClickLearn());
        return "receptionList";
    }

    //�������
    public String clickLearn() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("learnList",learnManager.queryLearn(getLearn()));
        return "articleLearnList";
    }
}
