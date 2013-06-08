<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>JUG's Pizzeria</title>
</head>
<body>
	<div style="float: left; text-align: center; width: 100%">
		<h1>Order confirmation</h1>
		<div>
			<form:form>
				<input type="submit" value="<< Back" />
				<input type="submit" value="Next >>" />
			</form:form>
		</div>
	</div>
</body>
</html>