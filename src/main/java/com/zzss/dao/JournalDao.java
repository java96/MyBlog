package com.zzss.dao;

import com.zzss.common.PageBean;
import com.zzss.entity.Journal;

import java.util.List;

/**
 * Created by ���� on 2015/9/28.
 */
public interface JournalDao {

    /**
     * �����־
     *
     * @param journal
     */
    void addJournal(Journal journal);


    /**
     * �г�������־����̨ʹ�ã�
     *
     * @param
     * @return
     */
    List<Journal> listAll();


    /**
     * �޸���־(��һ����ѯ��־)
     *
     * @param journal
     * @return
     */
    Journal queryById(Journal journal);

    /**
     * �޸���־(�ڶ����޸���־)
     *
     * @param journal
     */
    void updateJournal(Journal journal);

    /**
     * ����IDɾ����־
     *
     * @param journal
     */
    void deleteJournalById(Journal journal);


    //    ǰ̨��ʾ
    PageBean<Journal> receptionJournal(int pc, int ps);

    //    ǰ̨��ʾ�������Ƽ���־����
    List<Journal> receptionNewJournal();

    //    ǰ̨��ʾ�������־����
    List<Journal> receptionClickJournal();

}
