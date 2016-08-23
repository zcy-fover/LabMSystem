<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>实验室管理系统</title>
</head>
<title>IndelMarkerDatabase</title>
<!--引入CSS-->
<link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/assets/css/myStyle.css" rel="stylesheet" type="text/css">
<!--引入JS-->
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>

<body class="bodyStyle2">
<h2 style="width: 1000px;margin: 0 auto;border: 1px solid black;text-align: center;font-size: 50px;">实验室管理系统<p style="text-indent:780px;font-size: 15px;">教师:${teacher.name}</p></h2>
<div></div>
<%--第三种方法，利用position：absolute--%>
<div style="width: 1000px;height: 500px;margin: 0 auto;border: 1px solid red;">
    <div  style="border: 1px solid green;width: 100px;height: 500px;float: left;">
        <div><a href="#" id="pulish">公告发布</a></div>
        <div><a href="#" id="classes">查看课表</a> </div>
        <div><a href="#" id="project">实验预约</a> </div>
        <div><a href="#" id="arrange">实验安排</a> </div>
        <div><a href="#" id="teach">实验教学</a> </div>
        <div><a href="#" id="resources">资源管理</a> </div>
        <div><a href="#" id="file">文档管理</a> </div>
    </div>

    <div  style="border: 1px solid yellow;width: 890px;height: 500px;float: left;">
        <div id="rightcontext_1">欢迎登录系统</div>
        <div id="rightcontext_2"></div>
    </div>
</div>



<script>

    $(function(){
        $("#pulish").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/teacher/pulish' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });

        $("#teach").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/teacher/teach' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });

        $("#resources").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/teacher/resources' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });

        $("#arrange").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/teacher/arrange' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });

        $("#file").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/teacher/file' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });
        $("#classes").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/teacher/f' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });
        $("#project").click(function(){
            $("#rightcontext_1").addClass("hidden");
            $("#rightcontext_2").addClass("hover").html("<iframe src='/teacher/project' width='890px' height='500px' scrolling='no' frameborder='0' ></iframe>");
        });




    })

</script>
</body>
</html>
