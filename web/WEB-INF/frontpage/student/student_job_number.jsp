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

  <style>
    .upfilestyle{border: 1px solid #cccccc;}
    .butt{border: 1px solid #cccccc;background: #ffffff;}
    #path,#path1,#path2{display: none;}
    .blank4{margin-left: 64px;}
    .blank2{margin: 10px;}
    .blank1{margin-left: 36px;}
    .submit{margin-left: 124px;}
  </style>
  <script>
    $(function(){
      $("#choose").bind("change",function(){

        if($(this).val()==0){
          $("#teacher").val("");
        }else{
          $.ajax({
            url:'${pageContext.request.contextPath}/student/practice/findtimeandteacher',
            type:'POST',
            dataType:'json',
            data:{
              projectname:$(this).val()
            },
            success:function(response){
              $("#teacher").val(response.teacher);
            }
          });
        }

      });
    })

  </script>
</head>
<body class="subBodyBackgroundStyle">
<h2 align="center">实验数据提交</h2>
<form action="/student/submit/numberfile" method="post" enctype="multipart/form-data">
  <div  class="blank1">实验项目名称:<select class="choose" id="choose" name="experimentName">
  <option value="0">--请选择--</option>
  <c:forEach items="${stuexperimentList}" var="stuexperiment">
    <option value="${stuexperiment.name}">${stuexperiment.name}</option>
  </c:forEach>
</select></div>
  <%--<c:if test="${stuexperimentList.size()==0}"><span class="tip">对不起，你还没有预约实验项目或者你的实验项目还没有通过审核</span><br/></c:if>--%>
  <div class="blank2"></div>
  <div class="blank4">实验老师:<input class="word" id="teacher" name="teacher" type="text"/></div>
  <div class="blank2"></div>

  实验结果截图上传1:<input type="text" size="20"  id="upfile" class="upfilestyle" />
  <input type="button" class="butt" value="浏览" onclick="path.click()" />
  <input type="file" id="path" name="file"  onchange="upfile.value=this.value"/><br/>
  <div class="blank2"></div>

  实验结果截图上传2:<input type="text" size="20"  id="upfile1" class="upfilestyle" />
  <input type="button" class="butt" value="浏览" onclick="path1.click()" />
  <input type="file" id="path1" name="file1"  onchange="upfile1.value=this.value"/><br/>
  <div class="blank2"></div>

  &nbsp;&nbsp;其他数据文件上传:<input type="text" size="20"  id="upfile2" class="upfilestyle"/>
  <input type="button" class="butt" value="浏览" onclick="path2.click()" />
  <input type="file" id="path2" name="file2"   onchange="upfile2.value=this.value"/><br/>
  <div class="blank2"></div>

  <input class="submit" type="submit" value="提交"/>
</form>
</body>
</html>
