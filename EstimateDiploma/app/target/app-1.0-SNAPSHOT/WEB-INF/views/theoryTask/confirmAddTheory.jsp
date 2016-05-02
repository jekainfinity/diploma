<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirm</title>
</head>
<body>
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
                <div class="col-lg-6">
                    <fieldset>
                        <div class="control-group">
                            <dl class="dl-horizontal">
                                <dt>
                                    <label class="control-label pull-left">task name ${taskName}</label>
                                </dt>

                                <dt>
                                    <label class="control-label pull-left" >Theory level ${taskLevel}</label>
                                </dt>

                                <dt>
                                    <label class="control-label pull-left" >task description ${taskDescription}</label>
                                </dt>

                                <dt>
                                    <label class="control-label pull-left" >course ${taskCourse}</label>
                                </dt>

                                <dd>
                                    <div class="form-group">
                                        <div class="col-lg-1" style="margin-left:15px">
                                            <a href="/admin/addQuestion/${taskId}" class="btn btn-success pull-right" >Add question
                                            </a>
                                        </div>
                                    </div>
                                </dd>
                            </dl>
                        </div>
                    </fieldset>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

</body>
</html>
