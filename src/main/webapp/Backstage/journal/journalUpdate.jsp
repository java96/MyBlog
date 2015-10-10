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
    <script src="<%=basePath%>ckeditor/ckeditor.js"></script>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="index.jsp">首页</a></li>
                <li><a href="#" target="_blank">网站首页</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="http://www.mycodes.net">管理员</a></li>
                <li><a href="http://www.mycodes.net">修改密码</a></li>
                <li><a href="http://www.mycodes.net">退出</a></li>
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
            <div class="crumb-list"><i class="icon-font"></i><a href="/jscss/admin/design/">首页</a><span
                    class="crumb-step">&gt;</span><a class="crumb-name" href="/jscss/admin/design/">作品管理</a><span
                    class="crumb-step">&gt;</span><span>新增作品</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <s:iterator value="#request.journalAList" var="journal">
                    <form action="journal_updateJournal" method="post" id="myform" name="myform"
                          enctype="multipart/form-data">
                        <table class="insert-tab" width="100%">
                            <tbody>
                            <tr>
                                <th><i class="require-red">*</i>标题：</th>
                                <td>
                                    <input class="common-text required" id="title" name="journal.journalTitle" size="50"
                                           value="${journalTitle}"
                                           type="text">
                                </td>
                            </tr>

                            <tr>
                                <th width="120"><i class="require-red">*</i>文章推荐：</th>
                                <td>
                                    <select name="journal.journalRecommend" id="catid" class="required">
                                        <option value="1">是</option>
                                        <option value="0">否</option>
                                    </select>
                                </td>
                            </tr>

                            <tr>
                                <th><i class="require-red">*</i>作者：</th>
                                <td><input class="common-text" name="journal.journalUser" size="50"
                                           value="${journalUser}"
                                           type="text"></td>
                            </tr>

                            <tr>
                                <th><i class="require-red">*</i>提交时间：</th>
                                <td><input class="common-text" name="journal.journalDate" size="50"
                                           value="${journalDate}"
                                           type="text"></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>缩略图：</th>
                                <td><input name="journal.journalImager" value="journal.journalImager" type="file"><!--<input type="submit" onclick="submitForm('/jscss/admin/design/upload')" value="上传图片"/>-->
                                </td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>内容：</th>
                                <td>
                                <textarea name="journal.journalText" id="editor1" rows="10" cols="80">
                                        ${journalText}
                                </textarea>
                                    <script>
                                        CKEDITOR.replace('editor1');
                                    </script>

                                </td>
                            </tr>
                            <tr>
                                <th></th>
                                <td>
                                    <input class="btn btn-primary btn6 mr10" value="更新" type="submit">
                                    <input class="btn btn6" onclick="history.go(-1)" value="返回" type="button">
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <input type="hidden" name="journal.id" value="${id}">
                    </form>
                </s:iterator>
            </div>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>