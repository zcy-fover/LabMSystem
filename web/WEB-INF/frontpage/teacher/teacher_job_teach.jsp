<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <h2>实验教学</h2>
  <form action="/teacher/teach/submit" method="post">
    实验项目名称:<select name="projectname">
    <option>--请选择--</option>
    <c:forEach items="${teaExperimentList}" var="teaExperiment">
      <option>${teaExperiment.name} </option>
      <%--<input type="hidden" name="id" value="${teaExperiment.id}"/>--%>
    </c:forEach>
    </select><br/>
    <div style="margin: 10px;"></div>
    实验内容描述:<input type="text" name="context"/><br/>
    <div style="margin: 10px;"></div>
    实验基本原理与设计:<input type="text" name="principle"/><br/>
    <div style="margin: 10px;"></div>
    实验主要步骤:<input type="text" name="procedure"/><br/>
    <div style="margin: 10px;"></div>
    主要实验工具:<input type="text" name="equipment"/><br/>
    <div style="margin: 10px;"></div>
    <%--实验相关资料上传:<input type="text" size="20" name="upfile1" id="upfile1" style="border: 1px solid #cccccc"/>--%>
    <%--<input type="button" value="浏览" onclick="path1.click()" style="border: 1px solid #cccccc;background: #ffffff"/>--%>
    <%--<input type="file" id="path1" style="display: none" onchange="upfile1.value=this.value"/><br/>--%>
    <%--<div style="margin: 10px;"></div>--%>
    <input type="submit" value="提交"/>
  </form>
</body>
</html>
