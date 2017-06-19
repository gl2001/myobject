<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h2>这里是one.jsp页面</h2>

从request中获取数据reqMsg：<%=request.getAttribute("reqMsg") %><br/>
从session中获取数据sessionMsg:<%=session.getAttribute("sessionMsg") %><br/>
从application中获取数据appMsg:<%=application.getAttribute("appMsg") %><br/>

<a href="two.jsp">跳转到two.jsp页面</a>

</body>
</html>