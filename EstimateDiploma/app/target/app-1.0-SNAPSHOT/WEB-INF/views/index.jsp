<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>hello
    <security:authorize access="hasRole('ROLE_ADMIN')">
        <a href="/admin/dashboard">DASHBOARD</a></p>
    </security:authorize>
<security:authorize access="hasRole('ROLE_USER')">
    <a href="/user/dashboard">DASHBOARD</a></p>
</security:authorize>

</body>
</html>
