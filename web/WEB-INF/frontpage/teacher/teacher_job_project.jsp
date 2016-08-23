
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>实验预约</h2>
<form action="/teacher/project/submit" method="post">
  实验项目:<input type="text" name="projectname"/><br/>
  <div style="margin: 10px;"></div>
  实验时间:第<select name="time1">
  <option>1</option><option>2</option><option>3</option><option>4</option><option>5</option><option>6</option><option>7</option><option>8</option><option>9</option><option>10</option>
  <option>11</option><option>12</option><option>13</option><option>14</option><option>15</option><option>16</option><option>17</option><option>18</option><option>19</option><option>20</option>
</select>周
  周<select name="time2">
  <option>一</option><option>二</option><option>三</option><option>四</option><option>五</option><option>六</option><option>日</option>
</select>
  第<select name="time3">
  <option>一二</option><option>三四</option><option>五六</option><option>七八</option>
</select>节<br/>
  <div style="margin: 10px;"></div>
  实验教师:${teacher}<input type="hidden" name="projectteacher" value="${teacher}"/><br/>
  <div style="margin: 10px;"></div>
  耗材使用:<input type="text" name="low_value_product"/><br/>
  <div style="margin: 10px;"></div>
  仪器使用:<input type="text" name="lab_equipment"/><br/>
  <div style="margin: 10px;"></div>
  <input type="submit" value="提交"/>
</form>

</body>
</html>
