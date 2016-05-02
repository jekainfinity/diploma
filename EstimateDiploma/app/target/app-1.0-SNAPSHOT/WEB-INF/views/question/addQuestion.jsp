<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add question</title>

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

    <script>
        $(document).ready(function(){
            $("#myForm").submit(function(e){
                var rowsLength = $("#myTable tr").length;
                var answers=[];
                var question = new Object();


                for (var i=0;i<rowsLength;i++){
                    var obj1 = new Object();
                    var text = document.getElementById("myTable").rows[i].cells[1].children[0];
                    var status = document.getElementById("myTable").rows[i].cells[2].children[0];

                    obj1.answerText = text.value;
                    obj1.statusRight = status.checked;
                    answers.push(obj1);

                }

                question.questionText = $("#question").val();
                question.answers = answers;

                var jsonString = JSON.stringify(question);
                $.ajax({
                    type: "POST",
                    url: $("#myForm").attr("action"),
                    contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    data: jsonString,
                    success: function(data){
                        alert(" " + data);
                    }
                });
                e.preventDefault();
                e.unbind()
            });
        });

    </script>
</head>

<body>
<div id="wrapper">
    <jsp:include page="../navigation.jsp"/>
    <div id="page-wrapper">
        <div class="container-fluid">
            <form id="myForm" action="/admin/addQuestion/${taskId}" method="post">
                <label for="question">Question text</label>
                <input type="text" id="question" name="questionText" value="question text"/>
                <table id="myTable">
                    <c:forEach begin="0" end="2" var="i">
                        <tr class="answer">
                            <td><label for="answer">Answer ${i+1}</label> </td>
                            <td><input id="answer" type="text"  style="margin-left: 30px "  /></td>
                            <td><input type="checkbox"  style="margin-left: 10px " >Right</td>
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
