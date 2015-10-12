package com.zzss.service.impl;

import com.zzss.common.PageBean;
import com.zzss.dao.LearnDao;
import com.zzss.entity.Learn;
import com.zzss.service.LearnManager;

import java.util.Date;
import java.util.List;

/**
 * Created by songs on 2015/10/2.
 */
public class LearnManagerImpl implements LearnManager {

    private LearnDao learnDao;


    public void setLearnDao(LearnDao learnDao) {
        this.learnDao = learnDao;
    }


    //    ���ѧ��ֹ��
    public void addLearn(Learn learn) {
        learn.setLearnCommtime(new Date());
        learnDao.addLearn(learn);
    }

    //    ��ѯ����ѧ��ֹ��
    public List<Learn> listLearn() {
        return learnDao.listLearn();
    }

    //    ��ѯѧ��ֹ��
    public Learn queryLearn(Learn learn) {
        learnDao.clickLearn();
        return learnDao.queryLearn(learn);
    }

    //    �޸�ѧ��ֹ��
    public void updateLearn(Learn learn) {
        learnDao.updateLearn(learn);

    }

    //    ɾ��ѧ��ֹ��
    public void deleteLearn(Learn learn) {
        learnDao.deleteLearn(learn);
    }

    //    ǰ̨��ʾ
    public PageBean<Learn> receptionLearn(int pc, int ps) {
        return learnDao.receptionLearn(pc, ps);
    }

    //    ǰ̨��ʾ��������������
    public List<Learn> receptionNewLearn() {
        return learnDao.receptionNewLearn();
    }

    //    ǰ̨��ʾ�������������
    public List<Learn> receptionClickLearn() {
        return learnDao.receptionClickLearn();
    }


}
