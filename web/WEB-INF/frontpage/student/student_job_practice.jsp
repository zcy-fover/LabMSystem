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
  .word{width:70%; }
  .go{margin-left: 400px;border: 0px solid red;width: 100px;}
  .choose{width: 500px;}
  .tip{margin-left: 180px;color: red;}
  .blank1{margin-left: 82px;}
  .blank2{margin: 10px;}
  .blank3{margin-left: 160px;}
  .blank4{margin-left:110px; }
  .blank5{margin-left: 40px;}
  .blank6{margin-left: 26px;}
  h2{border: 0px solid red;text-align: center;}
</style>
<script>

  $(function(){
      $("#choose").bind("change",function(){

        if($(this).val()==0){
          $("#time").val("");
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
              $("#time").val(response.time);
              $("#teacher").val(response.teacher);
            }
          });
        }

      });
  })

</script>
<body class="subBodyBackgroundStyle">
<h2>实验实践</h2>
<div class="blank2"></div>
<form action="/student/submit/practice" method="post">

 <div  class="blank3 input-group">
     <span class="input-group-addon">实验项目名称:</span>
     <select class="choose form-control" style="width: 71.8%" id="choose" name="name">
     <option value="0">--请选择--</option>
         <c:forEach items="${stuexperimentList}" var="stuexperiment">
             <option value="${stuexperiment.name}">${stuexperiment.name}</option>
         </c:forEach>
     </select>
 </div>
  <%--<c:if test="${stuexperimentList.size()==0}"><span class="tip">对不起，你还没有预约实验项目或者你的实验项目还没有通过审核</span><br/></c:if>--%>
  <div class="blank2"></div>
      <div class="blank3 input-group">
          <span class="input-group-addon">实验者:</span>
          <input class="form-control" style="width: 73.5%" name="experimenter" type="text" value="${student}"/>
      </div>
  <div class="blank2"></div>
      <div class="blank3 input-group">
          <span class="input-group-addon">实验老师:</span>
          <input class="form-control" style="width: 73%" id="teacher" name="teacher" type="text"/>
      </div>
  <div class="blank2"></div>
      <div class="blank3 input-group">
          <span class="input-group-addon">实验时间:</span>
          <input class="form-control" style="width: 73%" id="time" name="experimenttime" type="text"/>
      </div>
  <div class="blank2"></div>
      <div class="blank3 input-group">
          <span class="input-group-addon">实验内容描述:</span>
          <input class="form-control" style="width: 72%" name="context" type="text"/>
      </div>
  <div class="blank2"></div>
      <div class="blank3 input-group">
          <span class="input-group-addon">实验基本原理与设计:</span>
          <input class="form-control" style="width: 70%" name="principle" type="text"/>
      </div>
  <div class="blank2"></div>
      <div class="blank3 input-group">
          <span class="input-group-addon">实验步骤:</span>
          <input class="form-control" style="width: 73%" name="procedure" type="text"/>
      </div>
  <div class="blank2"></div>
      <div class="blank3 input-group">
          <span class="input-group-addon">主要实验工具:</span>
          <input class="form-control" style="width: 72%" name="equipment" type="text"/>
      </div>
  <div class="blank2"></div>
      <div class="blank3 input-group">
          <span class="input-group-addon">实验调试过程:</span>
          <input class="form-control" style="width: 72%" name="debug" type="text"/>
      </div>
  <div class="blank2"></div>
      <div class="blank3 input-group">
          <span class="input-group-addon">实验结果描述及分析:</span>
          <input class="form-control" style="width: 70%" name="resultofexperiment" type="text"/>
      </div>
  <div class="blank2"></div>
      <div class="blank3 input-group">
          <span class="input-group-addon">实验小结、建议及体会:</span>
          <input class="form-control" style="width: 69.5%" name="summary" type="text"/>
      </div>
  <div class="blank2"></div>
      <input class="go btn btn-primary" align="center" type="submit" value="提交"/>
</form>
</body>
</html>
