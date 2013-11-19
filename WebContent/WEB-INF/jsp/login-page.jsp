<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="login-page">
  <form class="form-horizontal" method="post" action="index.jhtml?p=authenticate">
    <legend>Login de Acesso</legend>
	  <div class="control-group">
	    <label class="control-label" for="inputEmail">Email</label>
	    <div class="controls">
	      <input type="text" id="inputEmail" placeholder="Email" name="userEmail">
	    </div>
	  </div>
	  <div class="control-group">
	    <label class="control-label" for="inputPassword">Password</label>
	    <div class="controls">
	      <input type="password" id="inputPassword" placeholder="Password" name="userPassword">
	    </div>
	  </div>
	  <div class="control-group">
	    <div class="controls">
	      <button type="submit" class="btn btn-primary">Sign in</button>
	    </div>
    </div>
  </form>
</div>