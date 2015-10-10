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

    //添加日记(后台)
    public void addDiary(Diary diary) {
        save(diary);
    }

    //查询所有日记
    public List<Diary> listDiary() {
        return findAll(Diary.class);
    }

    //查询日记根据ID
    public Diary queryDiaryById(Diary diary) {
        return get(Diary.class, diary.getId());
    }

    //    修改日记
    public void updateDiary(Diary diary) {
        update(diary);
    }

    //    删除日记
    public void deleteDiary(Diary diary) {
        delete(Diary.class, diary.getId());
    }

    //     前台显示
    public PageBean<Diary> receptionDiary(int pc, int ps) {
        PageBean<Diary> pageBean = new PageBean<Diary>();
        pageBean.setPc(pc);
        pageBean.setPs(ps);
        //       获取记录总数
        int tr = (int) findCount(Diary.class);
        pageBean.setTr(tr);
        //       每页显示的数据，根据提交时间进行查询
        String hql = "select d from Diary d order by d.diaryTime desc";
        List<Diary> diaryList = findByPage(hql, pc, ps);
        pageBean.setBeanList(diaryList);
        return pageBean;
    }

    //    前台显示（推荐日记查询，并按最新排序）
    public List<Diary> receptionNewDiary() {
        String hql = "select rd from Diary rd  where rd.diaryRecommend = 1 order by rd.diaryTime desc";
        return findByPage(hql, 0, 8);
    }

    //    前台显示（查询点击日记，按点击数进行排序）
    public List<Diary> receptionClickDiary() {
        String hql = "select rc from Diary rc order by rc.diaryClick desc";
        return findByPage(hql, 0, 5);
    }

}
