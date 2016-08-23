
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%--可以自动页面跳转<meta http-equiv="refresh" content="5;url=frontpage/successful_register.jsp">--%>
    <title></title>
</head>
<script>
  function out(obj){
    var i=obj;
    if(i==0){
      window.location.href='/frontpage/index';
    }

    document.getElementById("time").innerHTML=i;
    i--;
//    每一秒执行一次out(i)函数
    setTimeout("out("+i+")",1000);
  }
</script>
<body onload="out(5)">
<div style="left: 500px;position: absolute;">
  <div>注册成功</div>
  <div >5秒之后，浏览器会自动跳转到登录页面：<br/>
  <span id="time" style="color: red;"></span>秒，请稍候</div>
</div>
</body>
</html>
