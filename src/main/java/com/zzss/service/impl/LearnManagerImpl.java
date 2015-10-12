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


    //    添加学无止境
    public void addLearn(Learn learn) {
        learn.setLearnCommtime(new Date());
        learnDao.addLearn(learn);
    }

    //    查询所有学无止境
    public List<Learn> listLearn() {
        return learnDao.listLearn();
    }

    //    查询学无止境
    public Learn queryLearn(Learn learn) {
        learnDao.clickLearn();
        return learnDao.queryLearn(learn);
    }

    //    修改学无止境
    public void updateLearn(Learn learn) {
        learnDao.updateLearn(learn);

    }

    //    删除学无止境
    public void deleteLearn(Learn learn) {
        learnDao.deleteLearn(learn);
    }

    //    前台显示
    public PageBean<Learn> receptionLearn(int pc, int ps) {
        return learnDao.receptionLearn(pc, ps);
    }

    //    前台显示（最新文章排序）
    public List<Learn> receptionNewLearn() {
        return learnDao.receptionNewLearn();
    }

    //    前台显示（点击文章排序）
    public List<Learn> receptionClickLearn() {
        return learnDao.receptionClickLearn();
    }


}
