<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 26.01.2022
  Time: 14:52
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
            <form action="/third" method="post">
                <h3>Login</h3>
                <div class="mb-3">
                    <label for="userUniversity" class="form-label">University:</label>
                    <input type="text" class="form-control" name="userUniversity" id="userUniversity">
                </div>
                <div class="mb-3">
                    <label for="userFaculty" class="form-label">Faculty:</label>
                    <input type="text" class="form-control" name="userFaculty" id="userFaculty">
                </div>
                <div class="mb-3">
                    <label for="userSpecialty" class="form-label">Specialty:</label>
                    <input type="text" class="form-control" name="userSpecialty" id="userSpecialty">
                </div>
                <button type="submit" class="btn btn-primary">Next></button>
            </form>
        </div>


    </div>


    <%
    HttpSession session1=request.getSession();
    List<String> list=(List<String>) session1.getAttribute("first");

        if(list.size()>6){


    %>
    <div class="row mt-3">
        <div class="col-lg-6 m-auto">
            <label>NAME: </label>
            <h3><%=list.get(0)%></h3>

            <label>SURNAME: </label>
            <h3><%=list.get(1)%></h3>

            <label>BIRTHDATE: </label>
            <h3><%=list.get(2)%></h3>

            <label>COUNTRY: </label>
            <h3><%=list.get(3)%></h3>

            <label>E-MAIL: </label>
            <h3><%=list.get(4)%></h3>

            <label>PHONE: </label>
            <h3><%=list.get(5)%></h3>

            <label>UNIVERSITY: </label>
            <h3><%=list.get(6)%></h3>

            <label>FACULTY: </label>
            <h3><%=list.get(7)%></h3>
            <label>SPECIALTY: </label>
            <h3><%=list.get(8)%></h3>

        </div>
    </div>
    <%
        }else{request.getRequestDispatcher("/third.jsp");}
    %>

</div>

</body>
</html>
