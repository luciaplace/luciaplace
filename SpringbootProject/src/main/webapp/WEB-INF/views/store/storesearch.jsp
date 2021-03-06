<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ํ์์กฐํ</title>
<style>
#spage {text-align: center;}
body{
	background-color: #fff;
}
table {
	border:1px solid #fff;
	border-collapse:collapse;
   	margin:2% 0%;
   	width:100%;
}
th{
	border:1px solid white;
	background: #000;
	color:#fff;
	width: 150px;
}
td{
	border-bottom:1px solid lightgrey;
	text-align:center;
	padding: 5px;
}
tr:hover{
	border-collapse: collapse;
	background-color: lightgrey;
    color: black;	
}
h1{
	text-align: center;
	color:#000;
}
form{
	margin:3%;
}
select{
	border:2px solid #000;
	border-radius:10px;
	padding:5px;
}
option{
	color:#fff;
	background-color:#000;
}
input[type="button"]{
	border:1px solid #000;
	background-color:#000;
	color:#fff;
	border-radius: 10px;	
}
#update:hover{
	color:#fff;
	border:1px solid #02B1FB;
	background-color:#02B1FB;	
}
#delete:hover{
	color:#fff;
	border:1px solid #F81032;
	background-color:#F81032;	
}
input[type="submit"]{
	border:1px solid #fff;
	background-color:#000;
	color:#fff;
	border-radius:10px;
	padding:5px;
} 
input[type="submit"]:hover{
	color:#000;
	border:1px solid #000;
	background-color:white;
}
input[type="text"]{
	 width:200px;
 	 height:20px;
  	 font-size:15px;
  	 background-color:#fff;  	 
  	 border-right:0px; 
  	 border-top:0px; 
  	 border-left:0px;
  	 border-bottom:2px solid #000;
  	 text-align:center; 
}
input[type="text"]:focus {outline:none;}
.left{

	max-height:300px;
	overflow:hidden;
}
.left img{
	width:100%;
	max-height:initial;
	margin-top:-15%;
}
</style>
</head>
<body>
<body>
<%@include file="../include/header.jsp" %>

<div class="left">
	<img id='foodlistimg' src="../upload/foodlist1.png">
</div>

<div>
	<h1>"${ssearch}"์ผ๋ก ๊ฒ์ํ ๊ฒฐ๊ณผ์๋๋ค.</h1>
	
<div id="ssearch" align="center">
	<form action="storesearch">
		<select name="ssearchn">
			<option value="0">์ํธ๋ช</option>
			<option value="1">์ฃผ์</option>
			<option value="2">์ฐ๋ฝ์ฒ</option>
		</select>
<input type="text" name="ssearch" size="15" maxlength="50" /> 
<input type="submit" value="๊ฒ์" />
	</form>
</div>

<c:if test="${storecount != 0 }">
	<table>
		<tr><th>๊ฐ๊ฒno</th>
			<th>์ํธ๋ช</th>
			<th>์ฃผ์</th>
			<th>์ฐ๋ฝ์ฒ</th>
			<th>์์?/์ญ์?</th>
		</tr>
			<c:forEach items="${sList}" var="storelist">
		<tr>			
			<td>${storelist.storeid}</td>
			<td>${storelist.storename}</td>
			<td>${storelist.storeaddress}</td>
			<td>${storelist.storephone}</td>
			<td><input type="button" value="์์?" id="update" onclick="updatestore('${storelist.storeid}')">
			<input type="button" value="์ญ์?" id="delete" onclick="deletestore('${storelist.storeid}')"></td>
		</tr>
		</c:forEach>
	</table>
			<div id="spage">
				<c:if test="${begin > pageNum }">
					<a href="/store/storesearch?p=${begin-1}&ssearch=${ssearch}&ssearchn=${ssearchn}">[์ด์?]</a>
				</c:if>
				<c:forEach begin="${begin}" end="${end}" var="i">
					<a href="/store/storesearch?p=${i}&ssearch=${ssearch}&ssearchn=${ssearchn}">${i}</a>
				</c:forEach>
				<c:if test="${end < totalPages }">
					<a href="/store/storesearch?p=${end+1}&ssearch=${ssearch}&ssearchn=${ssearchn}">[๋ค์]</a>
				</c:if>
			</div>

</c:if>
		<c:if test="${storecount == 0 }">
			๊ฒ์ ์กฐ๊ฑด์ ๋ง๋ ๊ฐ๊ฒ๊ฐ ์์ต๋๋ค.
		</c:if>
</div>
	
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
	function updatestore(id){
		var result =confirm("๊ฐ๊ฒ์?๋ณด๋ฅผ ์์? ํ์๊ฒ?์ต๋๊น?");
		if(result){
			location.href="updateStore?storeid="+id;
		}else{
		
		}
		
	};
	
	function deletestore(id){
		var result =confirm("๊ฐ๊ฒ์?๋ณด๋ฅผ ์ญ์? ํ์๊ฒ?์ต๋๊น?");
		if(result){
			location.href="deletestore?storeid="+id;
		}else{
		
		}
		
	};

</script>
</body>
<%@ include file="../include/footer.jsp" %>
</html>