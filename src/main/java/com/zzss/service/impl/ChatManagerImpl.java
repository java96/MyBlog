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

    //    �������
    public void addChat(Chat chat) {
        chat.setChatCommTime(new Date());
        chatDao.addChat(chat);
    }

    //    ��ѯ��������
    public List<Chat> listChat() {
        return chatDao.listChat();
    }

    //    ��ѯ����
    public Chat queryChat(Chat chat) {
        return chatDao.queryChat(chat);
    }

    //    ��������
    public void updateChat(Chat chat) {
        chatDao.updateChat(chat);
    }

    //      ɾ������
    public void deleteChat(Chat chat) {
        chatDao.deleteChat(chat);
    }

    //      ǰ̨��ѯ
    public PageBean<Chat> receptionList(int pc, int ps) {
        return chatDao.receptionList(pc, ps);
    }


}
