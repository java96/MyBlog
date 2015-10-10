package com.zzss.service.impl;

import com.zzss.common.PageBean;
import com.zzss.dao.DiaryDao;
import com.zzss.entity.Diary;
import com.zzss.service.DiaryManager;

import java.util.Date;
import java.util.List;

/**
 * Created by songs on 2015/10/1.
 */
public class DiaryManagerImpl implements DiaryManager {

    private DiaryDao diaryDao;

    public void setDiaryDao(DiaryDao diaryDao) {
        this.diaryDao = diaryDao;
    }

    //添加日志(后台)
    public void addDiary(Diary diary) {
        diary.setDiaryTime(new Date());
        diaryDao.addDiary(diary);
    }

    //查询所有日记
    public List<Diary> listDiary() {
        return diaryDao.listDiary();
    }

    //根据ID查询日记
    public Diary queryDiaryById(Diary diary) {
        return diaryDao.queryDiaryById(diary);
    }

    //更新日记
    public void updateDiary(Diary diary) {
        diaryDao.updateDiary(diary);
    }

    //删除日记
    public void deleteDiary(Diary diary) {
        diaryDao.deleteDiary(diary);
    }

    //     前台显示
    public PageBean<Diary> receptionDiary(int pc, int ps) {
        return diaryDao.receptionDiary(pc, ps);
    }

    //    前台显示（最新文章排序）
    public List<Diary> receptionNewDiary() {
        return diaryDao.receptionNewDiary();
    }

    //    前台显示（点击文章排序）
    public List<Diary> receptionClickDiary() {
        return diaryDao.receptionClickDiary();
    }

}
