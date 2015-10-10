package com.zzss.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zzss.common.PageBean;
import com.zzss.entity.Diary;
import com.zzss.service.DiaryManager;

/**
 * Created by songs on 2015/10/1.
 */
public class DiaryAction extends ActionSupport {

    private DiaryManager diaryManager;

    private Diary diary;

    private PageBean<Diary> pageBean;

    public Diary getDiary() {
        return diary;
    }

    public PageBean<Diary> getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean<Diary> pageBean) {
        this.pageBean = pageBean;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

    public void setDiaryManager(DiaryManager diaryManager) {
        this.diaryManager = diaryManager;
    }

    //    添加日记（后台）
    public String addDiary() throws Exception {
        diaryManager.addDiary(getDiary());
        return "listDiary";
    }

    //    查看所有日记
    public String listDiary() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("listDiary", diaryManager.listDiary());
        return "listDiary";
    }

    //    根据ID查询日记
    public String queryDiaryById() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("Adiary", diaryManager.queryDiaryById(getDiary()));
        return "updateDiary";
    }

    //    修改日记
    public String updateDiary() throws Exception {
        diaryManager.updateDiary(getDiary());
        return "listDiary";
    }

    //    删除日记
    public String deleteDiary() throws Exception {
        diaryManager.deleteDiary(getDiary());
        return "listDiary";
    }

    //前台显示
    public String receptionDiary() throws Exception {
        ActionContext act = ActionContext.getContext();

        int pc = getPageBean().getPc();
        int ps = 10;
        //向request域中添加每页所查询到的记录
        act.put("diaryList", diaryManager.receptionDiary(pc, ps));
        //向request域中添加，按推荐日记查询到的记录
        act.put("diaryRece", diaryManager.receptionNewDiary());
        //向request域中添加按点击所查询的记录
        act.put("diaryClick", diaryManager.receptionClickDiary());
        return "receptionList";
    }

    //点击阅读
    public String clickDiary() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("diaryList", diaryManager.queryDiaryById(getDiary()));
        return "articleDiaryList";
    }
}
