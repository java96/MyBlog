package com.zzss.service;

import com.zzss.common.PageBean;
import com.zzss.entity.Diary;

import java.util.List;

/**
 * Created by songs on 2015/10/1.
 */
public interface DiaryManager {

    //    �����ռ�(��̨)
    void addDiary(Diary diary);

    //    ��ѯ�����ռ�
    List<Diary> listDiary();

    //    ����ID��ѯ�ռ�
    Diary queryDiaryById(Diary diary);

    //    ����ID�޸��ռ�
    void updateDiary(Diary diary);

    //    ɾ���ռ�
    void deleteDiary(Diary diary);

    //     ǰ̨��ʾ
    PageBean<Diary> receptionDiary(int pc, int ps);

    //    ǰ̨��ʾ��������������
    List<Diary> receptionNewDiary();

    //    ǰ̨��ʾ�������������
    List<Diary> receptionClickDiary();

}