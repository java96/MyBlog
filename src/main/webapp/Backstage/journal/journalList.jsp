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
                <li><a href="<%=basePath%>Reception/home.jsp" target="_blank">网站首页</a></li>
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
                        <li><a href="chat_listChat"><i class="icon-font">&#xe012;</i>有点意思</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe004;</i>留言管理</a></li>
                        <li><a href="aboutMi_queryAboutMi?aboutMi.id=1"><i class="icon-font">&#xe033;</i>关于我</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!--/sidebar-->
    <div class="main-wrap">
        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="<%=basePath%>Reception/home.jsp">首页</a><span
                    class="crumb-step">&gt;</span><span class="crumb-name">用户管理</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-title">
                <div class="result-list">
                    <a href="<%=basePath%>Backstage/journal/journalAdd.jsp"><i class="icon-font"></i>添加日志</a>
                </div>
            </div>
            <div class="result-content">
                <table class="result-tab" width="100%">
                    <tr>
                        <th>日志ID</th>
                        <th>日志标题</th>
                        <th>日记推荐</th>
                        <th>日志内容</th>
                        <th>提交时间</th>
                        <th>操作</th>
                    </tr>
                    <s:iterator value="#request.journalListAll" var="journal">
                        <tr>
                            <td>${id}</td>
                            <td>${journalTitle}</td>
                            <td>${journalRecommend}</td>
                            <td>
                                    <%--给日志长度做判断--%>
                                <s:if test="%{null!=journalText&&journalText.length()>60}">
                                    <s:property value="%{journalText.substring(0, 60)}"/>
                                </s:if>
                                <s:else>
                                    <s:property value="%{journalText}"/>
                                </s:else>
                            </td>
                            <td><s:date name="journalDate" format="yyyy-MM-dd hh:mm"/></td>
                            <td>
                                <a href="journal_queryById?journal.id=${journal.id}">修改</a>
                                <a href="journal_deleteJournal?journal.id=${journal.id}">删除</a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
                <div class="list-page"> 2 条 1/1 页</div>
            </div>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>



