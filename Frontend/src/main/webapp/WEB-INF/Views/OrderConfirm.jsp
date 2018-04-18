<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="Header.jsp" %>


<div class="container">

<form action="<c:url value="/Payment/"/>" method="post">
<table align="center">
  <tr>
     <td>Product ID</td>
     <td>Product Name</td>
     <td>Quantity</td>
     <td>Price</td>
     <td>Total Price</td>
     <td>Operation</td>
  </tr>   
<c:forEach items="${cartItems}" var="cartItem">
    <tr>
     <td> ${cartItem.productId}</td>
    <td> ${cartItem.productName}</td>
    <td> ${cartItem.quantity}</td>
    <td> ${cartItem.price}</td>
    <td> ${cartItem.price*cartItem.quantity}</td>
    
    </form>
    </tr>

</c:forEach>
	<tr>
		<td colspan="4">Total Amount</td>
		<td>${totalAmount}</td>	
	</tr>
	<tr><td colspan="5">
	<table width="100%">
		<tr>
			<td>
				<input type="radio" name="pmode" value="CD"/>Cash On Delivery
				<input type="radio" name="pmode" value="CC"/>Credit Card
				<input type="radio" name="pmode" value="NB"/>NetBanking
			</td>
		</tr>
	
	</table>
	</td></tr>
	<tr>
		<td colspan="4"><a href="<c:url value="/Cart/"/>" class ="btn btn-danger btn-block">Cart</a></td>
		<td colspan="2"><input type="submit" value="Payment" class ="btn btn-danger btn-block"/></td>
 	
	</tr>
	


</table>
</form>

</div>