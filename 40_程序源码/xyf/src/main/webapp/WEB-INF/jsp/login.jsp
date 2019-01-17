<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页</title>
</head>
<body>
 <form method="get" action="/user/login">
     用户名：<input type="text" name="cName">
     密码：<input type="text" name="cPassword">
     <input type="submit" value="登录">
 </form>
</body>
</html>