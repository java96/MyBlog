<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="gb2312">
    <title>篷子个人博客网站|一个热爱编程的年轻小伙子</title>
    <meta name="keywords" content="个人博客,篷子个人博客,个人博客模板,篷子"/>
    <meta name="description" content="篷子个人博客，一个与大家分享java技术的个人网站，提供个人学习分享资源的下载网站。"/>
    <link href="<%=basePath%>Reception/css/base.css" rel="stylesheet">
    <link href="<%=basePath%>Reception/css/mood.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="<%=basePath%>Reception/js/modernizr.js"></script>
    <![endif]-->
</head>
<body>
<header>
    <div id="logo"><a href="/"></a></div>
    <nav class="topnav" id="topnav">
        <a href="<%=basePath%>home_receptionHome?pageBean.pc=1"><span>首页</span><span class="en">Home</span></a><a
            href="<%=basePath%>journal_receptionJournal?pageBean.pc=1"><span>我的日志</span><span class="en">Journal</span></a><a
            href="<%=basePath%>diary_receptionDiary?pageBean.pc=1"><span>我的日记</span><span class="en">Diary</span></a><a
            href="<%=basePath%>learn_receptionLearn?pageBean.pc=1"><span>学无止境</span><span class="en">Learn</span></a><a
            href="<%=basePath%>chat_receptionList?pageBean.pc=1"><span>有点意思</span><span class="en">Chat</span></a><a
            href="<%=basePath%>knowledge"><span>留言板</span><span class="en">Message</span></a><a
            href="<%=basePath%>aboutMi_receptionList?aboutMi.id=1"><span>关于我</span><span class="en">About</span></a><a
            href="<%=basePath%>Login/login.jsp"><span>登陆</span><span class="en">Login</span></a>
    </nav>
</header>
<div class="moodlist">
    <h1 class="t_nav">
        <a href="/" class="n1">网站首页</a><a href="/" class="n2">有点意思</a></h1>
    <s:iterator value="#request.chatList.beanList">
        <div class="bloglist">
            <ul class="arrow_box">
                <div class="sy">
                        ${chatText}
                </div>
                <span class="dateview"><s:date name="chatCommTime" format="yyyy-MM-dd"/> </span>
            </ul>
        </div>
    </s:iterator>
    <div class="page">

        <a href="<%=basePath%>chat_receptionList?pageBean.pc=1">&lt;&lt;</a>

        <s:if test="#request.chatList.pc > 1">
            <a href="<%=basePath%>chat_receptionList?pageBean.pc=${chatList.pc -1}">&lt;</a>
        </s:if>
        共${chatList.tp}页/当前第${chatList.pc}页
        <s:if test="#request.chatList.tp > #request.chatList.pc">
            <a href="<%=basePath%>chat_receptionList?pageBean.pc=${chatList.pc + 1}">&gt;</a>
        </s:if>
        <a href="<%=basePath%>chat_receptionList?pageBean.pc=${chatList.tp}">&gt;&gt;</a>
    </div>
</div>
<footer>
    <p>Copyright &copy; 2015.篷子 All rights reserved.</p>
</footer>
</body>
</html>