<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.tom.hibernate.UserDao"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="obj" class="com.tom.hibernate.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />

<%
	int i = UserDao.save(obj);
	if (i > 0) {
		out.print(obj.getName());
		out.print("，You are successfully registered");

	}
%>
