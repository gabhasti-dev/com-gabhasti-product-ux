<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dashboard</title>
</head>
<body>
	
<security:authorize access="isAuthenticated()">
    authenticated as <security:authentication property="principal.username" />
<security:authorize access="hasRole('MAKER')">

This content will only be visible to users who have
the "supervisor" authority in their list of <tt>GrantedAuthority</tt>s.

</security:authorize>

	  
</security:authorize>

</body>
</html>