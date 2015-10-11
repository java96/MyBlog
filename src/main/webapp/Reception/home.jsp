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
<div class="banner"></div>
<article>
    <h2 class="title_tj">
        <p>重要文章</p>
    </h2>
    <div class="bloglist left">
        <s:iterator value="#request.homeList.beanList">
            <h3>${homeTitle}</h3>
            <figure><img src="images/001.png"></figure>
            <ul>

                    <%--给显示文字做判断--%>
                <s:if test="%{null!=homeText&&homeText.length()>300}">
                    <s:property value="%{homeText.substring(0, 300)}"/>
                </s:if>
                <s:else>
                    ${homeText}
                </s:else>

                <a title="阅读全文" href="<%=basePath%>home_clickHome?home.id=${id}" target="_blank"
                   class="readmore">阅读全文>></a>
            </ul>
            <p class="dateview"><span><s:date name="homeTime" format="yyyy-MM-dd"/> </span><span>作者：${homeUser}</span>
            </p>
        </s:iterator>

        <%--page 开始--%>
        <div class="page">

            <a href="<%=basePath%>home_receptionHome?pageBean.pc=1">&lt;&lt;</a>
            <s:if test="#request.homeList.pc > 1">
                <a href="<%=basePath%>home_receptionHome?pageBean.pc=${homeList.pc -1}">&lt;</a>
            </s:if>
            共${homeList.tp}页/当前第${homeList.pc}页
            <s:if test="#request.homeList.tp > #request.homeList.pc">
                <a href="<%=basePath%>home_receptionHome?pageBean.pc=${homeList.pc + 1}">&gt;</a>
            </s:if>
            <a href="<%=basePath%>home_receptionHome?pageBean.pc=${homeList.tp}">&gt;&gt;</a>
        </div>
        <%--page 结束--%>
    </div>
    <aside class="right">
        <div class="news">
            <h3>
                <p>最新文章</p>
            </h3>
            <ul class="rank">
                <s:iterator value="#request.homeTime">
                    <li><a href="<%=basePath%>home_clickHome?home.id=${id}" title="${homeTitle}"
                           target="_blank">${homeTitle}</a></li>
                </s:iterator>
            </ul>
            <h3 class="ph">
                <p>点击排行</p>
            </h3>
            <ul class="paih">
                <s:iterator value="#request.homeClick">
                    <li><a href="<%=basePath%>home_clickHome?home.id=${id}" title="${homeTitle}"
                           target="_blank">${homeTitle}</a></li>
                </s:iterator>
            </ul>
        </div>
    </aside>
</article>
<footer>
    <p>Copyright &copy; 2015.篷子 All rights reserved.</p>
</footer>
</body>
</html>
