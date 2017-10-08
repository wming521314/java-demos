<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户登录</title>
</head>
<body>
<form action="login.action" method="post">
<s:actionerror/>
用户名：<input name="user.username"><br>
密码：<input name="user.password" type="password"><br>
<input type="submit" value="登录"><input type="reset" value="重置">
</form>
</body>
</html>