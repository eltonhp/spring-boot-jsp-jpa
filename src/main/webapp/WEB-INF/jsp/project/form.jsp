<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="pt-br">
<body>
<form action="/project/" method="post">
	<input type="hidden" name="id" id="id" value="${project.id}">
	<input type="text" name="nome" id="nome" value="${project.nome}">
	<form:errors path="project.nome" />
	<input type="date" name="dataInicio" id="dataInicio" value="${project.dataInicio}">
	<input type="date" name="dataPrevisaoFim" id="dataPrevisaoFim" value="${project.dataPrevisaoFim}">
	<input type="date" name="dataFim" id="dataFim" value="${project.dataFim}">
	<input type="text" name="orcamento" id="orcamento" value="${project.orcamento}">
	<input type="text" name="descricao" id="descricao" value="${project.descricao}">

	<form:select path="gerente" items="${allManager}" itemValue="id" itemLabel="nome"/>

	<form:select path="status" items="${allProjectStatus}" itemValue="status" itemLabel="name"/>

	<input type="submit" value="Salvar"/>
</form>
</body>
</html>
