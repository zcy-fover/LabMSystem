
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <h2>公告发布</h2>
  <form action="/teacher/pulish/submit" method="post">
  公告题目:<input type="text" name="name"/><br/>
  <div style="margin: 10px;"></div>
  公告内容:<input type="text" name="context"/><br/>
  <div style="margin: 10px;"></div>
  <input type="submit" value="发布"/>
  </form>
</body>
</html>
