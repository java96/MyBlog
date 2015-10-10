package com.zzss.dao;

import com.zzss.common.PageBean;
import com.zzss.entity.Learn;

import java.util.List;

/**
 * Created by songs on 2015/10/2.
 */
public interface LearnDao {


    //    ���ѧ��ֹ��
    void addLearn(Learn learn);

    //    ��ѯ����ѧ��ֹ��
    List<Learn> listLearn();

    //    ��ѯѧ��ֹ��
    Learn queryLearn(Learn learn);

    //    �޸�ѧ��ֹ��
    void updateLearn(Learn learn);

    //    ɾ��ѧ��ֹ��
    void deleteLearn(Learn learn);

    //    ǰ̨��ʾ
    PageBean<Learn> receptionLearn(int pc, int ps);

    //    ǰ̨��ʾ��������������
    List<Learn> receptionNewLearn();

    //    ǰ̨��ʾ�������������
    List<Learn> receptionClickLearn();

}
