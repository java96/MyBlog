package com.zzss.service;

import com.zzss.common.PageBean;
import com.zzss.entity.Journal;

import java.util.List;

/**
 * Created by ���� on 2015/9/28.
 */
public interface JournalManager {

    /**
     * �����־�����
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
     * �޸���־
     *
     * @param journal
     */
    void updateJournal(Journal journal);


    /**
     * �����û�ID��ѯ��־
     *
     * @return
     */
    Journal queryById(Journal journal);

    /**
     * �����û�IDɾ����־
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
