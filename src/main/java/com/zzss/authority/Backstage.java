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
//        ȡ���������ActionContextʵ��
        ActionContext context = ActionContext.getContext();
        Map session = context.getSession();
//        ȡ���������Աʵ��
        User admin = (User) session.get("admin");
//        �ж��Ƿ�Ϊ��
        if (admin != null) {
            return invocation.invoke();
        }
//        ���Ϊ��������¼����
        context.put("msg", "��û�õ�¼�������˺�̨!");
        return Action.LOGIN;
    }
}
