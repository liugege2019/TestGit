<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  book.action
  <form action="${pageContext.request.contextPath }/form5.action" method="post">
    <!-- 设置key的值 map['key值']-->
    username：<input type="text" name="map['one'].username"/>
    <br>
    password：<input type="text" name="map['one'].password"/>
    <br>
    address：<input type="text" name="map['one'].address"/>
    <br>
    username：<input type="text" name="map['two'].username"/>
    <br>
    password：<input type="text" name="map['two'].password"/>
    <br>
    address：<input type="text" name="map['two'].address"/>
    <br>
    <input type="submit" name="submit" value="提交">
  </form>
</body>
</html>