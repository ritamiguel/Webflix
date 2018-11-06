<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file = "header.jsp" %>
<body>
<div class="container">
    <form class="form-signing" action="login" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="email" class="sr-only">Email address</label>
        <input class="form-control" id="email" type="email" name="email" placeholder="Email" required autofocus>
        <label for="password" class="sr-only">Password</label>
        <input class="form-control" id="password" type="password" name="password" placeholder="Password"  required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>
    <c:if test="${error.length() > 0}">
        <div class="alert alert-warning alert-dismissible fade show" role="alert">
                ${error}
        </div>
    </c:if>


</div>
</body>
</html>