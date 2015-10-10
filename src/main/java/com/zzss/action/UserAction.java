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
            //�������ӵ�¼IP��ַ
            getUser().setOldIpaddress(remoteAddr);
            //�������ӵ�¼ʱ��
            getUser().setEndTime(new Date());

            int result = userManager.validLogin(getUser());
            //  ��ͨ�û���¼У��
            if (result == 1) {
                ctx.getSession().put("user", user);
                return "user";
            } else if (result == 2) {
                ctx.getSession().put("admin", user);
                return "admin";
            }
            addActionMessage("�û���/���벻ƥ��");
            return INPUT;
        } else {
            // ��֤�벻ƥ��
            addActionMessage("��֤�벻ƥ��,����������");
            return INPUT;
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
                ctx.put("userregister", "�û���ӳɹ�");
                return "login";
            }
            System.out.println("User error");
            return "register";
        }
        // ��֤�벻ƥ��
        addActionMessage("��֤�벻ƥ��,����������");
        System.out.println("User ma error");
        return "register";
    }

}
