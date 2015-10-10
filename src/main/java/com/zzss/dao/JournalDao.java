package com.zzss.dao;

import com.zzss.common.PageBean;
import com.zzss.entity.Journal;

import java.util.List;

/**
 * Created by 立鹏 on 2015/9/28.
 */
public interface JournalDao {

    /**
     * 添加日志
     *
     * @param journal
     */
    void addJournal(Journal journal);


    /**
     * 列出所有日志（后台使用）
     *
     * @param
     * @return
     */
    List<Journal> listAll();


    /**
     * 修改日志(第一步查询日志)
     *
     * @param journal
     * @return
     */
    Journal queryById(Journal journal);

    /**
     * 修改日志(第二步修改日志)
     *
     * @param journal
     */
    void updateJournal(Journal journal);

    /**
     * 根据ID删除日志
     *
     * @param journal
     */
    void deleteJournalById(Journal journal);


    //    前台显示
    PageBean<Journal> receptionJournal(int pc, int ps);

    //    前台显示（最新推荐日志排序）
    List<Journal> receptionNewJournal();

    //    前台显示（点击日志排序）
    List<Journal> receptionClickJournal();

}
