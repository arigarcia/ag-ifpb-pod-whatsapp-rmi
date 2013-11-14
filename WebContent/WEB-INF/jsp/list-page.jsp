<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="list-page">
  <h2>Lista de Usuários Ativos</h2>
	<ul>
	<c:forEach items="${ps}" var="person">
	   <li>${person.name}</li>
	</c:forEach>
	</ul>
</div>