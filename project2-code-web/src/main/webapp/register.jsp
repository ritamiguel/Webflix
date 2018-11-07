<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<%@ include file = "header.jsp" %>
	<head>
  <title>Login</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	</head>
	<body>
	
	<div class="container">
	    <form class="form-signing" action="register" method="post">
	            <h2 class="form-signin-heading">Please sign in</h2>
	        <label for="firstName" class="sr-only">First Name</label>
	        <input class="form-control" id="firstName" type="text" name="firstName" placeholder="First Name"required>
	        <label for="password" class="sr-only">Last Name</label>
	        <input class="form-control" id="lastName" type="text" name="lastName" placeholder="Last Name" required>
	        <label for="email" class="sr-only">Email address</label>
	        <input class="form-control" id="email" type="email" name="email" placeholder="Email" required autofocus>
	        <label for="password" class="sr-only">Password</label>
	        <input class="form-control" id="password" type="password" name="password" placeholder="Password" required>
	        <label for="email" class="sr-only">Credit Card Number</label>
	        <input class="form-control" id="creditCard" type="text" name="creditCard" placeholder="Credit Card" required autofocus>
	        &nbsp;
	        <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
	        &nbsp;
	        <p>Already registered? <a href="login.jsp">Please sign in</a></p>
	    </form>
	    <c:if test="${error.length()>0}">
	        <div class="alert alert-warning alert-dismissible fade show" role="alert">
	                ${error}
	        </div>
	    </c:if>
	
	</div>
	</body>
</html>