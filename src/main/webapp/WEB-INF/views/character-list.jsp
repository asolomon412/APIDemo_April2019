<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Star Wars</title>
</head>
<body>

	<div class="container">


		<table class="table">
			<thead>
				<tr>
					<td>Name</td>
					<td>Height</td>
					<td>Mass</td>
					<td>Hair Color</td>

				</tr>

			</thead>

			<tbody>
				<c:forEach var="b" items="${list}">
					<tr>
						<td>${b.name }</td>
						<td>${b.height }</td>
						<td>${b.mass }</td>
						<td>${b.haircolor }</td>

					</tr>

				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>