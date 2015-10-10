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
    <link href="<%=basePath%>Reception/css/style.css" rel="stylesheet">
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
<article class="blogs">
    <h1 class="t_nav"><a href="/" class="n1">网站首页</a><a href="/" class="n2">我的日记</a></h1>

    <div class="newblog left">
        <s:iterator value="#request.diaryList.beanList">
            <h2>${diaryTitle}</h2>

            <p class="dateview"><span>发布时间：<s:date name="diaryTime" format="yyyy-MM-dd"/> </span>
                <span>作者：${diaryUser}</span></p>
            <figure>
                <img src="images/001.png">
            </figure>
            <ul class="nlist">
                    <%--给显示文字做判断--%>
                <s:if test="%{null!=diaryText&&diaryText.length()>300}">
                    <s:property value="%{diaryText.substring(0, 300)}"/>
                </s:if>
                <s:else>
                    ${diaryText}
                </s:else>
                <a title="阅读全文" href="<%=basePath%>diary_clickDiary?diary.id=${id}" target="_blank"
                   class="readmore">阅读全文>></a>
            </ul>

            <div class="line"></div>
            <div class="blank"></div>
        </s:iterator>

        <div class="page">
            <a href="<%=basePath%>diary_receptionDiary?pageBean.pc=1">&lt;&lt;</a>
            <s:if test="#request.diaryList.pc > 1">
                <a href="<%=basePath%>diary_receptionDiary?pageBean.pc=${diaryList.pc -1}">&lt;</a>
            </s:if>
            共${diaryList.tp}页/当前第${diaryList.pc}页
            <s:if test="#request.diaryList.tp > #request.diaryList.pc">
                <a href="<%=basePath%>diary_receptionDiary?pageBean.pc=${diaryList.pc + 1}">&gt;</a>
            </s:if>
            <a href="<%=basePath%>diary_receptionDiary?pageBean.pc=${diaryList.tp}">&gt;&gt;</a>
        </div>
    </div>
    <aside class="right">
        <div class="news">
            <h3>
                <p>推荐日记</p>
            </h3>
            <ul class="rank">
                <s:iterator value="#request.diaryRece">
                    <li><a href="<%=basePath%>diary_clickDiary?diary.id=${id}" title="${diaryTitle}"
                           target="_blank">${diaryTitle}</a></li>
                </s:iterator>
            </ul>
            <h3 class="ph">
                <p>点击排行</p>
            </h3>
            <ul class="paih">
                <s:iterator value="#request.diaryClick">
                    <li><a href="<%=basePath%>diary_clickDiary?diary.id=${id}" title="${diaryTitle}"
                           target="_blank">${diaryTitle}</a></li>
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