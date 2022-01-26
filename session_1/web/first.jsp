<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 26.01.2022
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp" %>
    <title>Title</title>

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-6 m-auto mt-3">
            <form action="/main" method="post">
                <h3>Login</h3>
                <div class="mb-3">
                    <label for="userName" class="form-label">Name:</label>
                    <input type="text" class="form-control" name="userName" id="userName">
                </div>
                <div class="mb-3">
                    <label for="userSurname" class="form-label">Surname:</label>
                    <input type="text" class="form-control" name="userSurname" id="userSurname">
                </div>
                <div class="mb-3">
                    <label for="userBirthdate" class="form-label">Birthdate:</label>
                    <input type="date" class="form-control" name="userBirthdate" id="userBirthdate">
                </div>
                <button type="submit" class="btn btn-primary">Next></button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
