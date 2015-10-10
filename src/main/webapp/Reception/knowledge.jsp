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
        <a href="/" class="n2">留言板</a>
    </h1>

    <div class="about left">
        <!-- 多说评论框 start -->
        <ul>
            <div class="ds-thread" data-thread-key="521216" data-title="篷子博客" data-url="http://www.zzss.xyz"></div>
        </ul>
        <!-- 多说评论框 end -->
        <!-- 多说公共JS代码 start (一个网页只需插入一次) -->

        <script type="text/javascript">
            var duoshuoQuery = {short_name: "zzss"};
            (function () {
                var ds = document.createElement('script');
                ds.type = 'text/javascript';
                ds.async = true;
                ds.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') + '//static.duoshuo.com/embed.js';
                ds.charset = 'UTF-8';
                (document.getElementsByTagName('head')[0]
                || document.getElementsByTagName('body')[0]).appendChild(ds);
            })();
        </script>
        <!-- 多说公共JS代码 end -->
    </div>
    <aside class="right">
        <div class="about_c">
            <img src="<%=basePath%>Reception/images/aboutphoto.jpg"></a>
        </div>
    </aside>
</article>
<footer>
    <p>Copyright &copy; 2015.篷子 All rights reserved.</p>
</footer>
</body>
</html>