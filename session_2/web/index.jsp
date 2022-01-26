<%@ page import="model.Items" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 26.01.2022
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp"%>
    <title>Shop</title>
</head>
<body>
<%
    List<Items> items=(List<Items>) request.getAttribute("list");


%>
       <div class="container">
           <%
               for(Items item:items){
           %>
           <div class="row mt-3 mb-2">
               <div class="col-lg-5 border border-secondary">
                   <h4 class="mt-2"><%=item.getName()%>-<%=item.getPrice()%> USD</h4>

                   <p><%=item.getDescription()%></p>

                   <a href="/basket?name=<%=item.getName()%>&price=<%=item.getPrice()%>"  class="btn btn-success mb-3">+ ADD TO BASKET</a>
               </div>
           </div>

           <%
               }
           %>

           <a href="/goToBasket" class="btn btn-primary">GO TO BASKET</a>
       </div>

</body>
</html>
