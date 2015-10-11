package com.zzss.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zzss.common.PageBean;
import com.zzss.entity.Diary;
import com.zzss.service.DiaryManager;
import com.zzss.web.ImageTools;

import java.io.File;

/**
 * Created by songs on 2015/10/1.
 */
public class DiaryAction extends ActionSupport {

    private DiaryManager diaryManager;

    private Diary diary;

    private PageBean<Diary> pageBean;

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

    //    ����ռǣ���̨��
    public String addDiary() throws Exception {
        String url = ImageTools.getImageUrl(getImag(), getImagFileName());
        getDiary().setDiaryImager(url);
        diaryManager.addDiary(getDiary());
        return "listDiary";
    }

    //    �鿴�����ռ�
    public String listDiary() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("listDiary", diaryManager.listDiary());
        return "listDiary";
    }

    //    ����ID��ѯ�ռ�
    public String queryDiaryById() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("Adiary", diaryManager.queryDiaryById(getDiary()));
        return "updateDiary";
    }

    //    �޸��ռ�
    public String updateDiary() throws Exception {
        if (null != imag) {
            String url = ImageTools.getImageUrl(getImag(), getImagFileName());
            getDiary().setDiaryImager(url);
        }
        diaryManager.updateDiary(getDiary());
        return "listDiary";
    }

    //    ɾ���ռ�
    public String deleteDiary() throws Exception {
        diaryManager.deleteDiary(getDiary());
        return "listDiary";
    }

    //ǰ̨��ʾ
    public String receptionDiary() throws Exception {
        ActionContext act = ActionContext.getContext();

        int pc = getPageBean().getPc();
        int ps = 10;
        //��request�������ÿҳ����ѯ���ļ�¼
        act.put("diaryList", diaryManager.receptionDiary(pc, ps));
        //��request������ӣ����Ƽ��ռǲ�ѯ���ļ�¼
        act.put("diaryRece", diaryManager.receptionNewDiary());
        //��request������Ӱ��������ѯ�ļ�¼
        act.put("diaryClick", diaryManager.receptionClickDiary());
        return "receptionList";
    }

    //����Ķ�
    public String clickDiary() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("diaryList", diaryManager.queryDiaryById(getDiary()));
        return "articleDiaryList";
    }
}
