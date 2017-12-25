<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--<link rel="stylesheet" type="text/css" href="styles.css">-->
  </head>
  
  <body>
    This is my JSP page. <br>
  </body>
</html>
<!-- 
	1.主页[匿名用户、普通用户、管理员]
	2.登陆[用户和管理员登陆]
	3.个人中心[普通用户](查看我发布的博文 、发布博文、修改博文、个人信息修改)
	4.个人中心[管理员](查看所有的博客、删除博文、个人信息修改)
 -->
