package com.zzss.service;

import com.zzss.common.PageBean;
import com.zzss.entity.Chat;

import java.util.List;

/**
 * Created by songs on 2015/10/2.
 */
public interface ChatManager {

    //    �������
    void addChat(Chat chat);

    //    ��ѯ��������
    List<Chat> listChat();

    //��ѯ����
    Chat queryChat(Chat chat);

    //��������
    void updateChat(Chat chat);

    //    ɾ������
    void deleteChat(Chat chat);

    //ǰ̨��ѯ
    PageBean<Chat> receptionList(int pc, int ps);

}
