<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
    <!--引入CSS-->
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/assets/css/myStyle.css" rel="stylesheet" type="text/css">

    <!--引入JS-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>

  </head>
  <body class="bodyStyle">
    <div class="loginLayout">
    <span style="right:100px;">
      <a href="/frontpage/register" class="registerTitleStyle"> 注册 </a>
    </span>
    <h2>登录</h2><br/>

    <form action="login" method="post">

      <div class="input-group" style="margin: 10px;">
        <span class="input-group-addon">用户：</span>
        <input type="text" id="username" name="username"  class="form-control"  value=""placeholder="用户名"/>
      </div>
      <%--<p align="center">用户：--%>
        <%--<input type="text" id="username" name="username" value="" class="textStyle" placeholder="用户名"/>--%>
      <%--</p>--%>
      <div style="margin: 5px;"></div>
      <div class="input-group" style="margin: 10px;">
        <span class="input-group-addon">密码：</span>
        <input type="password" id="password" name="password"  class="form-control"  value=""placeholder="密码"/>
      </div><br>
      <%--<p align="center">密码：--%>
        <%--<input type="password" id="password" name="password" value="" class="textStyle" placeholder="密码"/>--%>
      <%--</p>--%>

      <div style="margin: 10px;"></div>
      <p align="center"><input type="radio"  class="category" name="category" value="学生" checked="checked"/>学生
      <input type="radio"  class="category" name="category" value="教师" />教师
      <input type="radio"  class="category" name="category" value="实验室管理员"/>实验室管理员<br/></p>
      <div style="margin: 10px;"></div>
      <p align="center">
        <input type="submit" id="submit" class="btn btn-primary" value="登录"/>
      </p>
    </form>
    </div>
  </body>
</html>

<script>
$(function(){
  $("#submit").click(function(){
    if(!$("#username").val()){
      alert("请输入你的用户名");
    }else if(!$("#password").val()){
      alert("请输入你的密码");
    }

//    获得单选框按钮的集合
//    var radios=$(".category");
//    var xz;
////    根据radios集合长度，遍历单选框按钮
//    for(var i=0;i<radios.length;i++){
////      判断哪个单选按钮为选中状态
//      if(radios[i].checked){
//        xz="checked";
//      }
//    }
//
//    if(xz!="checked"){
//      alert("请选择你的所属类别");
//    }
//
  });


})
</script>