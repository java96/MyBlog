package com.zzss.service.impl;

import com.zzss.common.PageBean;
import com.zzss.dao.JournalDao;
import com.zzss.entity.Journal;
import com.zzss.service.JournalManager;

import java.util.Date;
import java.util.List;

/**
 * Created by 立鹏 on 2015/9/28.
 */
public class JournalManagerImpl implements JournalManager {

    //添加对Dao的依赖
    private JournalDao journalDao;

    public void setJournalDao(JournalDao journalDao) {
        this.journalDao = journalDao;
    }


    //添加日志
    public void addJournal(Journal journal) {
        journal.setJournalDate(new Date());
        journalDao.addJournal(journal);
    }

    //列出所有日志（后台使用）
    public List<Journal> listAll() {
        return journalDao.listAll();
    }

    //查询日志
    public Journal queryById(Journal journal) {
        journalDao.clickJournal();
        return journalDao.queryById(journal);
    }

    //修改日志
    public void updateJournal(Journal journal) {
        journalDao.updateJournal(journal);
    }

    //根据ID删除日志
    public void deleteJournalById(Journal journal) {
        journalDao.deleteJournalById(journal);
    }

    //前台显示
    public PageBean<Journal> receptionJournal(int pc, int ps) {
        return journalDao.receptionJournal(pc, ps);
    }

    //    前台显示（最新推荐日志排序）
    public List<Journal> receptionNewJournal() {

        return journalDao.receptionNewJournal();
    }

    //    前台显示（点击日志排序）
    public List<Journal> receptionClickJournal() {
        return journalDao.receptionClickJournal();
    }

}
