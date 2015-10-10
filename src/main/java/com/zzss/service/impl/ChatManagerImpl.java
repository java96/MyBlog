package com.zzss.service.impl;

import com.zzss.common.PageBean;
import com.zzss.dao.ChatDao;
import com.zzss.entity.Chat;
import com.zzss.service.ChatManager;

import java.util.Date;
import java.util.List;

/**
 * Created by songs on 2015/10/2.
 */
public class ChatManagerImpl implements ChatManager {

    private ChatDao chatDao;

    public void setChatDao(ChatDao chatDao) {
        this.chatDao = chatDao;
    }

    //    填加文章
    public void addChat(Chat chat) {
        chat.setChatCommTime(new Date());
        chatDao.addChat(chat);
    }

    //    查询所有文章
    public List<Chat> listChat() {
        return chatDao.listChat();
    }

    //    查询文章
    public Chat queryChat(Chat chat) {
        return chatDao.queryChat(chat);
    }

    //    更新文章
    public void updateChat(Chat chat) {
        chatDao.updateChat(chat);
    }

    //      删除文章
    public void deleteChat(Chat chat) {
        chatDao.deleteChat(chat);
    }

    //      前台查询
    public PageBean<Chat> receptionList(int pc, int ps) {
        return chatDao.receptionList(pc, ps);
    }


}
