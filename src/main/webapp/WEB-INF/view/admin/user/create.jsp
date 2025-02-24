<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <!--Compile CSS-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!--Compile JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" ></script>
    <!--Compile JQUERY-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    
</head>
<body>
  <form:form method="post" action="/admin/user/create" modelAttribute="newUser">
    <div class="form-group">
      <label for="exampleInputEmail1">Email address</label>
      <form:input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" path="email"/>
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Password</label>
      <form:input type="password" class="form-control" id="exampleInputPassword1" path="password"/>
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Phone Number</label>
      <form:input type="text" class="form-control" id="exampleInputPassword1" path="phone"/>
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">FullName</label>
      <form:input type="text" class="form-control" id="exampleInputPassword1" path="fullName" />
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Address</label>
      <form:input type="text" class="form-control" id="exampleInputPassword1" path="address"/>
    </div>
      
    </div>
    <button type="submit" class="btn btn-primary">Create</button>
  </form:form>
</body>
</html>