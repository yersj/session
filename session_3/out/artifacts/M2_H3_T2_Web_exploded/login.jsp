<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 23.01.2022
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp"%>
</head>
<body>
<%@include file="nav.jsp"%>


<div class="container">
    <div class="row">
        <div class="col-lg-6 m-auto mt-5 mb-3">
            <%
                if (request.getParameter("emailError")!=null){
            %>
            <div class="alert alert-danger d-flex align-items-center" role="alert">
                <svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Danger:"><use xlink:href="#exclamation-triangle-fill"/></svg>
                <div>
                    Such Email does not exist!
                </div>
            </div>
            <%
                }

            %>
          <%
              if (request.getParameter("passwordError")!=null){
          %>
            <div class="alert alert-danger d-flex align-items-center" role="alert">
                <svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Danger:"><use xlink:href="#exclamation-triangle-fill"/></svg>
                <div>
                    Password is wrong!
                </div>
            </div>
            <%
                }
            %>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6 m-auto mt-5">
            <form method="post" action="/login">


                <h2>Login page</h2>
                <br>
                <div class="row mb-3">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
                    <div class="col-sm-10">
                        <input type="email" name="email" class="form-control" id="inputEmail3">
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
                    <div class="col-sm-10">
                        <input type="password" name="password" class="form-control" id="inputPassword3">
                    </div>
                </div>
                <button type="submit" class="btn btn-success">Login</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
