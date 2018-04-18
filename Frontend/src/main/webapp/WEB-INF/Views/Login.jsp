<%@ page language="java" contentType="text/html"%>
<%@ include file="Header.jsp" %>

<h3 align="center">Login Page</h3>

<form action="perform_login" method="post">
	<table align="center">
		<tr>
			<td colspan="2"><center>Login Credential</center></td>
		</tr>
		<tr>
			<td> User Name</td>
			<td><input type="text" name="username"/></td>
		</tr>
		<tr>
			<td> Password</td>
			<td><input type="password" name="password"/></td>
		</tr>
		<tr align="center">
			<td colspan="2"><input type="submit" value="SUBMIT"/></td>
		</tr>
	</table>
	
</form>
