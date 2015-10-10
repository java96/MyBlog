<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="js/login.js">

    </script>
    <title>登陆博客</title>
    <!-- Custom Theme files -->
    <link href="<%=basePath%>Login/css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <!-- Custom Theme files -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords"
          content="Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <!--Google Fonts-->
    <link href='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400'
          rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet'
          type='text/css'>
    <!--Google Fonts-->

</head>
<body>
<div class="login">
    <h2>登陆页面</h2>

    <div class="login-top">
        <h1>用户登陆</h1>

        <form action="user_login" method="post">
            <input type="text" name="user.username" value="请输入用户名" onFocus="this.value = '';"
                   onblur="if (this.value == '') {this.value = '请输入用户名';}"/>
            <input type="text" name="user.password" value="请输入密码"
                   onfocus="if(this.value==defaultValue) {this.value='';this.type='password'}"
                   onblur="if(!value) {value=defaultValue; this.type='text';}"/><br>

            <img name="d" src="<%=basePath%>authImg.jsp">

            <input type="text"  name="vercode" value="请输入验证码" style="width:45%;" onFocus="this.value = '';"
                   onblur="if (this.value == '') {this.value = '请输入验证码';}">

            <div class="forgot">
                <s:actionmessage/>
                <br><br>
                <a href="#">忘记密码</a>
                <input type="submit" value="登陆"/>
            </div>
        </form>

    </div>

    <div class="login-bottom">
        <h3>新用户<a href="<%=basePath%>Login/register.jsp">注册</a></h3>
    </div>
</div>
<div class="copyright">
    <p>Copyright &copy; 2015.Company name All rights reserved.<a target="_blank" href="#">篷子</a></p>
</div>


</body>
</html>
