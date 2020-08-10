<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/user/login" method="POST">
	<table border="1">
		<tr>
			<th>아이디</th>
			<td><input type="text" id="id" name="id"></td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="password" id="pwd" name="pwd"></td>
		</tr>
		<tr>
			<th colspan="2"><button>로그인</button></th>
		</tr>
	</table>
</form>
<script>
function doLogin(){
	var id = document.querySelector('#id').value;
	var pwd = document.querySelector('#pwd').value;
	var params = {
			id : document.querySelector('#id').value,
			pwd : document.querySelector('#pwd').value
	}
	var xhr = new XMLHttpRequest();
	xhr.open('POST','/user/login');
	xhr.send(JSON.stringify(params));
}
</script>
</body>
</html>



