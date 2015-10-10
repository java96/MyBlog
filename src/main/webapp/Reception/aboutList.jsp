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
    <meta name="keywords" content="个人博客,篷子个人博客,松树篷子,java博客"/>
    <meta name="description" content="松树篷子，篷子个人博客，一个与大家分享java技术的个人网站，提供个人学习分享资源的下载网站。"/>
    <link href="<%=basePath%>Reception/css/base.css" rel="stylesheet">
    <link href="<%=basePath%>Reception/css/about.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="<%=basePath%>Reception/js/modernizr.js"></script>
    <![endif]-->
    <link href='http://fonts.googleapis.com/css?family=Architects+Daughter' rel='stylesheet' type='text/css'>
</head>
<body>
<header>
    <div id="logo"><a href="/"></a></div>
    <nav class="topnav" id="topnav">
        <a href="<%=basePath%>Reception/home.jsp"><span>首页</span><span class="en">Home</span></a><a
            href="<%=basePath%>journal_receptionJournal?pageBean.pc=1"><span>我的日志</span><span class="en">Journal</span></a><a
            href="<%=basePath%>diary_receptionDiary?pageBean.pc=1"><span>我的日记</span><span class="en">Diary</span></a><a
            href="<%=basePath%>learn_receptionLearn?pageBean.pc=1"><span>学无止境</span><span class="en">Learn</span></a><a
            href="<%=basePath%>chat_receptionList?pageBean.pc=1"><span>有点意思</span><span class="en">Chat</span></a><a
            href="<%=basePath%>knowledge"><span>留言板</span><span class="en">Message</span></a><a
            href="<%=basePath%>aboutMi_receptionList?aboutMi.id=1"><span>关于我</span><span class="en">About</span></a><a
            href="<%=basePath%>Login/login.jsp"><span>登陆</span><span class="en">Login</span></a>
    </nav>
</header>
<article class="aboutcon">
    <h1 class="t_nav">
        <a href="/" class="n1">网站首页</a>
        <a href="/" class="n2">关于我</a>
    </h1>
    <s:iterator value="#session.aboutMi">
    <div class="about left">
        <h2>Just about me</h2>
        <ul> ${justMe}</ul>
        <h2>About my blog</h2>
        <ul> ${aboutBlog}</ul>

    </div>
    <aside class="right">
        <div class="about_c">
            <p>网名：<span>${userName}</span></p>

            <p>姓名：${myName} </p>

            <p>生日：<s:date name="birthday" format="yyyy-MM-dd"/></p>

            <p>籍贯：${hometown}</p>

            <p>现居：${live}</p>

            <p>职业：${occupation}</p>

            <p>喜欢：${likeAll}</p>

            <img src="<%=basePath%>Reception/images/aboutphoto.jpg"></a>

            </s:iterator>
        </div>

    </aside>
</article>
<footer>
    <p>Copyright &copy; 2015.篷子 All rights reserved.</p>
</footer>
</body>
</html>



