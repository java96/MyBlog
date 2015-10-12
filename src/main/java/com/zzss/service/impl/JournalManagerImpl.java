package com.zzss.service.impl;

import com.zzss.common.PageBean;
import com.zzss.dao.JournalDao;
import com.zzss.entity.Journal;
import com.zzss.service.JournalManager;

import java.util.Date;
import java.util.List;

/**
 * Created by ���� on 2015/9/28.
 */
public class JournalManagerImpl implements JournalManager {

    //��Ӷ�Dao������
    private JournalDao journalDao;

    public void setJournalDao(JournalDao journalDao) {
        this.journalDao = journalDao;
    }


    //�����־
    public void addJournal(Journal journal) {
        journal.setJournalDate(new Date());
        journalDao.addJournal(journal);
    }

    //�г�������־����̨ʹ�ã�
    public List<Journal> listAll() {
        return journalDao.listAll();
    }

    //��ѯ��־
    public Journal queryById(Journal journal) {
        journalDao.clickJournal();
        return journalDao.queryById(journal);
    }

    //�޸���־
    public void updateJournal(Journal journal) {
        journalDao.updateJournal(journal);
    }

    //����IDɾ����־
    public void deleteJournalById(Journal journal) {
        journalDao.deleteJournalById(journal);
    }

    //ǰ̨��ʾ
    public PageBean<Journal> receptionJournal(int pc, int ps) {
        return journalDao.receptionJournal(pc, ps);
    }

    //    ǰ̨��ʾ�������Ƽ���־����
    public List<Journal> receptionNewJournal() {

        return journalDao.receptionNewJournal();
    }

    //    ǰ̨��ʾ�������־����
    public List<Journal> receptionClickJournal() {
        return journalDao.receptionClickJournal();
    }

}
