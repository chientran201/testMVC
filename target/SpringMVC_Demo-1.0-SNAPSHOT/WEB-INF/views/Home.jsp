<%@ page import="com.chien.models.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: chien
  Date: 3/16/2023
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
        td {
            padding-right: 30px;
        }
    </style>
</head>
<body>

    <c:url value="/home" var="urlUpdate"/>
    <%
        List<Product> list = (List<Product>) request.getAttribute("listproduct");
    %>

<h1>List Products:</h1>
<br />
<br />
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
    </tr>
        <%
            for (Product i: list) {
         %>
            <tr>
                <td> <%=i.getId() %> </td>
                <td> <%=i.getName() %> </td>
                <td> <%=i.getPrice() %> </td>
            </tr>
        <%
            }
        %>


</table>
    <table>
        <c:forEach items="${listproduct}" var="user">
            <tr>
                <td><c:out value="${user.id}" /></td>
                <td><c:out value="${user.name}" /></td>
                <td><c:out value="${user.price}" /></td>
            </tr>
        </c:forEach>
    </table>
    ${chien}
</body>
</html>
