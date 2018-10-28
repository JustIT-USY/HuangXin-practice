<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>学籍注册系统</title>
</head>
<body>
<span style="font-size:40px;font-weight: bold">学籍注册</span>
<hr>
	<form action="${pageContext.request.contextPath}/register" method="post">
		<table>
			<tr >
			<td width="100px" align="center">居民身份证</td> 
			<td ><input type="text" name="id" style="width:100%"></td>
			</tr>
			
			<tr>
			<td align="center">姓名</td>
			<td><input type="text" name="name" style="width:100%"></td>
			</tr>
			
			<tr>
			<td align="center" >密码</td>
			<td ><input type="password" name="password" style="width:100%"></td>
			</tr>
			
			<tr>
			<td align="center">性别</td>
			<td><input type="radio" checked="checked" name="gender" value="男">男
				<input type="radio" name="gender" value="女" >女
			</td>
			</tr>
			
			<tr>
			<td align="center">个人描述</td>
			<td><input type="text" name="descri"></td>
			</tr>
		</table>
		<hr>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="注册">
		<hr>
	</form>
	<span style="font-size:49px;color:red">JustIT</span>
	<span style="color:orange" >&reg;CopyAllRight</span>
</body>
</html>