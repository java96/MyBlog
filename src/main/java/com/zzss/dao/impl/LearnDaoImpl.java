package com.zzss.dao.impl;

import com.zzss.common.PageBean;
import com.zzss.common.impl.BaseDaoImpl;
import com.zzss.dao.LearnDao;
import com.zzss.entity.Learn;

import java.util.List;

/**
 * Created by songs on 2015/10/2.
 */
public class LearnDaoImpl extends BaseDaoImpl<Learn> implements LearnDao {

    //    添加学无止境
    public void addLearn(Learn learn) {
        save(learn);
    }

    //    查询所有学无止境
    public List<Learn> listLearn() {
        return findAll(Learn.class);
    }

    //    查询学无止境
    public Learn queryLearn(Learn learn) {
        return get(Learn.class, learn.getId());
    }

    //    修改学无止境
    public void updateLearn(Learn learn) {
        update(learn);
    }

    //    删除学无止境
    public void deleteLearn(Learn learn) {
        delete(Learn.class, learn.getId());
    }

    //    前台显示
    public PageBean<Learn> receptionLearn(int pc, int ps) {
        PageBean<Learn> pageBean = new PageBean<Learn>();
        pageBean.setPc(pc);
        pageBean.setPs(ps);

        //     获取总记录数
        int tr = (int) findCount(Learn.class);
        pageBean.setTr(tr);
        //    查询记录
        String hql = "select l from Learn l order by l.learnCommtime desc";
        List<Learn> learns = findByPage(hql, pc, ps);
        pageBean.setBeanList(learns);
        return pageBean;
    }

    //    最新文章排序
    public List<Learn> receptionNewLearn() {
        String hql = "select ln from Learn ln  where ln.learnRecommend = 1 order by ln.learnRecommend,learnCommtime desc";
        return findByPage(hql, 0, 8);
    }

    //    文章点击排序
    public List<Learn> receptionClickLearn() {
        String hql = "select ld from Learn ld order by ld.learnClick desc";
        return findByPage(hql, 0, 5);
    }

    //   插入点击数
    public void clickLearn() {
        click("update Learn set learnClick = learnClick + 1");
    }

}
