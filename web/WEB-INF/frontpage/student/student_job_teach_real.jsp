<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <h2 align="center">实验教学</h2>
  <form>
    实验项目名称:${teaExperiment.name}<br/>
    <div style="margin: 10px;"></div>
    实验老师:${teaExperiment.teacher}<br/>
    <div style="margin: 10px;"></div>
    实验内容描述:${teaExperiment.context}</div>
    <div style="margin: 10px;"></div>
    实验基本原理与设计:${teaExperiment.theBasicPrincipleAndDesignOfE}</div>
    <div style="margin: 10px;"></div>
    实验主要步骤:${teaExperiment.experimentalProcedure}</div>
    <div style="margin: 10px;"></div>
    主要实验工具:${teaExperiment.equipment}</div>
    <div style="margin: 10px;"></div>

  </form>
</body>
</html>
