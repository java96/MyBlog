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

    //�����־(��̨)
    public void addDiary(Diary diary) {
        diary.setDiaryTime(new Date());
        diaryDao.addDiary(diary);
    }

    //��ѯ�����ռ�
    public List<Diary> listDiary() {
        return diaryDao.listDiary();
    }

    //����ID��ѯ�ռ�
    public Diary queryDiaryById(Diary diary) {
        return diaryDao.queryDiaryById(diary);
    }

    //�����ռ�
    public void updateDiary(Diary diary) {
        diaryDao.updateDiary(diary);
    }

    //ɾ���ռ�
    public void deleteDiary(Diary diary) {
        diaryDao.deleteDiary(diary);
    }

    //     ǰ̨��ʾ
    public PageBean<Diary> receptionDiary(int pc, int ps) {
        return diaryDao.receptionDiary(pc, ps);
    }

    //    ǰ̨��ʾ��������������
    public List<Diary> receptionNewDiary() {
        return diaryDao.receptionNewDiary();
    }

    //    ǰ̨��ʾ�������������
    public List<Diary> receptionClickDiary() {
        return diaryDao.receptionClickDiary();
    }

}
