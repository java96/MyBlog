package com.zzss.service;

import com.zzss.common.PageBean;
import com.zzss.entity.Diary;

import java.util.List;

/**
 * Created by songs on 2015/10/1.
 */
public interface DiaryManager {

    //    添加日记(后台)
    void addDiary(Diary diary);

    //    查询所有日记
    List<Diary> listDiary();

    //    根据ID查询日记
    Diary queryDiaryById(Diary diary);

    //    根据ID修改日记
    void updateDiary(Diary diary);

    //    删除日记
    void deleteDiary(Diary diary);

    //     前台显示
    PageBean<Diary> receptionDiary(int pc, int ps);

    //    前台显示（最新文章排序）
    List<Diary> receptionNewDiary();

    //    前台显示（点击文章排序）
    List<Diary> receptionClickDiary();

}
