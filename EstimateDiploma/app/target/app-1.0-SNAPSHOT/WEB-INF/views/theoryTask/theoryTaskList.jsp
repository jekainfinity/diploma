<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>AdminPanel</title>

    <link href="<c:url value='/resources/css/metisMenu.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/sb-admin-2.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/font-awesome.min.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/adminPanel.css'/>" rel="stylesheet">

    <script src="<c:url value='/resources/js/jquery.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/metisMenu.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/sb-admin-2.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/validator.js'/>" type="text/javascript"></script>

</head>
<body>

<div id="wrapper">

    <jsp:include page="../navigation.jsp"/>

    <!-- Page Content -->
    <div id="page-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="alert alert-success text-center">
                        <security:authorize access="hasRole('ROLE_ADMIN')">
                            <a id="linkCreateQuestionByCourse" href="/admin/addTheoryTask" ><i class="glyphicon glyphicon-pencil pull-left" title="Create new task">Create task</i></a>
                        </security:authorize>
                        <b>Task config manage</b></h1>
                    <table class="table">
                        <thead class="alert alert-success">
                        <tr>
                            <th> ID </th>
                            <th> Theory task level</th>
                            <th> task name</th>
                            <th> Course</th>
                            <th class="text-center"> Action</th>
                        </tr>
                        </thead>
                        <c:forEach items="${theoryList}" var="theoryTask">
                            <tr>
                                <td>${theoryTask.taskId}</td>
                                <td>${theoryTask.theoryTaskLevel.name()}</td>
                                <td>${theoryTask.taskName}</td>
                                <td>${theoryTask.course.name()}</td>
                                <td>
                                    <security:authorize access="hasRole('ROLE_USER')">
                                        <a href="/user/passTheoryTask/${theoryTask.taskId}">PassTest</a>
                                    </security:authorize>
                                    <security:authorize access="hasRole('ROLE_ADMIN')">
                                        <a href="/user/seeTest">See test</a>
                                    </security:authorize>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
