<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 26.01.2022
  Time: 17:16
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
        <div class="col-lg-6 m-auto">

            <table class="table">
                <thead>
                <tr>
                    <th scope="col">NAME</th>
                    <th scope="col">PRICE</th>
                    <th scope="col">REMOVE</th>
                </tr>
                </thead>


                <tbody>
                <%
                    HttpSession session1 = request.getSession();
                    HashMap<String, Double> map = (HashMap<String, Double>) session1.getAttribute("list");
                    for (String name : map.keySet()) {

                %>
                <tr>
                    <td><%=name%>
                    </td>
                    <td><%=map.get(name)%> USD
                    </td>
                    <td><a href="/remove?key=<%=name%>" class="btn btn-danger">REMOVE</a></td>
                </tr>
                <%
                    }
                %>
                </tbody>

            </table>

        </div>

    </div>
    <div class="row">
        <div class="col-lg-4 m-auto">
            <a href="/main" class="btn btn-info">Home</a>
        </div>
    </div>
</div>

</body>
</html>
