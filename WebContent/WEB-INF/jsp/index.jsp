<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>IFPB POD Application</title>
	<!--  bootstrap -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<!--  jQuery -->
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<!-- styles -->
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
  <!-- Header -->
  <div class="app-header row">
    <h1 class="span5 offset2">IFPB POD Application</h1>
    <nav class="span5 pull-right">
      <ul class="nav nav-pills">
        <li><a href="index.jhtml">home</a></li>
        <li><a href="index.jhtml?p=register-page">cadastro de usuários</a></li>
        <li><a href="index.jhtml?p=list-page">lista de usuários</a></li>
      </ul>
    </nav>
  </div>
  <!-- Content -->
  <div class="app-content">
    <jsp:include page="${page}"></jsp:include>
  </div>
  <!-- Footer -->
  <div align="right">
    <small>Created by @IFPB</small>
  </div>
</body>
</html>