<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>请修改信息</title>
</head>
<body>
<span style="font-size:40px;font-weight: bold">学籍修改</span>
<hr>
	<form action="${pageContext.request.contextPath}/updateUserSub" method="post">
		<table>		
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
			
			<input type="hidden" name="already" value="yes">
		</table>
		<hr>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="确认修改">
		<hr>
	</form>
	<span style="font-size:49px;color:red">JustIT</span>
	<span style="font-size: 15px">@最后修改日期：2018-10-28</span>
</body>
</html>