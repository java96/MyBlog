<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>Backstage/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>Backstage/css/main.css"/>
    <script type="text/javascript" src="<%=basePath%>Backstage/js/libs/modernizr.min.js"></script>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="index.html">首页</a></li>
                <li><a href="#" target="_blank">网站首页</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">管理员</a></li>
                <li><a href="#">修改密码</a></li>
                <li><a href="#">退出</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <ul class="sub-menu">
                        <li><a href="userManager_findAll"><i class="icon-font">&#xe008;</i>用户管理</a></li>
                        <li><a href="journal_listJournalAll"><i class="icon-font">&#xe005;</i>日志管理</a></li>
                        <li><a href="diary_listDiary"><i class="icon-font">&#xe006;</i>日记管理</a></li>
                        <li><a href="learn_listLearnAll"><i class="icon-font">&#xe052;</i>学无止境</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe012;</i>有点意思</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe004;</i>留言管理</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe033;</i>关于我</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="<%=basePath%>Reception/home.jsp">首页</a><span
                    class="crumb-step">&gt;</span><a class="crumb-name" href="/jscss/admin/design/">用户管理</a><span
                    class="crumb-step">&gt;</span><span>添加用户</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <s:iterator value="#session.user">
                    <table class="insert-tab" width="100%">
                        <tbody>
                        <tr>
                            <th><i class="require-red">*</i>用户ID：</th>
                            <td>
                                    ${id}
                            </td>
                        </tr>

                        <tr>
                            <th><i class="require-red">*</i>用户名：</th>
                            <td>
                                    ${username}
                            </td>
                        </tr>

                        <tr>
                            <th><i class="require-red">*</i>密&nbsp;&nbsp;&nbsp;码：</th>
                            <td>
                                    ${password}
                            </td>
                        </tr>

                        <tr>
                            <th><i class="require-red">*</i>年&nbsp;&nbsp;&nbsp;龄：</th>
                            <td>
                                    ${age}
                            </td>
                        </tr>
                        <tr>
                            <th width="120"><i class="require-red">*</i>性&nbsp;&nbsp;&nbsp;别：</th>
                            <td>

                                <s:if test="sex == '1'">男</s:if>
                                <s:else>女</s:else><br>
                            </td>
                        </tr>

                        <tr>
                            <th><i class="require-red">*</i>邮&nbsp;&nbsp;&nbsp;箱：</th>
                            <td>
                                    ${email}
                            </td>
                        </tr>

                        <tr>
                            <th><i class="require-red">*</i>联系电话：</th>
                            <td>
                                    ${phone}
                            </td>
                        </tr>

                        <tr>
                            <th><i class="require-red">*</i>注册时间：</th>
                            <td>
                                <s:date name="registerTime" format="yyyy-MM-dd hh:mm"/>
                            </td>
                        </tr>

                        <tr>
                            <th><i class="require-red">*</i>最后登录时间：</th>
                            <td>
                                <s:date name="endTime" format="yyyy-MM-dd hh:mm"/>
                            </td>
                        </tr>

                        <tr>
                            <th><i class="require-red">*</i>最后登录IP：</th>
                            <td>
                                    ${oldIpaddress}
                            </td>
                        </tr>

                        <th></th>
                        <td>
                            <input class="btn btn6" onclick="history.go(-1)" value="返回" type="button">
                        </td>
                        </tr>
                        </tbody>
                    </table>
                </s:iterator>
            </div>
        </div>

    </div>
    <!--/main-->
</div>
</body>
</html>