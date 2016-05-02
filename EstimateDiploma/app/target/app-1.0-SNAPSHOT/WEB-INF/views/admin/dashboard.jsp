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

    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>

            </button>
            <a class="navbar-brand" href="/admin">Admin Panel</a>
        </div>
        <!-- /.navbar-header -->

        <ul class="nav navbar-top-links navbar-right">

            <a href="#" enabled="false"><i class="fa" style="color:blue"></i>${pageContext.request.userPrincipal.name}</a>
            </li>
            <!-- /.dropdown -->
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li class="divider"></li>
                    <li><a href="<c:url value="/logout" />"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                    </li>
                </ul>
                <!-- /.dropdown-user -->
            </li>
            <!-- /.dropdown -->
        </ul>
        <!-- /.navbar-top-links -->

        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav navbar-collapse">
                <ul class="nav" id="side-menu">
                    <li>
                        <a href="/admin/users"><i class="fa fa-table fa-fw"></i> Users</a>
                    </li>

                    <li>
                        <a href="#"><i class="fa fa-table fa-fw"></i> Courses</a>
                    </li>

                    <li>
                        <a href="/admin/getTheoryTask"><i class="fa fa-table fa-fw"></i> Tests</a>
                    </li>

                </ul>
            </div>
            <!-- /.sidebar-collapse -->
        </div>
        <!-- /.navbar-static-side -->
    </nav>

</div>
</body>
</html>
