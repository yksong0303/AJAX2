<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	ajax index화면<br>
<c:if test="${sessionScope.id == null}">
<a href="/views/user/login"><button>로그인</button></a>
</c:if>
<c:if test="${sessionScope.id != null}">
<button onclick="doLogout()">로그아웃</button> 
</c:if>
<script>
function ajax(params){
	function callback(){
		alert(1);
	}
	var xhr = new XMLHttpRequest();
	xhr.open(params.method,params.url);
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4){
			if(xhr.status==200){
				if(params.func){
					params.func(xhr.responseText);
				}else{
					callback();
				}
			}
		}
	}
	if(params.params){
		xhr.send(params.params);
	}else{
		xhr.send();
	}
}

function doLogout(){
	ajax({
		method : 'POST',
		url : '/user/logout',
		params : null,
		func : function(res){
			var res = JSON.parse(res);
			alert(res.msg);
			location.href='/';
		}
	});
}
</script>
</body>
</html>


