<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<%@ include file="./base.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta charset="ISO-8859-1">

   <style type="text/css">
.background-container {
    position: relative;
    background-image: url('<c:url value="/resources/image/curdpr2.jpg"/>');
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    height: 100vh;
}

.overlay {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: rgba(255, 255, 255, 0.5); /* Adjust the opacity as needed */
    z-index: 1;
}
.table-hover tbody tr:hover {
            background-color: rgba(0, 123, 0, 0.3); /* Light blue color with transparency */
            transition: background-color 0.3s ease; /* Smooth transition for color change */
        }
</style>
</head>
<body>
<div class ="background-container">
<div class="overlay">
<div class="container mt-3">

<div class="row">
<div class="col-md-12">
<h1 class="text-center mb-3"> Welcome to Product App</h1>


</div>

<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">Sr.No.</th>
      <th scope="col">Name</th>
      <th scope="col">Description</th>
      <th scope="col">price</th>
      <th scope="col" >Action</th> 
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${product}" var="p">
    <tr>
    
      <th scope="row">${p.pid}</th>
      <td>${p.pName}</td>
      <td>${p.pDescription}</td>
      <td class="font-weight-bold"> &#8377 ${p.price}</td>
     <td >
     
  <span><a href="${pageContext.request.contextPath}/delete/${p.pid}" ><i class="fa fa-trash text-danger" style=" font-size: 20px" aria-hidden="true"></i> 
     </a></span> <span><a href="${pageContext.request.contextPath}/update/${p.pid}" ><i class="fa fa-pencil-square"  style=" font-size: 20px" aria-hidden="true"></i>
</a></span>
    
     
     </td>
     
    </tr>
    
     </c:forEach>
  </tbody>
</table>


</div>



</div>

<div class="container text-center">
<a href="add-product" class="btn btn-outline-success">Add</a>

</div>
</div>
</div>
</body>
</html>