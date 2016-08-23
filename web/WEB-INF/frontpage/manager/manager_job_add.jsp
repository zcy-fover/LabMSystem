<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>耗材补充</h2>
<form action="/manage/add/submit" method="post">
  耗材名称:<input type="text" name="name"/><br/>
  <div style="margin: 10px;"></div>
  购买价格:<input type="text" name="price"/><br/>
  <div style="margin: 10px;"></div>
  购买数量:<input type="text" name="num"/><br/>
  <div style="margin: 10px;"></div>
  购买时间:<input type="text" name="time"/><br/>
  <div style="margin: 10px;"></div>
  该耗材的主要作用:<input type="text" name="function"/><br/>
  <div style="margin: 10px;"></div>
  <input type="submit" value="提交"/>
</form>
</body>
</html>
