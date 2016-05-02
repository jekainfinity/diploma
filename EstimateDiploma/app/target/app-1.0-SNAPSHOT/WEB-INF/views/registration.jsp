<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="/resources/css/bootstrap-them.min.css" rel="stylesheet" type="text/css">

    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="http://code.jquery.com/jquery-1.11.3.min.js" />"></script>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/registration" method="post" modelAttribute="user" class="login-form well">

    <div class="form-group">
    <span class="must">*</span><label for="email">Username</label>
    <form:input type="text" path="username" placeholder="UserName" class="form-control js-name"/>
    </div>
    <div class="form-group">
        <span class="must">*</span><label for="email">Email address</label>
        <form:input type="text" path="email" placeholder="Email" class="form-control js-email"/>
    </div>
    <div class="form-group ">
        <span class="must">*</span><label for="firstName">First Name</label>
        <form:input type="text" path="firstname" placeholder="First_Name"  class="form-control js-name"/>
    </div>
    <div class="form-group">
        <span class="must">*</span><label for="lastName">Last Name</label>
        <form:input type="text" path="lastName" class="form-control js-name" placeholder="Last_Name" />
    </div>

    <div class="form-group">
        <span class="must">*</span><label for="password">Password</label>
        <form:input type="password" path="password" class="form-control js-pass"/>

    </div>

    <div class="form-group ">
        <label for="birthday">Birthday</label>
        <form:input type="date" path="bDay" placeholder="B_Day" id="birthday" class="form-control js-birthday"/>
    </div>
    <p class="err-msg">${errorMessage}</p>
    <input type="submit" value="Register" class="btn btn-primary">

</form:form>
</body>
</html>
