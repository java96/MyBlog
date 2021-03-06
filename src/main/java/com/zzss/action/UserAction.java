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

    //配置User的service
    private UserManager userManager;
    // 封装请求参数
    private User user;
    // 登录的验证码
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
        // 获取HttpSession中的rand属性
        String ver2 = (String) ctx.getSession().get("rand");
        // 验证码校验
        if (vercode.equalsIgnoreCase(ver2)) {
            //获取用户ip地址
            String remoteAddr = ServletActionContext.getRequest().getRemoteAddr();

            int result = userManager.validLogin(getUser());

            //  普通用户登录校验
            if (result == 1) {
                ctx.getSession().put("user", getUser());
                return "user";
            } else if (result == 2) {
                ctx.getSession().put("admin", getUser());
                return "admin";
            }
            ctx.put("msg", "用户名/密码不匹配");
            return LOGIN;
        } else {
            // 验证码不匹配
            ctx.put("msg", "验证码不匹配,请重新输入");
            return LOGIN;
        }
    }

    //用户注册Action
    public String register() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        // 获取HttpSession中的rand属性
        String ver2 = (String) ctx.getSession().get("rand");
        // 验证码校验
        if (vercode.equalsIgnoreCase(ver2)) {

            if ((userManager.validregister(user)) > 0) {
                ctx.put("msg", "用户注册成功!");
                return "login";
            }
            ctx.put("msg", "用户名已存在,请换一个用户名!");
            return "register";
        }
        // 验证码不匹配
        ctx.put("msg", "验证码不匹配,请重新输入!");
        return "register";
    }

}
