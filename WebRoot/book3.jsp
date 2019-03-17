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
  <form action="${pageContext.request.contextPath }/form4.action" method="post">
     <!-- list[0]表示的时list集合中第一个User对象 -->
    username：<input type="text" name="list[0].username"/>
    <br>
    password：<input type="text" name="list[0].password"/>
    <br>
    address：<input type="text" name="list[0].address"/>
    <br>
    username：<input type="text" name="list[1].username"/>
    <br>
    password：<input type="text" name="list[1].password"/>
    <br>
    address：<input type="text" name="list[1].address"/>
    <br>
    <input type="submit" name="submit" value="提交">
  </form>
</body>
</html>