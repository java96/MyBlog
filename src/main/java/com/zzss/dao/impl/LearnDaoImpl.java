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

    //    ���ѧ��ֹ��
    public void addLearn(Learn learn) {
        save(learn);
    }

    //    ��ѯ����ѧ��ֹ��
    public List<Learn> listLearn() {
        return findAll(Learn.class);
    }

    //    ��ѯѧ��ֹ��
    public Learn queryLearn(Learn learn) {
        return get(Learn.class, learn.getId());
    }

    //    �޸�ѧ��ֹ��
    public void updateLearn(Learn learn) {
        update(learn);
    }

    //    ɾ��ѧ��ֹ��
    public void deleteLearn(Learn learn) {
        delete(Learn.class, learn.getId());
    }

    //    ǰ̨��ʾ
    public PageBean<Learn> receptionLearn(int pc, int ps) {
        PageBean<Learn> pageBean = new PageBean<Learn>();
        pageBean.setPc(pc);
        pageBean.setPs(ps);

        //     ��ȡ�ܼ�¼��
        int tr = (int) findCount(Learn.class);
        pageBean.setTr(tr);
        //    ��ѯ��¼
        String hql = "select l from Learn l order by l.learnCommtime desc";
        List<Learn> learns = findByPage(hql, pc, ps);
        pageBean.setBeanList(learns);
        return pageBean;
    }

    //    ������������
    public List<Learn> receptionNewLearn() {
        String hql = "select ln from Learn ln  where ln.learnRecommend = 1 order by ln.learnRecommend,learnCommtime desc";
        return findByPage(hql, 0, 8);
    }

    //    ���µ������
    public List<Learn> receptionClickLearn() {
        String hql = "select ld from Learn ld order by ld.learnClick desc";
        return findByPage(hql, 0, 5);
    }

    //   ��������
    public void clickLearn() {
        click("update Learn set learnClick = learnClick + 1");
    }

}
