<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../../global-includes/header.jsp">
	<jsp:param value="Receipt" name="title" />
</jsp:include>
<div>
	<form:form commandName="flow">
		<form:button name="_eventId_home" value="Home" type="submit">Home</form:button>
	</form:form>
</div>
<jsp:include page="../../global-includes/footer.jsp" />