<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../../global-includes/header.jsp">
	<jsp:param value="Order confirmation" name="title" />
</jsp:include>
<div>
	<form:form commandName="flow">
		<table>
			<tr>
				<td>Pizza order:</td>
				<td>Size: ${flow.order.pizza.size.label}<br /> Toppings: <br />
					<c:forEach items="${flow.order.pizza.toppings}" var="topping">
						${topping}<br />
					</c:forEach>
				</td>
				<td><form:button name="_eventId_changeOrder"
						value="Change Order" type="submit">Change Order</form:button></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td>&nbsp;</td>
				<td><form:button name="_eventId_changeAddress"
						value="Change Address" type="submit">Change Address</form:button>
			</tr>
		</table>
		<form:button name="_eventId_back" value="&lt; Back" type="submit">&lt; Back</form:button>
		<form:button name="_eventId_next" value="Next &gt;" type="submit">Next &gt;</form:button>
	</form:form>
</div>
<jsp:include page="../../global-includes/footer.jsp" />