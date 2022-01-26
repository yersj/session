<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 26.01.2022
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp"%>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-6 m-auto mt-3">
            <form action="/second" method="post">
                <h3>Login</h3>
                <div class="mb-3">
                    <label for="userCountry" class="form-label">Country:</label>
                    <select name="userCountry" id="userCountry">
                        <option value="kaz">Kazakhstan</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="userEmail" class="form-label">Email:</label>
                    <input type="text" class="form-control" name="userEmail" id="userEmail">
                </div>
                <div class="mb-3">
                    <label for="userPhone" class="form-label">Phone:</label>
                    <input type="text" class="form-control" name="userPhone" id="userPhone">
                </div>
                <button type="submit" class="btn btn-primary">Next></button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
