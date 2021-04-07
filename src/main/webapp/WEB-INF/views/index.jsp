<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <h1>登录页</h1>
    <form action="/security/login" method="post">
        <div class="row">
            用户名：<input type="text" name="username">
        </div>
        <div class="row">
            密&nbsp;&nbsp; 码：<input type="password" name="password">
        </div>
        <input type="submit" value="登录">
    </form>
</body>
</html>
