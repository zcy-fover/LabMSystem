
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<style>
  table th,td{width: 110px;height: 60px; padding: 10px;}
</style>
<body>
<h2 align="center">实验课表预览</h2>
<table border="1" style="border-collapse: collapse">
  <th></th><th>周一</th><th>周二</th><th>周三</th><th>周四</th><th>周五</th><th>周六</th><th>周日</th>
  <tr><td>第一二节</td><td>${experiment00}</td><td>${experiment10}</td><td>${experiment20}</td><td>${experiment30}</td><td>${experiment40}</td><td>${experiment50}</td><td>${experiment60}</td></tr>
  <tr><td>第三四节</td><td>${experiment01}</td><td>${experiment11}</td><td>${experiment21}</td><td>${experiment31}</td><td>${experiment41}</td><td>${experiment51}</td><td>${experiment61}</td></tr>
  <tr><td>第五六节</td><td>${experiment02}</td><td>${experiment12}</td><td>${experiment22}</td><td>${experiment32}</td><td>${experiment42}</td><td>${experiment52}</td><td>${experiment62}</td></tr>
  <tr><td>第七八节</td><td>${experiment03}</td><td>${experiment13}</td><td>${experiment23}</td><td>${experiment33}</td><td>${experiment43}</td><td>${experiment53}</td><td>${experiment63}</td></tr>
</table>
</body>
</html>
