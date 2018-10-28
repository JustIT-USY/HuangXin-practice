<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>学籍信息查询</title>
</head>
<body>
<span style="font-size:40px;font-weight: bold">学籍信息查询</span>
<hr>
	<form action="${pageContext.request.contextPath}/seaUser" method="post">
		<table>
			<tr >
			<td width="100px" align="center">依据身份证号码查找</td> 
			<td ><input type="text" name="id" style="width:100%"></td>
			</tr>
		</table>

		<hr>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="查找" />
	</form>
	
	<span style="font-size:49px;color:red">JustIT</span>
	<span style="font-size: 15px">@最后修改日期：2018-10-28</span>
</body>
</html>