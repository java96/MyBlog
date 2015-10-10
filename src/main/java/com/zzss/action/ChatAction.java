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

    //    所依赖的服务层
    private ChatManager chatManager;
    //    实体类
    private Chat chat;

    //    页数控制
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


    //    添加文章
    public String addChat() throws Exception {
        chatManager.addChat(getChat());
        return "listChat";
    }

    //    查询所有文章
    public String listChat() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("listChat", chatManager.listChat());
        return "listChat";
    }

    //    查询文章
    public String queryChat() throws Exception {
        ActionContext act = ActionContext.getContext();
        act.put("Achat", chatManager.queryChat(getChat()));
        return "updateChat";
    }

    //    修改文章
    public String updateChat() throws Exception {
        chatManager.updateChat(getChat());
        return "listChat";
    }

    //    删除文章
    public String deleteChat() throws Exception {
        chatManager.deleteChat(getChat());
        return "listChat";
    }

    //      前台显示+分页
    public String receptionList() throws Exception {
        ActionContext act = ActionContext.getContext();
        int pc = getPageBean().getPc();
        int ps = 10;
        act.put("chatList", chatManager.receptionList(pc, ps));
        return "receptionList";
    }
}
