<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="pt-br">
<body>
	${mensagem}
	<ul>
		<c:forEach items="${projects}" var="project">
			<li><a href="/project/${project.id}">${project.nome}</a></li>
		</c:forEach>
	</ul>
	<a href="/project/novo">Novo</a>
</body>
</html>
