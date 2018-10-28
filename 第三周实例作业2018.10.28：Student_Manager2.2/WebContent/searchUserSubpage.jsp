<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>学籍信息查询</title>
</head>
<body>
<span style="font-size:40px;font-weight: bold">学籍信息查询</span>
<hr>

<%
	Object obj = request.getAttribute("List");
	List<String> list2 = null;
	if(obj instanceof List){
		list2 = (List<String>)obj;
	}
	if(list2 != null){
		for(String a : list2){
		%>
		<li>字段：<%=a %></li>
		<%
		}
	}
 %>


<hr>
<span style="font-size:49px;color:red">JustIT</span>
<span style="font-size: 15px">@最后修改日期：2018-10-28</span>
</body>
</html>