package com.zzss.dao;

import com.zzss.common.PageBean;
import com.zzss.entity.Learn;

import java.util.List;

/**
 * Created by songs on 2015/10/2.
 */
public interface LearnDao {


    //    添加学无止境
    void addLearn(Learn learn);

    //    查询所有学无止境
    List<Learn> listLearn();

    //    查询学无止境
    Learn queryLearn(Learn learn);

    //    修改学无止境
    void updateLearn(Learn learn);

    //    删除学无止境
    void deleteLearn(Learn learn);

    //    前台显示
    PageBean<Learn> receptionLearn(int pc, int ps);

    //    前台显示（最新文章排序）
    List<Learn> receptionNewLearn();

    //    前台显示（点击文章排序）
    List<Learn> receptionClickLearn();

}
