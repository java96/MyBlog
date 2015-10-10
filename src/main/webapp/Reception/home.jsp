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
    <meta name="keywords" content="java个人博客,java写的博客,个人博客模板,ssh博客"/>
    <meta name="description" content="篷子个人博客，一个用java语言写的博客，和大家一起分享java的学习技术。"/>
    <link href="<%=basePath%>Reception/css/base.css" rel="stylesheet">
    <link href="<%=basePath%>Reception/css/index.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="<%=basePath%>Reception/js/modernizr.js"></script>
    <![endif]-->
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
<div class="banner"></div>
<article>
    <h2 class="title_tj">
        <p>文章推荐</p>
    </h2>
    <div class="bloglist left">
        <h3>程序员请放下你的技术情节，与你的同伴一起进步</h3>
        <figure><img src="images/001.png"></figure>
        <ul>
            <p>如果说掌握一门赖以生计的技术是技术人员要学会的第一课的话， 那么我觉得技术人员要真正学会的第二课，不是技术，而是业务、交流与协作，学会关心其他工作伙伴的工作情况和进展...</p>
            <a title="/" href="/" target="_blank" class="readmore">阅读全文>></a>
        </ul>
        <p class="dateview"><span>2015-09-24</span><span>作者：lipeng</span></p>
    </div>
    <aside class="right">


        <div class="news">
            <h3>
                <p>最新文章</p>
            </h3>
            <ul class="rank">
                <li><a href="/" title="Column 三栏布局 个人网站模板" target="_blank">Column 三栏布局 个人网站模板</a></li>
                <li><a href="/" title="with love for you 个人网站模板" target="_blank">with love for you 个人网站模板</a></li>
                <li><a href="/" title="免费收录网站搜索引擎登录口大全" target="_blank">免费收录网站搜索引擎登录口大全</a></li>
                <li><a href="/" title="做网站到底需要什么?" target="_blank">做网站到底需要什么?</a></li>
                <li><a href="/" title="企业做网站具体流程步骤" target="_blank">企业做网站具体流程步骤</a></li>
                <li><a href="/" title="建站流程篇――教你如何快速学会做网站" target="_blank">建站流程篇――教你如何快速学会做网站</a></li>
                <li><a href="/" title="box-shadow 阴影右下脚折边效果" target="_blank">box-shadow 阴影右下脚折边效果</a></li>
                <li><a href="/" title="打雷时室内、户外应该需要注意什么" target="_blank">打雷时室内、户外应该需要注意什么</a></li>
            </ul>
            <h3 class="ph">
                <p>点击排行</p>
            </h3>
            <ul class="paih">
                <li><a href="/" title="Column 三栏布局 个人网站模板" target="_blank">Column 三栏布局 个人网站模板</a></li>
                <li><a href="/" title="withlove for you 个人网站模板" target="_blank">with love for you 个人网站模板</a></li>
                <li><a href="/" title="免费收录网站搜索引擎登录口大全" target="_blank">免费收录网站搜索引擎登录口大全</a></li>
                <li><a href="/" title="做网站到底需要什么?" target="_blank">做网站到底需要什么?</a></li>
                <li><a href="/" title="企业做网站具体流程步骤" target="_blank">企业做网站具体流程步骤</a></li>
            </ul>
            <h3 class="links">
                <p>友情链接</p>
            </h3>
            <ul class="website">
                <li><a href="/">个人博客</a></li>
                <li><a href="/">谢泽文个人博客</a></li>
                <li><a href="/">3DST技术网</a></li>
                <li><a href="/">思衡网络</a></li>
            </ul>
        </div>

        <a href="/" class="weixin"> </a></aside>
</article>
<footer>
    <p>Copyright &copy; 2015.篷子 All rights reserved.</p>
</footer>
</body>
</html>
