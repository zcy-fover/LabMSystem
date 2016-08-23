<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>实验室管理系统</title>
</head>

<!--引入CSS-->
<link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/assets/css/myStyle.css" rel="stylesheet" type="text/css">
<!--引入JS-->
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>

<body class="bodyBackgroundStyle">
<h2 style="width: 1000px;margin: 0 auto;border: 1px solid black;text-align: center;font-size:50px;">实验室管理系统<br/><p style="text-indent:780px;font-size: 15px;">学生：${student.name}</p></h2>
<div style="width:1000px;margin:0 auto;text-align:center;border: 1px solid blue;">
  <marquee class=p131 scrollAmount=3 scrollDelay=60 direction=left height=70px onmouseover="this.stop()" onmouseout="this.start ()" align="left" width: 200px;>
    <p style="font-size: 40px;color: #761c19;">实验室公告:${pulish.name} ${pulish.context}</p>
  </marquee>
</div>
<%--采用float:left 比较好--%>
<div style="width: 1000px;height: 600px;margin: 0 auto;border: 1px solid blue;">
  <div  style="border: 1px;width: 100px;height: 600px;float: left;font-size: 15px;">
    <div><a href="#" id="usualclasses"  style="color: aqua">查看课表</a></div>
    <div><a href="#" id="project"  style="color: aqua">实验项目预约</a> </div>
    <div><a href="#" id="classes"  style="color: aqua">查看实验课表</a></div>
    <div><a href="#" id="teach"  style="color: aqua">实验教学</a> </div>
    <div><a href="#" id="practice"  style="color: aqua">实验实践</a> </div>
    <div><a href="#" id="number"  style="color: aqua">数据提交</a> </div>
  </div>

  <div  style="border: 1px solid black;width: 897px;height: auto;float: left;">
    <div id="rightcontext_1">欢迎登录系统</div>
    <div id="rightcontext_2"></div>
  </div>
</div>



<script>

  $(function(){

    $("#teach").click(function(){
      $("#rightcontext_1").addClass("hidden");
      $("#rightcontext_2").addClass("hover").html("<iframe src='/student/teach' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
    });

    $("#usualclasses").click(function(){
      $("#rightcontext_1").addClass("hidden");
      $("#rightcontext_2").addClass("hover").html("<iframe src='/student/usualclasses' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
    });

    $("#classes").click(function(){
      $("#rightcontext_1").addClass("hidden");
      $("#rightcontext_2").addClass("hover").html("<iframe src='/student/classes' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
    });

    $("#project").click(function(){
      $("#rightcontext_1").addClass("hidden");
      $("#rightcontext_2").addClass("hover").html("<iframe src='/student/project' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
    });

    $("#practice").click(function(){
      $("#rightcontext_1").addClass("hidden");
      $("#rightcontext_2").addClass("hover").html("<iframe src='/student/practice' width='890px' height='600px' scrolling='no' frameborder='0' ></iframe>");
    });

    $("#number").click(function(){
      $("#rightcontext_1").addClass("hidden");
      $("#rightcontext_2").addClass("hover").html("<iframe src='/student/number' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
    });
  })

</script>
</body>
</html>
