<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>passTheoryTest</title>
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

    <script type="text/javascript">
        $(document).ready(function(){
            $("#mybutton").click(function(){
                var answerIds = [];
                var requestAnswer = new Object();
                $("#answer input:radio[class=answers]:checked").each(function(e){
                    var value = $(this).val();
                    answerIds.push(value);
                });
                requestAnswer.theoryTaskId = ${taskId};
                requestAnswer.answerIds = answerIds;
                $.ajax({
                    type: "POST",
                    url: "/user/passTheoryTask",
                    contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    data: JSON.stringify(requestAnswer),
                    success: function(data){
                        alert(data);
                    }
                })
            })
        });
    </script>
</head>
<body>
    <div id="wrapper">
    <jsp:include page="../navigation.jsp"/>
        <div id="page-wrapper">
            <div class="container-fluid">
                <div id="answer">
                    <c:forEach var="item" items="${questions}">
                        <label>${item.questionText}?</label><br/>
                        <c:forEach var="answer" items="${item.answers}">
                            <input type="radio" class="answers" name="radios[${item.questionId}]"  value="${answer.answerId}"/>${answer.answerText}<br/>
                        </c:forEach>
                    </c:forEach>
                    <button id="mybutton" value="Submit">   Submit</button>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
