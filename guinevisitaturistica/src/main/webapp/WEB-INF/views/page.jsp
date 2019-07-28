<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<spring:url var="css" value="/resources/css" />

<spring:url var="js" value="/resources/js" />

<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>



<title>${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<link href="${css}/reservation.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/mystyle.css" rel="stylesheet">
<link href="${css}/agency.css" rel="stylesheet">
<link href="${css}/agency.min.css" rel="stylesheet">
<link href="${css}/lightbox.min.css" rel="stylesheet">



</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>
		<!-- /Navigation -->
		<!-- HEADER -->
		<c:if test="${userclickhome == true}">

			<%@include file="carousel.jsp"%>
			<!-- /HEADER -->

			<!-- Page Content -->
			<div class="content">
				<%@include file="home.jsp"%>
				<!-- /.container -->
		</c:if>

		<!-- only load when user clicks contacts -->
		<c:if test="${userclickcontact==true}">

			<%@include file="contact.jsp"%>

		</c:if>

		<!-- only load when user clicks reservation -->
		<c:if test="${userclickreservation== true or userclickSingleDestination==true}">

			<%@include file="hotels.jsp"%>

		</c:if>

		<!-- only load when user clicks etnic-->
		<c:if test="${userclicketnic==true}">

			<%@include file="etnic.jsp"%>

		</c:if>


		<!-- only load when user clicks gastro -->
		<c:if test="${userclickgastro==true}">

			<%@include file="gastronomie.jsp"%>

		</c:if>

	</div>
	<!-- end div content -->
	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>
	

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
	<script src="${js}/lightbox-plus-jquery.min.js"></script>
		
		<!-- javascript on my own -->
	<script src="${js}/appjs.js"></script>



	</div>
	<!-- end wrapper -->
</body>

</html>
