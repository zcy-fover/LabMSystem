<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>

<body>
<h2>仪器维护</h2>
<form action="/manage/repair/submit" method="post">
  维护仪器名称:<input type="text" name="name"/><br/>
  <div style="margin: 10px;"></div>
  该仪器的型号:<input type="text" name="version"/><br/>
  <div style="margin: 10px;"></div>
  仪器损坏的位置:<input type="text" name="point"/><br/>
  <div style="margin: 10px;"></div>
  维护次数:<input type="text" name="num"/><br/>
  <div style="margin: 10px;"></div>
  <input type="submit" value="提交"/>
</form>
</body>
</html>
