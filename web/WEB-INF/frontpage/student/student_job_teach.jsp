<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<%--<script>--%>

  <%--$(function(){--%>
    <%--$("#choose").bind("change",function(){--%>

      <%--if($(this).val()==0){--%>
        <%--$("#context").val("");--%>
        <%--$("#princeple").val("");--%>
        <%--$("#procedure").val("");--%>
        <%--$("#equipment").val("");--%>
      <%--}else{--%>
        <%--$.ajax({--%>
          <%--url:'${pageContext.request.contextPath}/student/teach/findAll',--%>
          <%--type:'POST',--%>
          <%--dataType:'json',--%>
          <%--data:{--%>
            <%--projectname:$(this).val(),--%>
            <%--teacher:$("#teacher").val()--%>
          <%--},--%>
          <%--success:function(response){--%>
            <%--$("#context").val("");--%>
            <%--$("#princeple").val("");--%>
            <%--$("#procedure").val("");--%>
            <%--$("#equipment").val("");--%>
          <%--}--%>
        <%--});--%>
      <%--}--%>

    <%--});--%>
  <%--})--%>

<%--</script>--%>
<style>
  table th,td{width: 200px;height: 60px; padding: 10px;}
</style>
<body class="subBodyBackgroundStyle">
  <h2 align="center">实验教学</h2>
  <form>
    <table border="1" style="border-collapse: collapse">
      <tr><th>已预约的项目</th><th>实验老师</th><th>项目时间</th><th>是否查看实验教学</th></tr>
      <c:forEach items="${stuexperimentList}" var="stuexperiment">
        <tr><td>${stuexperiment.name}</td><td>${stuexperiment.teacher}</td><td>${stuexperiment.time}</td><td><a href="/student/teach/look?id=${stuexperiment.id}">是</a></td></tr>
      </c:forEach>
    </table>
    <%--实验项目名称:<select id="choose" class="choose">--%>
    <%--<option value="0">--请选择--</option>--%>
    <%--<c:forEach items="${stuexperimentList}" var="stuexperiment">--%>
    <%--<option>${stuexperiment.name}</option>--%>
      <%--<input type="hidden" id="teacher" name="teacher" value="${stuexperiment.teacher}"/>--%>
    <%--</c:forEach>--%>
    <%--</select><br/>--%>
    <%--<div style="margin: 10px;"></div>--%>
    <%--实验内容描述:<div id="context"></div>--%>
    <%--<div style="margin: 10px;"></div>--%>
    <%--实验基本原理与设计:<div id="princeple"></div>--%>
    <%--<div style="margin: 10px;"></div>--%>
    <%--实验主要步骤:<div id="procedure"></div>--%>
    <%--<div style="margin: 10px;"></div>--%>
    <%--主要实验工具:<div id="equipment"></div>--%>
    <%--<div style="margin: 10px;"></div>--%>
    <%--实验相关资料上传:<input type="text" size="20" name="upfile1" id="upfile1" style="border: 1px solid #cccccc"/>--%>
    <%--<input type="button" value="浏览" onclick="path1.click()" style="border: 1px solid #cccccc;background: #ffffff"/>--%>
    <%--<input type="file" id="path1" style="display: none" onchange="upfile1.value=this.value"/><br/>--%>
    <%--<div style="margin: 10px;"></div>--%>
  </form>
</body>
</html>
