<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>上传页面</title>
</head>
<body>
    单个文件上传：<br/>
    <form action="/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file"/><br/>
        <input type="submit" value="提交上传"/>
    </form>
    <br/>
    多个文件上传：<br/>
    <form action="/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file"/><br/>
        <input type="file" name="file"/><br/>
        <input type="file" name="file"/><br/>
        <<input type="submit" value="上传多个文件">
    </form>
</body>
</html>