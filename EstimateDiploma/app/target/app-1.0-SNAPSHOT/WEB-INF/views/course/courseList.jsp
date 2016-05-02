<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Course List</title>

    <link href="<c:url value='/resources/css/metisMenu.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/sb-admin-2.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/font-awesome.min.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/adminPanel.css'/>" rel="stylesheet">

    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="<c:url value='/resources/js/jquery.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/metisMenu.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/sb-admin-2.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/validator.js'/>" type="text/javascript"></script>
</head>
<body>
<div id="wrapper">
    <jsp:include page="../navigation.jsp"/>
    <div id="page-wrapper">
        <div class="container-fluid">
            <form id="myForm" action="/admin/addQuestion/${taskId}">
                <table id="myTable">
                    <c:forEach items="${courses}" var="course">
                        <tr>
                            <td><label>course ${course.name()}</label> </td>
                            <td><input type="button" href="/overall/getTheoryTaskByList/${course.name()}" value="get theory tests"></td>
                            <td><input type="button" href="/overall/getPracticeTaskByList/${course.name()}" value="get practice tests"></td>
                        </tr>
                    </c:forEach>
                </table>
                <input type="submit" value="Save"/>
            </form>
        </div>
    </div>
</div>
</body>
</html>
