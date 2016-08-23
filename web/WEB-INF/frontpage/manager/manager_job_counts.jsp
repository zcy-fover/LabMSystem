<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<style>
    table th,td{width: 110px;height: 60px; padding: 10px;}
    #main{overflow: scroll;height: 400px;overflow-x: hidden;}
    #context{height: 500px;}
</style>
<body>
<h2>数据统计</h2>
<div id="main">
    <div id="context">
<h3>耗材补充情况</h3>
<table border="1" style="border-collapse: collapse">
    <tr><th>耗材名称</th><th>购买价格</th><th>库存</th><th>购买时间</th><th>耗材作用</th></tr>
    <c:forEach items="${lowValueProducts}" var="lowValueProduct">
        <tr>
            <td>${lowValueProduct.name}</td>
            <td>${lowValueProduct.price}</td>
            <td>${lowValueProduct.storenum}</td>
            <td>${lowValueProduct.time}</td>
            <td>${lowValueProduct.funtion}</td>
        </tr>
    </c:forEach>
</table>

<h3>仪器维护情况</h3>
<table border="1" style="border-collapse: collapse">
    <tr><th>仪器名称</th><th>仪器型号</th><th>上次损坏位置</th><th>维护次数</th></tr>
    <c:forEach items="${lab_equipments}" var="labEquipment">
        <tr>
            <td>${labEquipment.name}</td>
            <td>${labEquipment.version}</td>
            <td>${labEquipment.point}</td>
            <td>${labEquipment.num}</td>
        </tr>
    </c:forEach>
</table>
    </div>
</div>
</body>
</html>
