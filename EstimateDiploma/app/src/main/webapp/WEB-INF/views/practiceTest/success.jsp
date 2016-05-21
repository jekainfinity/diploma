<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>

    <link href="<c:url value='/resources/css/metisMenu.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/sb-admin-2.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/adminPanel.css'/>" rel="stylesheet">

</head>
<body>
<div id="wrapper">
    <jsp:include page="../navigation.jsp"/>
    <div id="page-wrapper">
        <h1> SUCCESS YOU CREATE TASK <a href="${pageContext.request.contextPath}/admin/practiceTest/savePracticeTest">New one</a></h1>
    </div>
</div>
</body>
</html>
