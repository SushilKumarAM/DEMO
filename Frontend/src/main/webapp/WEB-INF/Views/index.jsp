    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
   
<html>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@ include file="Header.jsp" %>
<body>
<div style=width:100%;height:550px>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
<ol class="carousel-indicators">
<li data-target="#myCarousel1" data-slide-to="0" class="active"></li>
<li data-target="#myCarousel2" data-slide-to="1" class="active"></li>
<li data-target="#myCarousel3" data-slide-to="2" class="active"></li>
</ol>
<div class="carousel-inner" align="center">
<div class="item active">
<img class="img-rounded" class="img-responsive center-block"
src="resources/images/EcomImg1.jpg" style=height:500px;width:100%>
</div>
<div class="item">
<img class="img-rounded" class="img-responsive center-block"
src="resources/images/EcomImg2.jpg" style=height:500px;width:100%>
</div>
<div class="item">
<img class="img-rounded" class="img-responsive center-block"
src="resources/images/EcomImg3.jpg" style=height:500px;width:100%>
</div>

</div>
<a class="left carousel-control" href="#myCarousel" data-slide="prev">
<span class="glyphicon glyphicon-chevron-left"></span>
<span class="sr-only">Previous</span>
</a>
<a class="right carousel-control" href="#myCarousel" data-slide="next">
<span class="glyphicon glyphicon-chevron-right"></span>
<span class="sr-only">Next</span>
</a>
</div>
</div>

<div  style=width:100%;height:2px;background:black;></div>


</body>
<%-- <jsp:include page="footer.jsp"></jsp:include> --%>
</html>
