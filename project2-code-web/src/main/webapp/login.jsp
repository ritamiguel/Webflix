<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file = "header.jsp" %>

<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<c:if test="${session.loggedIn == true && session.email != null}">
  <c:redirect url="menu.jsp" />
</c:if>
  <div class="container">
    <form class="form-signing" action="login" method="post">
        <h2 class="form-signin-heading">Insert Login Data</h2>
        &nbsp;
        <label for="email" class="sr-only">Email address</label>
        <input class="form-control" id="email" type="email" name="email" placeholder="Email" required autofocus>
        &nbsp;
        <label for="password" class="sr-only">Password</label>
        <input class="form-control" id="password" type="password" name="password" placeholder="Password"  required>
        &nbsp;
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        &nbsp;
        <p>Not registered yet? <a href="register.jsp">Please regist here</a></p>
    </form>
    <c:if test="${error.length() > 0}">
        <div class="alert alert-warning alert-dismissible fade show" role="alert">
                ${error}
        </div>
    </c:if>
</div>

</body>
</html>