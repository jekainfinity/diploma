<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

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
    <div id="page-wrapper">
        <form:form cssClass="form-horizontal" modelAttribute="theoryTask" action="${pageContext.request.contextPath}/admin/addTheoryTask" method="post">
            <div class="container">
                <div class="row " style="margin-top: 40px ">
                    <div class="col-md-6 col-lg-offset-1">
                        <fieldset>
                            <div class="control-group">
                                <dl class="dl-horizontal">
                                    <dt>
                                        <label class="control-label pull-left" for="task-name">task name</label>
                                    </dt>
                                    <dd>
                                        <div class="form-group">
                                            <form:input path="taskName" id="task-name" type="text" placeholder="Task name"/>
                                        </div>
                                    </dd>

                                    <dt>
                                        <label class="control-label pull-left" for="level">Theory level</label>
                                    </dt>
                                    <dd>
                                        <div class="form-group">
                                            <form:select path="theoryTaskLevel" id="level" items="${theoryTaskLevels}"/><br/>
                                        </div>
                                    </dd>

                                    <dt>
                                        <label class="control-label pull-left" for="desc">task description</label>
                                    </dt>
                                    <dd>
                                        <div class="form-group">
                                            <form:input type="text" id="desc" placeholder="Description" path="taskDescription"/>
                                        </div>
                                    </dd>

                                    <dt>
                                        <label class="control-label pull-left" for="course">courses</label>
                                    </dt>
                                    <dd>
                                        <div class="form-group">
                                            <form:select path="course" id="course" items="${courses}"/><br/>
                                        </div>
                                    </dd>

                                    <dd>
                                        <div class="form-group">
                                            <div class="col-lg-1" style="margin-left:15px">
                                                <button type="submit" class="btn btn-success pull-right" >Create task
                                                </button>
                                            </div>
                                        </div>
                                    </dd>
                                </dl>
                            </div>
                        </fieldset>
                    </div>
                </div>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>
