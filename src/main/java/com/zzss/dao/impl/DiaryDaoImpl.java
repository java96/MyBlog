package com.zzss.dao.impl;

import com.zzss.common.PageBean;
import com.zzss.common.impl.BaseDaoImpl;
import com.zzss.dao.DiaryDao;
import com.zzss.entity.Diary;

import java.util.List;

/**
 * Created by songs on 2015/10/1.
 */
public class DiaryDaoImpl extends BaseDaoImpl<Diary> implements DiaryDao {

    //����ռ�(��̨)
    public void addDiary(Diary diary) {
        save(diary);
    }

    //��ѯ�����ռ�
    public List<Diary> listDiary() {
        return findAll(Diary.class);
    }

    //��ѯ�ռǸ���ID
    public Diary queryDiaryById(Diary diary) {
        return get(Diary.class, diary.getId());
    }

    //    �޸��ռ�
    public void updateDiary(Diary diary) {
        update(diary);
    }

    //    ɾ���ռ�
    public void deleteDiary(Diary diary) {
        delete(Diary.class, diary.getId());
    }

    //     ǰ̨��ʾ
    public PageBean<Diary> receptionDiary(int pc, int ps) {
        PageBean<Diary> pageBean = new PageBean<Diary>();
        pageBean.setPc(pc);
        pageBean.setPs(ps);
        //       ��ȡ��¼����
        int tr = (int) findCount(Diary.class);
        pageBean.setTr(tr);
        //       ÿҳ��ʾ�����ݣ������ύʱ����в�ѯ
        String hql = "select d from Diary d order by d.diaryTime desc";
        List<Diary> diaryList = findByPage(hql, pc, ps);
        pageBean.setBeanList(diaryList);
        return pageBean;
    }

    //    ǰ̨��ʾ���Ƽ��ռǲ�ѯ��������������
    public List<Diary> receptionNewDiary() {
        String hql = "select rd from Diary rd  where rd.diaryRecommend = 1 order by rd.diaryTime desc";
        return findByPage(hql, 0, 8);
    }

    //    ǰ̨��ʾ����ѯ����ռǣ����������������
    public List<Diary> receptionClickDiary() {
        String hql = "select rc from Diary rc order by rc.diaryClick desc";
        return findByPage(hql, 0, 5);
    }

}
