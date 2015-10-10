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
    <title>篷子个人博客网站</title>
    <meta name="keywords" content="java个人博客,java写的博客,个人博客模板,ssh博客"/>
    <meta name="description" content="篷子个人博客，一个用java语言写的博客，和大家一起分享java的学习技术。"/>
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
<article class="blogs">
    <h1 class="t_nav"><a href="/" class="n1">网站首页</a><a href="/" class="n2">学无止境</a></h1>

    <div class="newblog left">
        <s:iterator value="#request.learnList.beanList">
            <h2> ${learnTitle}</h2>

            <p class="dateview"><span>
             发布时间： <s:date name="learnCommtime" format="yyyy-MM-dd"/> </span><span>作者：${learnName}</span></p>
            <figure><img src="images/001.png"></figure>
            <ul class="nlist">
                    <%--给显示文字做判断--%>
                <s:if test="%{null!=learnText&&learnText.length()>300}">
                    <s:property value="%{learnText.substring(0, 300)}"/>
                </s:if>
                <s:else>
                    ${learnText}
                </s:else>
                <a title="/" href="<%=basePath%>learn_clickLearn?learn.id=${id}" target="_blank"
                   class="readmore">阅读全文>></a>
            </ul>
            <div class="line"></div>
            <div class="blank"></div>
        </s:iterator>

        <div class="page">

            <a href="<%=basePath%>learn_receptionLearn?pageBean.pc=1">&lt;&lt;</a>
            <s:if test="#request.learnList.pc > 1">
                <a href="<%=basePath%>learn_receptionLearn?pageBean.pc=${learnList.pc -1}">&lt;</a>
            </s:if>
            共${learnList.tp}页/当前第${learnList.pc}页
            <s:if test="#request.learnList.tp > #request.learnList.pc">
                <a href="<%=basePath%>learn_receptionLearn?pageBean.pc=${learnList.pc + 1}">&gt;</a>
            </s:if>
            <a href="<%=basePath%>learn_receptionLearn?pageBean.pc=${learnList.tp}">&gt;&gt;</a>

        </div>
    </div>
    <aside class="right">
        <div class="news">
            <h3>
                <p>推荐文章</p>
            </h3>

            <ul class="rank">
                <s:iterator value="#request.recoTitle">
                    <li><a href="<%=basePath%>learn_clickLearn?learn.id=${id}" title="${learnTitle}"
                           target="_blank">${learnTitle}</a></li>
                </s:iterator>
            </ul>

            <h3 class="ph">
                <p>热门点击</p>
            </h3>
            <ul class="paih">
                <s:iterator value="#request.clickTitle">
                    <li><a href="<%=basePath%>learn_clickLearn?learn.id=${id}" title=" "
                           target="_blank">${learnTitle}</a></li>
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