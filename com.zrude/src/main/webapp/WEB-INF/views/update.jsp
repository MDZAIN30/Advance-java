<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="base.jsp"  %>
<%@ page isELIgnored="false"  %> 

<title>Insert title here</title>
</head>
<body>
<div class="container mt-3">
<div class="row">
<div class="col-md-6 offset-md-3">
<h1 class="text-center mb-3">Update Product Details</h1>

<form action="${pageContext.request.contextPath}/update-product" method="post">
    <input type="hidden" name="pid" value="${product.pid}" />
    
    <div class="form-group">
        <label for="name">Product Name</label>
        <input type="text" class="form-control" id="name" name="pName" placeholder="Enter the product name">
    </div>
    
    <div class="form-group">
        <label for="description">Product Description</label>
        <textarea class="form-control" name="pDescription" id="description" rows="5" placeholder="Enter the product description"></textarea>
    </div>
    
    <div class="form-group">
        <label for="price">Product Price</label>
        <input type="text" class="form-control" name="price" id="price"  placeholder="Enter the product price">
    </div>
    
    <div class="container text-center">
        <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
        <button type="submit" class="btn btn-primary">Update</button>
    </div>
</form>


</div>
</div>
</div>


</body>
</html>