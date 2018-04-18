<%@ include file="Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h3 align="center">Supplier Page</h3>

<form action="InsertSupplier" method="post">
  <table align="center">
     <tr><td colspan="2"><center>Supplier Detail</center></td></tr>
     <tr>
        <td>Supplier Name</td>
        <td><input type="text" name="supplrname" id="supplrname"/></td>
     </tr>
     <tr bgcolor="pink">
        <td>Supplier Address</td>
        <td><textarea name="supplraddress" id="supplraddress"></textarea></td>
     </tr>  
     <tr>
        <td colspan="2"><center><input type="submit" value="INSERT"/></center>
     </tr>
      
  </table>
</form>

<table align="center">
  <tr>
     <td>Supplier ID</td>
     <td>Supplier Name</td>
     <td>Supplier Address</td>
     <td>Operation</td>
  </tr>   
<c:forEach items="${supplierList}" var="supplier">
    <tr>
    <td> ${supplier.supplierId}</td>
    <td> ${supplier.supplierName}</td>
    <td> ${supplier.supplierAddress}</td>
    <td>
        <a href="<c:url value='/editSupplier/${supplier.supplierId}'/>">Edit</a>/
        <a href="<c:url value='/deleteSupplier/${supplier.supplierId}'/>">Delete</a>
    </td>
    </tr>

</c:forEach>
</table>
</body>
</html>