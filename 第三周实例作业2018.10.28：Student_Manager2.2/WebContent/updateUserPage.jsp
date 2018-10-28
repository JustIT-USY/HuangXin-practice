<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>学籍信息修改</title>
</head>
<body>
<span style="font-size:40px;font-weight: bold">学籍信息修改</span>
<hr>
	<form action="${pageContext.request.contextPath}/updateUser" method="post">
		<table>
			<tr>
				<td align="center">身份证号码</td>
				<td width="100px" align="center"><input type="text" name="id" style="width:100%"></td>
			</tr>
			
			
			<tr>
				<td align="center" >密码</td>
				<td><input type="password" name="password" style="width:100%"></td>
			</tr>
		</table>
		
		<hr>
		
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="开始修改" style="">
	</form>
	<hr>
	<span style="font-size:49px;color:red">JustIT</span>
	<span style="font-size: 15px">@最后修改日期：2018-10-28</span>
</body>
</html>