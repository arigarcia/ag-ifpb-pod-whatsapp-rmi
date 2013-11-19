<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="register-person">
	<form action="index.jhtml?p=save-person" method="post">
	  <div>
	   <label>Nome do Usuário:</label>
	   <input type="text" name="personName" value="" >
	  </div>
	  <div>
     <label>Email do Usuário:</label>
     <input type="text" name="personEmail" value="">
    </div>
    <div>
     <label>Senha do Usuário:</label>
     <input type="password" name="personPassword" value="">
    </div>
    <div>
	     <button class="btn" type="submit">Salvar</button>
	  </div>
	</form>
</div>