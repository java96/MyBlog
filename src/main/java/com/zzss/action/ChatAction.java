package com.zzss.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zzss.common.PageBean;
import com.zzss.entity.Chat;
import com.zzss.service.ChatManager;

/**
 * Created by songs on 2015/10/2.
 */
public class ChatAction extends ActionSupport {

    //    �������ķ����
    private ChatManager chatManager;
    //    ʵ����
    private Chat chat;

    //    ҳ������
    private PageBean<Chat> pageBean;

    public PageBean<Chat> getPageBean() {
        return pageBean;
    }

    public Chat getChat() {
        return chat;
    }

    public void setPageBean(PageBean<Chat> pageBean) {
        this.pageBean = pageBean;
    }

    public void setChatManager(ChatManager chatManager) {
        this.chatManager = chatManager;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }


    //    �������
    public String addChat() throws Exception {
        chatManager.addChat(getChat());
        return "listChat";
    }

    //    ��ѯ��������
    public String listChat() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("listChat", chatManager.listChat());
        return "listChat";
    }

    //    ��ѯ����
    public String queryChat() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("Achat", chatManager.queryChat(getChat()));
        return "updateChat";
    }

    //    �޸�����
    public String updateChat() throws Exception {
        chatManager.updateChat(getChat());
        return "listChat";
    }

    //    ɾ������
    public String deleteChat() throws Exception {
        chatManager.deleteChat(getChat());
        return "listChat";
    }

    //      ǰ̨��ʾ+��ҳ
    public String receptionList() throws Exception {
        ActionContext act = ActionContext.getContext();
        int pc = getPageBean().getPc();
        int ps = 10;
        act.put("chatList", chatManager.receptionList(pc, ps));
        return "receptionList";
    }
}
