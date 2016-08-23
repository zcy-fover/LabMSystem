<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link href="${pageContext.request.contextPath}/assets/css/myStyle.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#7fffd4">
<div class="registerStyle">

  <h2 align="center"><font face="微软雅黑">实验室管理系统用户注册</font></h2>
  <form action="/background/register" method="post" class="formStyle">
     类别：<select name="category"  style="width: 200px;">
            <option>学生</option>
            <option>教师</option>
            <option>实验室管理员</option>
         </select><br/>
      用户：<input type="text" name="username" value="" style="width: 200px;"/><br/>
      密码：<input type="password" name="password" value="" style="width: 200px;"/><br/>
      <p align="center"><input type="submit" value="注册"/></p>
  </form>
</div>
</body>
</html>
