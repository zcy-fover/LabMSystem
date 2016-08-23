<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<style>
  table th,td{width: 200px;height: 60px; padding: 10px;}
 #main{width: 880px;overflow: scroll;}
  #context{overflow: scroll;height: 400px;width: 1000px;border: 1px solid blue;}
</style>
<body>
<h2>学生实验提交管理</h2>
<div id="main">
<div id="context">
<table border="1" style="border-collapse: collapse">
  <tr><th width="100px">实验项目</th><th>实验者</th><th>实验时间</th><th>实验内容描述</th><th>实验原理与设计</th><th>实验步骤</th><th>主要实验工具</th><th>实验调试过程</th><th>实验结果描述及分析</th><th>实验小结</th><th>实验结果截图1</th><th>实验结果截图2</th><th>实验结果截图3</th></tr>
  <c:forEach items="${submitExperiments}" var="submitExperiment">
    <tr><td width="100px">${submitExperiment.name}</td><td>${submitExperiment.experimenter}</td><td>${submitExperiment.experimenttime}</td><td>${submitExperiment.context}</td><td>${submitExperiment.theBasicPrincipleAndDesignOfE}</td><td>${submitExperiment.experimentalProcedure}</td>
      <td>${submitExperiment.equipment}</td><td>${submitExperiment.debug}</td><td>${submitExperiment.resultofexperiment}</td><td>${submitExperiment.summaryOfExperiment}</td>

      <c:if test="${submitExperiment.path1=='---'}">
        <td>无图片显示</td>
      </c:if>
      <c:if test="${submitExperiment.path1!='---'}">
        <td><img src="${submitExperiment.path1}" width="100px"></td>
      </c:if>
      <c:if test="${submitExperiment.path2=='---'}">
         <td>无图片显示</td>
      </c:if>
      <c:if test="${submitExperiment.path2!='---'}">
        <td><img src="${submitExperiment.path2}" width="100px"></td>
      </c:if>
      <c:if test="${submitExperiment.path3=='---'}">
        <td>无图片显示</td>
      </c:if>
      <c:if test="${submitExperiment.path3!='---'}">
        <td><img src="${submitExperiment.path3}" width="100px"></td>
      </c:if>
     </tr>
  </c:forEach>
</table>

</div>
</div>
</body>
</html>
