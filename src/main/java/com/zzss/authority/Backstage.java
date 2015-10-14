package com.zzss.authority;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.zzss.entity.User;

import java.util.Map;

/**
 * Created by songs on 2015/10/14.
 */
public class Backstage extends MethodFilterInterceptor {


    protected String doIntercept(ActionInvocation invocation) throws Exception {
//        取得请求相关ActionContext实例
        ActionContext context = ActionContext.getContext();
        Map session = context.getSession();
//        取出里面管理员实行
        User admin = (User) session.get("admin");
//        判断是否为空
        if (admin != null) {
            return invocation.invoke();
        }
//        如果为空跳到登录界面
        context.put("msg", "您没用登录操作不了后台!");
        return Action.LOGIN;
    }
}
