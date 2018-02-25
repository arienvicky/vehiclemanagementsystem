<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Create an account</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="container">
    
   <h4 class="form-signin form-signin-heading"><c:if test = "${param.success == true}"> <a href="#">Record updated successfully</a></c:if></h4>

    
    <form:form method="POST" modelAttribute="vehicleForm" class="form-signin">
        <h2 class="form-signin-heading">Create your account</h2>
        <spring:bind path="fname">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="fname" class="form-control" placeholder="First Name"
                            autofocus="true" ></form:input>
                <form:errors path="fname"></form:errors>
            </div>
        </spring:bind>

 <spring:bind path="mname">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="mname" class="form-control" placeholder="Middle Name"
                            autofocus="true"></form:input>
                <form:errors path="mname"></form:errors>
            </div>
        </spring:bind>
         <spring:bind path="lname">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="lname" class="form-control" placeholder="Last Name"
                            autofocus="true"></form:input>
                <form:errors path="fname"></form:errors>
            </div>
        </spring:bind>
         <spring:bind path="block">
           <div class="form-group ${status.error ? 'has-error' : ''}">
              <form:select class="soflow-color" path="block">
      <option>Block</option>
      <option value="A"> A</option>
      <option value="B"> B</option>
      <option value="C"> C</option>
      <option value="D"> D</option>
      <option value="E"> E</option>
  </form:select>
            </div>
        </spring:bind>
        <spring:bind path="houseno">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="houseno" class="form-control" placeholder="House Number"
                            autofocus="true"></form:input>
                <form:errors path="houseno"></form:errors>
            </div>
        </spring:bind>
        <spring:bind path="floor">
             <div class="form-group ${status.error ? 'has-error' : ''}">
           <form:select class="soflow-color" path="floor" >
      <option>Floor</option>
      <option value="G"> G</option>
      <option value="1"> 1</option>
      <option value="2"> 2</option>
      <option value="3"> 3</option>
      <option value="4"> 4</option>
      <option value="5"> 5</option>
      <option value="6"> 6</option>
  </form:select>
            </div>
        </spring:bind>
        
        
<spring:bind path="email">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="email" class="form-control" placeholder="Email"
                            autofocus="true"></form:input>
                <form:errors path="email"></form:errors>
            </div>
        </spring:bind>

<spring:bind path="ownership">
           <div class="form-group ${status.error ? 'has-error' : ''}">
               <form:select class="soflow-color" path="ownership">
                               <option>Ownership</option>
               
      <option value="owner">Owner</option>
      <option value="tenant">Tenant</option>
  </form:select>
            </div>
        </spring:bind>

<spring:bind path="vehicleContact[0].phoneno">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="vehicleContact[0].phoneno" class="form-control" placeholder="Mobile Number"
                            autofocus="true"></form:input>
                <form:errors path="vehicleContact[0].phoneno"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="vehicleType[0].type">
           
              <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:select class="soflow-color" path="vehicleType[0].type">
                <option>Vehicle Type</option>
      <option value="car">Car</option>
      <option value="bike">Bike</option>
      <option value="scooter">Scooter</option>
  </form:select>
            </div>
        </spring:bind>    
        <spring:bind path="vehicleType[0].stickerno">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="vehicleType[0].stickerno" class="form-control" placeholder="Sticker Number"
                            autofocus="true"></form:input>
                <form:errors path="vehicleType[0].stickerno"></form:errors>
            </div>
        </spring:bind>
            <spring:bind path="vehicleType[0].vehicleno">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="vehicleType[0].vehicleno" class="form-control" placeholder="Vehicle Number"
                            autofocus="true"></form:input>
                <form:errors path="vehicleType[0].vehicleno"></form:errors>
            </div>
        </spring:bind>
          
            <spring:bind path="vehicleType[0].dateofissue">
            Date of Issue<div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="vehicleType[0].dateofissue" class="form-control" placeholder="Date of Issue"
                            autofocus="true" value="25-02-2018" readonly="true"></form:input>
                <form:errors path="vehicleType[0].dateofissue"></form:errors>
            </div>
        </spring:bind>
        <spring:bind path="comments">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="comments" class="form-control" placeholder="Comments"
                            autofocus="true"></form:input>
                <form:errors path="comments"></form:errors>
            </div>
        </spring:bind>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
    </form:form>
 <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h4 class="form-signin form-signin-heading"><a onclick="document.forms['logoutForm'].submit()">Logout</a></h4>

    </c:if>

</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
