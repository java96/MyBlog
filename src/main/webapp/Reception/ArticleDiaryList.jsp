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
    <title>杨青个人博客网站—一个站在web前段设计之路的女技术员个人博客网站</title>
    <meta name="keywords" content="个人博客,杨青个人博客,个人博客模板,杨青"/>
    <meta name="description" content="杨青个人博客，是一个站在web前端设计之路的女程序员个人网站，提供个人博客模板免费资源下载的个人原创网站。"/>
    <link href="<%=basePath%>Reception/css/base.css" rel="stylesheet">
    <link href="<%=basePath%>Reception/css/new.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/modernizr.js"></script>
    <![endif]-->
</head>
<body>
<header>
    <div id="logo"><a href="/"></a></div>
    <nav class="topnav" id="topnav">
        <a href="<%=basePath%>Reception/home.jsp"><span>首页</span><span class="en">Home</span></a><a
            href="<%=basePath%>Reception/journallist.jsp"><span>我的日志</span><span class="en">Journal</span></a><a
            href="<%=basePath%>Reception/diaryllist.jsp"><span>我的日记</span><span class="en">Diary</span></a><a
            href="<%=basePath%>learn_receptionLearn?pageBean.pc=1"><span>学无止境</span><span class="en">Learn</span></a><a
            href="<%=basePath%>chat_receptionList?pageBean.pc=1"><span>有点意思</span><span class="en">Chat</span></a><a
            href="<%=basePath%>knowledge"><span>留言板</span><span class="en">Message</span></a><a
            href="<%=basePath%>aboutMi_receptionList?aboutMi.id=1"><span>关于我</span><span class="en">About</span></a><a
            href="<%=basePath%>Login/login.jsp"><span>登陆</span><span class="en">Login</span></a>
    </nav>
</header>
<article class="blogs">
    <h1 class="t_nav"><br><br></h1>
    <s:iterator value="#request.diaryList">
        <div class="index_about">
            <h2 class="c_titile">${diaryTitle}</h2>

            <p class="box_c"><span class="d_time">发布时间：<s:date name="diaryTime" format="yyyy-MM-dd"/></span>
                <span>作者：${diaryUser}</span>
            </p>
            <ul class="infos">
                    ${diaryText}
            </ul>
        </div>
    </s:iterator>
</article>
<footer>
    <p>Copyright &copy; 2015.篷子 All rights reserved.</p>
</footer>
<script src="js/silder.js"></script>
</body>
</html>