<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="Header.jsp" %>
<div class="container">

<div class="row"></div>
     <c:forEach items="${listProducts}" var="product">
     <div class="col-sm-6 col-md-3">
         <a href ="productDesc/${product.productId}" class="thumbnail">
           <img src ="<c:url value="/resources/images/${product.productId}.jpg"/>" width="100" height="150" alt ="Generic thumbnail">
         </a>
         <p>
          Product Name : ${product.productName}
          Product Price : Rs ${product.price}
         </p>     
     </div>
     </c:forEach>
</div>
</div>
 --%>




<html>
<head>
<title>Insert title here</title>
<style>
body{
	background:white;
}
.wrap{
	width:1000px;
	margin:auto;
	margin-top:100px;
}

.card{
	box-shadow:0 4px 8px 0 rgba(0,0,0,0.6);
	transtion:0.4s;
	width:300px;
	height:300px;
	background:#fff;
	text-align:center;
	font-size:16px;
	float:left;
	margin:10px;
.card:hover{
	box-shadow:0 8px 16px 0 rgba(0,0,0,0.6);
	
}
.container{
	padding:2px 16px;
}

}
</style>
</head>
<body>
<div class="col-sm-4 col-md-3 col-md-3">
<div class ="wrap">
	<div class ="card">
	<img src="<c:url value="/resources/images/${product.productId}.jpg"/>"  alt="productimg" style ="width:100%">
	<div class ="container">
	<h4> Product Name : ${product.productName}</h4>
	<p>Product Price : Rs ${product.price}</p>
	</div>
	</div>


</div>
</div>
</body>
</html>