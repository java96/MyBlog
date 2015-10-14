package com.zzss.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zzss.entity.User;
import com.zzss.service.UserManager;
import org.apache.struts2.ServletActionContext;

import java.util.Date;

/**
 * Created by shach on 2015/9/15.
 */
public class UserAction extends ActionSupport {

    //����User��service
    private UserManager userManager;
    // ��װ�������
    private User user;
    // ��¼����֤��
    private String vercode;

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

    public String getVercode() {
        return vercode;
    }

    public void setVercode(String vercode) {
        this.vercode = vercode;
    }

    public String login() throws Exception {

        ActionContext ctx = ActionContext.getContext();
        // ��ȡHttpSession�е�rand����
        String ver2 = (String) ctx.getSession().get("rand");
        // ��֤��У��
        if (vercode.equalsIgnoreCase(ver2)) {
            //��ȡ�û�ip��ַ
            String remoteAddr = ServletActionContext.getRequest().getRemoteAddr();

            int result = userManager.validLogin(getUser());

            //  ��ͨ�û���¼У��
            if (result == 1) {
                ctx.getSession().put("user", getUser());
                return "user";
            } else if (result == 2) {
                ctx.getSession().put("admin", getUser());
                return "admin";
            }
            ctx.put("msg", "�û���/���벻ƥ��");
            return LOGIN;
        } else {
            // ��֤�벻ƥ��
            ctx.put("msg", "��֤�벻ƥ��,����������");
            return LOGIN;
        }
    }

    //�û�ע��Action
    public String register() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        // ��ȡHttpSession�е�rand����
        String ver2 = (String) ctx.getSession().get("rand");
        // ��֤��У��
        if (vercode.equalsIgnoreCase(ver2)) {

            if ((userManager.validregister(user)) > 0) {
                ctx.put("msg", "�û�ע��ɹ�!");
                return "login";
            }
            ctx.put("msg", "�û����Ѵ���,�뻻һ���û���!");
            return "register";
        }
        // ��֤�벻ƥ��
        ctx.put("msg", "��֤�벻ƥ��,����������!");
        return "register";
    }

}
