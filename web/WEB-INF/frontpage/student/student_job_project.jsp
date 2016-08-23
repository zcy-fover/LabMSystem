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
<style>
    table th,td{width: 200px;height: 60px; padding: 10px;}
</style>
<body class="subBodyBackgroundStyle">
<h2 align="center">实验预约</h2>
<form>
<table border="1" style="border-collapse: collapse">
    <tr>
        <th>当前可以预约的项目</th>
        <th>对应项目的实验老师</th>
        <th>项目时间</th>
        <th>是否预约</th>
    </tr>
    <c:forEach items="${teaExperimentList}" var="teaExperiment">
        <tr>
            <td>${teaExperiment.name}</td>
            <td>${teaExperiment.teacher}</td>
            <td>${teaExperiment.time}</td>
            <td>
                <a href="/student/project/order?id=${teaExperiment.id}">是</a>
            </td>
        </tr>
    </c:forEach>
</table>
</form>
</body>
</html>
