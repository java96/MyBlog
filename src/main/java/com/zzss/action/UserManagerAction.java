package com.zzss.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zzss.entity.User;
import com.zzss.service.UserManager;
import org.springframework.context.ApplicationContext;

/**
 * Created by shach on 2015/9/19.
 */
public class UserManagerAction extends ActionSupport {

    //����User��service
    private UserManager userManager;
    // ��װ�������
    private User user;

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //����û�
    public String add() throws Exception {
        //��ע����һ������
        if ((userManager.validregister(user)) > 0) {
            return "userList";
        } else {
            System.out.println("User Add Error!");
            return "userAdd";
        }

    }

    //����ID��ѯ�û�
    public String selectUser() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        ctx.getSession().put("user", userManager.findUserById(getUser()));
        return "userAList";
    }

    //����ID�޸��û��ĵ�һ������ѯ�û�
    public String updateUserById() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        ctx.getSession().put("user", userManager.findUserById(getUser()));
        return "userUpdate";
    }

    //����ID�޸��û��ĵڶ������޸��û�
    public String updateUser() throws Exception {
        userManager.updateUser(getUser());
        return "userList";
    }

    //��ѯ�����û�
    public String findAll() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        ctx.put("userList", userManager.findAllUser());
        return "userList";
    }

    //����IDɾ���û�
    public String deleteUser() throws Exception {

        userManager.deleteUser(getUser());

        return "userList";
    }

}
