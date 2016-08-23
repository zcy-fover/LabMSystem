<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body class="subBodyBackgroundStyle">
    <h2 align="center">实验预约</h2>
    <form action="/student/project/submit" method="post">
        实验项目:${teaExperiment.name}
        <input type="hidden" name="projectname" value="${teaExperiment.name}"><br/>
        <div style="margin: 10px;"></div>
        实验时间:${teaExperiment.time}
        <input type="hidden" name="time1" value="${teaExperiment.time1}"/>
        <input type="hidden" name="time2" value="${teaExperiment.time2}"/>
        <input type="hidden" name="time3" value="${teaExperiment.time3}"/><br/>
        <div style="margin: 10px;"></div>
        实验教师:${teaExperiment.teacher}
        <input type="hidden" name="projectteacher" value="${teaExperiment.teacher}"/><br/>
        <div style="margin: 10px;"></div>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
