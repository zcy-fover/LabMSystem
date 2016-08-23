<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<style>
    table th,td{width: 110px;height: 60px; padding: 10px;}
</style>
<body>
<h2>老师预约实验室管理</h2>
<table border="1" style="border-collapse: collapse">
    <tr><th>预约老师</th><th>预约项目</th><th>预约时间</th><th>状态</th><th>是否同意预约</th></tr>
    <c:forEach items="${teaExperimentList}" var="teaExperiment">
        <tr>
            <td>${teaExperiment.teacher}</td>
            <td>${teaExperiment.name}</td>
            <td>${teaExperiment.time}</td>
            <c:if test="${teaExperiment.isPass==false}">
                <td>未同意</td>
            </c:if>
            <c:if test="${teaExperiment.isPass==true}">
                <td>已同意</td>
            </c:if>
            <c:if test="${teaExperiment.isPass==false}">
                <td><a href="/manage/verify/agree?id=${teaExperiment.id}">是</a></td>
            </c:if>
            <c:if test="${teaExperiment.isPass==true}">
                <td>已同意</td>
            </c:if>
        </tr>
    </c:forEach>

</table>
</body>
</html>
