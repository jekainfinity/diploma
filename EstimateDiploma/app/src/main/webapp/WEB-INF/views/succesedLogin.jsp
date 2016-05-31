<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<security:authorize access="hasRole('ROLE_USER')">
    Hi you successed login <a href="<c:url value="/logout" />">logout</a>
</security:authorize>

</body>
</html>
