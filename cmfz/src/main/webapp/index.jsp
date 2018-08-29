<%@page contentType="text/html; utf-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<h2>Hello World!</h2>
<h1>测试代码的</h1>


<c:forEach var="user" items="${sessionScope.users}">
    ${user.name}
    ${user.password}

　


</c:forEach>


</body>
</html>
