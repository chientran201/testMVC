<%--
  Created by IntelliJ IDEA.
  User: chien
  Date: 3/17/2023
  Time: 9:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
<table>
    <tr><th>Create Product</th></tr>
    <tr>
        <td>name</td>
        <td><input name="nameID" type="text" width="100px"></td>
    </tr>
    <tr>
        <td>price</td>
        <td><input name="priceID" type="text" width="100px"></td>
    </tr>
    <tr>
        <td colspan="2"><input name="btn" type="button" value="create"></td>
    </tr>
</table>
</form>

</body>
</html>
