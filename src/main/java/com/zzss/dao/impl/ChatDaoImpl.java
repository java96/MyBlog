package com.zzss.dao.impl;

import com.zzss.common.PageBean;
import com.zzss.common.impl.BaseDaoImpl;
import com.zzss.dao.ChatDao;
import com.zzss.entity.Chat;

import java.util.List;

/**
 * Created by songs on 2015/10/2.
 */
public class ChatDaoImpl extends BaseDaoImpl<Chat> implements ChatDao {

    //    �������
    public void addChat(Chat chat) {
        save(chat);
    }

    //    ��ѯ��������
    public List<Chat> listChat() {
        return findAll(Chat.class);
    }

    //    ID��ѯ����
    public Chat queryChat(Chat chat) {
        return get(Chat.class, chat.getId());
    }

    //    ��������
    public void updateChat(Chat chat) {
        update(chat);
    }

    //      ɾ������
    public void deleteChat(Chat chat) {
        delete(Chat.class, chat.getId());
    }

    //      ǰ̨��ѯ
    public PageBean<Chat> receptionList(int pc, int ps) {
        PageBean<Chat> pageBean = new PageBean<Chat>();
        pageBean.setPc(pc);
        pageBean.setPs(ps);
        //      �ܼ�¼��
        int tr = (int) findCount(Chat.class);
        pageBean.setTr(tr);
        //      Ҫ��ѯ��HQL���
        String hql = "select c from Chat c";
        List<Chat> chats = findByPage(hql, pc, ps);
        pageBean.setBeanList(chats);
        return pageBean;
    }
}
