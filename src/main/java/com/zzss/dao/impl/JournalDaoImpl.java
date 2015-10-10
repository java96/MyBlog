package com.zzss.dao.impl;

import com.zzss.common.PageBean;
import com.zzss.common.impl.BaseDaoImpl;
import com.zzss.dao.JournalDao;
import com.zzss.entity.Journal;

import java.util.List;

/**
 * Created by 立鹏 on 2015/9/28.
 */
public class JournalDaoImpl extends BaseDaoImpl<Journal> implements JournalDao {

    //添加日志
    public void addJournal(Journal journal) {
        save(journal);
    }

    //列出所有日志（后台使用）
    public List<Journal> listAll() {
        return findAll(Journal.class);
    }

    //修改日志(第一步查询日志)
    public Journal queryById(Journal journal) {
        return get(Journal.class, journal.getId());
    }

    //修改日志(第二步修改日志)
    public void updateJournal(Journal journal) {
        update(journal);
    }

    //根据ID删除日志
    public void deleteJournalById(Journal journal) {
        delete(Journal.class, journal.getId());
    }

    //前台显示
    public PageBean<Journal> receptionJournal(int pc, int ps) {
        PageBean<Journal> pageBean = new PageBean<Journal>();
        pageBean.setPc(pc);
        pageBean.setPs(ps);

        int tr = (int) findCount(Journal.class);
        pageBean.setTr(tr);
        String hql = "select j from Journal j order by j.journalDate desc";

        List<Journal> journals = findByPage(hql, pc, ps);
        pageBean.setBeanList(journals);

        return pageBean;
    }

    //    前台显示（最新推荐日志排序）
    public List<Journal> receptionNewJournal() {
        String hql = "select jr from Journal jr where jr.journalRecommend = 1 order by jr.journalDate desc";
        return findByPage(hql, 0, 8);
    }

    //    前台显示（点击日志排序）
    public List<Journal> receptionClickJournal() {
        String hql = "select jc from Journal jc order by jc.journaClick desc";
        return findByPage(hql, 0, 5);
    }

}
