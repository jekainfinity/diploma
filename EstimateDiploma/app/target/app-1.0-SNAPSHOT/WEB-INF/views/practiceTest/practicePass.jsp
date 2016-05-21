<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style>
        textarea#styled {
            width: 600px;
            height: 120px;
            border: 3px solid #1b6d85;
            padding: 5px;
            font-family: Tahoma, sans-serif;
            background-position: bottom right;
            background-repeat: no-repeat;
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
            display: block  ;
            width: 200px;
            background-color: #1b6d85;
        }

    </style>
</head>
<body>
    <div class="container">
        <div class="col-md-4 col-lg-offset-1">
            <form id="codeForm">
                <label id="header">Code</label><br>
                <textarea name="code" form="codeForm" id="styled" ></textarea>
                <label id="hint">hint</label>
            </form>
        </div>
    </div>
</body>
</html>
