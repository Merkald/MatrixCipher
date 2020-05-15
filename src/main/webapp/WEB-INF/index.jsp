<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Login</title>
</head>
<body class="bg-secondary">
<br>
<br>
<br>
<br>
<div class="card text-white bg-dark mx-auto my-auto" style="width: 500px;">
    <div class="card-header">
        <h1 class="mx-auto" style="width: 200px;">Login Page</h1>
    </div>
    <div class="card-body">
        <form action="${pageContext.request.contextPath}/"
              method="post">
            <div class="card-body form-group">
                <label>Key</label>
                <input type="password"
                       class="form-control"
                       aria-describedby="emailHelp"
                       name="key">
            </div>
            <div class="card-body form-group">
                <label class="mx-auto">value</label>
                <input type="password"
                       class="form-control"
                       name="value">
            </div>
            <div class="card-body form-group">
                <label class="mx-auto">Pattern</label>
                <input type="text"
                       class="form-control"
                       name="pattern" value="[i,j]->">
            </div>
            <div class="mx-auto" role="alert" style="width: 230px;">
                <h6 class="mx-auto my-5" style="width: 500px; color:red">${encryptedData}</h6>
            </div>
            <div class="mx-auto my-5" style="width: 200px;">
                <button type="submit" class="btn btn-primary btn-lg" style="width: 200px;">Submit
                </button>
            </div>
        </form>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
</body>
</html>
