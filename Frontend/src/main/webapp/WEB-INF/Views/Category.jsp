<%@ include file="Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h3 align="center">Category Page</h3>

<form action="InsertCategory" method="post">
  <table align="center">
     <tr><td colspan="2"><center>Category Detail</center></td></tr>
     <tr>
        <td>Category Name</td>
        <td><input type="text" name="catname" id="catname"/></td>
     </tr>
     <tr bgcolor="pink">
        <td>Category Description</td>
        <td><textarea name="catdesc" id="catdesc"></textarea></td>
     </tr>  
     <tr>
        <td colspan="2"><center><input type="submit" value="INSERT"/></center>
     </tr>
      
  </table>
</form>

<table align="center">
  <tr>
     <td>Category ID</td>
     <td>Category Name</td>
     <td>Category Description</td>
     <td>Operation</td>
  </tr>   
<c:forEach items="${categoryList}" var="category">
    <tr>
    <td> ${category.categoryId}</td>
    <td> ${category.categoryName}</td>
    <td> ${category.categoryDesc}</td>
    <td>
        <a href="<c:url value='/editCategory/${category.categoryId}'/>">Edit</a>/
        <a href="<c:url value='/deleteCategory/${category.categoryId}'/>">Delete</a>
    </td>
    </tr>

</c:forEach>
</table>
</body>
</html>