<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: arek
  Date: 28.07.2022
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>${size}</h4>
<table>
    <c:forEach begin="1" end="${size}" var="el">
        <tr>
            <c:forEach begin="1" end="${size}" var="el2">
                <td>
                        ${el*el2}
                </td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
</body>
</html>
