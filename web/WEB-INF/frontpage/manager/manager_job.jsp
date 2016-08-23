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

<body class="bodyStyle4">
<h2 style="width: 1000px;margin: 0 auto;border: 1px solid black;text-align: center;font-size: 50px;">实验室管理系统<p style="text-indent:780px;font-size: 15px;">实验室管理员:${manager.name}</p></h2>
<%--第三种方法，利用position：absolute--%>
<div style="width: 1000px;height: 500px;margin: 0 auto;border: 1px solid red;">
    <div  style="border: 1px solid green;width: 100px;height: 500px;float: left;">
        <div><a href="#" id="verify">预约审核</a></div>
        <div><a href="#" id="classes">课表发布</a> </div>
        <div><a href="#" id="add">耗材补充</a> </div>
        <div><a href="#" id="repair">仪器维护</a> </div>
        <div><a href="#" id="counts">数据统计</a> </div>
    </div>

    <div  style="border: 1px solid yellow;width: 890px;height: 500px;float: left;">
        <div id="rightcontext_1">欢迎登录系统</div>
        <div id="rightcontext_2"></div>
    </div>
</div>


<script>

    $(function(){
        $("#verify").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/manage/verify' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });

        $("#add").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/manage/add' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });

        $("#repair").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/manage/repair' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });

        $("#classes").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/manage/classes' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });
        $("#counts").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/manage/counts' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });

    })
</script>
</body>
</html>
