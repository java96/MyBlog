package com.zzss.service;

import com.zzss.common.PageBean;
import com.zzss.entity.Chat;

import java.util.List;

/**
 * Created by songs on 2015/10/2.
 */
public interface ChatManager {

    //    填加文章
    void addChat(Chat chat);

    //    查询所有文章
    List<Chat> listChat();

    //查询文章
    Chat queryChat(Chat chat);

    //更新文章
    void updateChat(Chat chat);

    //    删除文章
    void deleteChat(Chat chat);

    //前台查询
    PageBean<Chat> receptionList(int pc, int ps);

}
