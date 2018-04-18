<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="Header.jsp" %>
<h3 align="center">User Home</h3>
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