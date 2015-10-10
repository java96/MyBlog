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

    //    填加文章
    public void addChat(Chat chat) {
        save(chat);
    }

    //    查询所有文章
    public List<Chat> listChat() {
        return findAll(Chat.class);
    }

    //    ID查询文章
    public Chat queryChat(Chat chat) {
        return get(Chat.class, chat.getId());
    }

    //    更新文章
    public void updateChat(Chat chat) {
        update(chat);
    }

    //      删除文章
    public void deleteChat(Chat chat) {
        delete(Chat.class, chat.getId());
    }

    //      前台查询
    public PageBean<Chat> receptionList(int pc, int ps) {
        PageBean<Chat> pageBean = new PageBean<Chat>();
        pageBean.setPc(pc);
        pageBean.setPs(ps);
        //      总记录数
        int tr = (int) findCount(Chat.class);
        pageBean.setTr(tr);
        //      要查询的HQL语句
        String hql = "select c from Chat c";
        List<Chat> chats = findByPage(hql, pc, ps);
        pageBean.setBeanList(chats);
        return pageBean;
    }
}
