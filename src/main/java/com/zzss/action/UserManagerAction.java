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

    //配置User的service
    private UserManager userManager;
    // 封装请求参数
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

    //添加用户
    public String add() throws Exception {
        //和注册用一个方法
        if ((userManager.validregister(user)) > 0) {
            return "userList";
        } else {
            System.out.println("User Add Error!");
            return "userAdd";
        }

    }

    //根据ID查询用户
    public String selectUser() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        ctx.getSession().put("user", userManager.findUserById(getUser()));
        return "userAList";
    }

    //根据ID修改用户的第一步，查询用户
    public String updateUserById() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        ctx.getSession().put("user", userManager.findUserById(getUser()));
        return "userUpdate";
    }

    //根据ID修改用户的第二步，修改用户
    public String updateUser() throws Exception {
        userManager.updateUser(getUser());
        return "userList";
    }

    //查询所有用户
    public String findAll() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        ctx.put("userList", userManager.findAllUser());
        return "userList";
    }

    //根据ID删除用户
    public String deleteUser() throws Exception {

        userManager.deleteUser(getUser());

        return "userList";
    }

}
