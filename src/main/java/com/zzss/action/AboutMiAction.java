package com.zzss.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zzss.entity.AboutMi;
import com.zzss.service.AboutMiManager;

/**
 * Created by songs on 2015/10/3.
 */
public class AboutMiAction extends ActionSupport {

    private AboutMi aboutMi;

    private AboutMiManager aboutMiManager;

    public AboutMi getAboutMi() {
        return aboutMi;
    }

    public void setAboutMi(AboutMi aboutMi) {
        this.aboutMi = aboutMi;
    }

    public AboutMiManager getAboutMiManager() {
        return aboutMiManager;
    }

    public void setAboutMiManager(AboutMiManager aboutMiManager) {
        this.aboutMiManager = aboutMiManager;
    }

    //�����ݿ��ѯ
    public String queryAboutMi() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.getSession().put("aboutMi", aboutMiManager.queryAboutMi(getAboutMi()));
        return "updateAboutMi";
    }

    //�޸Ĺ�����
    public String updateAboutMi() throws Exception {
        aboutMiManager.updateAboutMi(getAboutMi());
        return "queryAboutMi";
    }

//ǰ̨��ʾ
public String receptionList() throws Exception {
    ActionContext act = ActionContext.getContext();
    act.getSession().put("aboutMi", aboutMiManager.queryAboutMi(getAboutMi()));
    return "aboutList";
}

}
