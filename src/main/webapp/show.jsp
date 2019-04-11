<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach var="user" items="${requestScope.list}">
        <tr>
            <td>
               编号：${user.id}
                <hr/>
            </td>
            <td>
                姓名：${user.name}
                <hr/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
