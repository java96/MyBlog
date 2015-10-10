package com.zzss.dao.impl;

import com.zzss.common.PageBean;
import com.zzss.common.impl.BaseDaoImpl;
import com.zzss.dao.JournalDao;
import com.zzss.entity.Journal;

import java.util.List;

/**
 * Created by ���� on 2015/9/28.
 */
public class JournalDaoImpl extends BaseDaoImpl<Journal> implements JournalDao {

    //�����־
    public void addJournal(Journal journal) {
        save(journal);
    }

    //�г�������־����̨ʹ�ã�
    public List<Journal> listAll() {
        return findAll(Journal.class);
    }

    //�޸���־(��һ����ѯ��־)
    public Journal queryById(Journal journal) {
        return get(Journal.class, journal.getId());
    }

    //�޸���־(�ڶ����޸���־)
    public void updateJournal(Journal journal) {
        update(journal);
    }

    //����IDɾ����־
    public void deleteJournalById(Journal journal) {
        delete(Journal.class, journal.getId());
    }

    //ǰ̨��ʾ
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

    //    ǰ̨��ʾ�������Ƽ���־����
    public List<Journal> receptionNewJournal() {
        String hql = "select jr from Journal jr where jr.journalRecommend = 1 order by jr.journalDate desc";
        return findByPage(hql, 0, 8);
    }

    //    ǰ̨��ʾ�������־����
    public List<Journal> receptionClickJournal() {
        String hql = "select jc from Journal jc order by jc.journaClick desc";
        return findByPage(hql, 0, 5);
    }

}
