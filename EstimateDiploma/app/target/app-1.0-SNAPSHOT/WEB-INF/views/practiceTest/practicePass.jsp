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

    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="<c:url value='/resources/js/jquery.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/metisMenu.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/sb-admin-2.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/validator.js'/>" type="text/javascript"></script>
    <style>
        textarea#styled {
            min-width: 100%;
            height: 570px;
            border: 3px solid #1b6d85;
            padding: 5px;
            font-family: Tahoma, sans-serif;
            background-position: bottom right;
            background-repeat: no-repeat;
            resize: none;
        }

        label#header {
            display: block;
            background-color: #1b6d85;
            width: 100px;
            text-align: center;
            margin-bottom: -21px;
            border: 3px solid #1b6d85;
            border-bottom: none;
        }

        label#hint {
            margin-top: 22px;
            margin-left: -30px;
            height: 569px;
            padding: 5px;
            min-width: 100%;
            background-color: #1b6d85;
        }

        form {
            margin-top: 20px;
        }

    </style>
</head>
<body>
<div id="wrapper">
    <jsp:include page="../navigation.jsp"/>
    <div id="page-wrapper">
        <div class="container-fluid">
            <div class="row">
                <form id="codeForm" action="${pageContext.request.contextPath}/testPassingPractice/practiceTestPass" method="post">
                    <div class="col-md-8 col-lg-offset-1">
                        <label id="header">Code</label><br>
                        <textarea name="code" form="codeForm" id="styled" ></textarea>
                    </div>
                </form>
                <div class="col-md-2">
                    <label id="hint">hint</label>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 col-lg-offset-1">
                    <label for="filename" about="Enter file name that equals for public runner class">Enter filename</label>
                    <input id ="filename" name="filename" form="codeForm" type="text">
                </div>
                <div class="col-md-2 col-lg-offset-1">
                    <input form="codeForm" type="submit" value="Submit code" class="btn-lg">
                </div>
            </div>
            <input form="codeForm" type="submit" value="submit">

        </div>
    </div>
</div>
</body>
</html>
