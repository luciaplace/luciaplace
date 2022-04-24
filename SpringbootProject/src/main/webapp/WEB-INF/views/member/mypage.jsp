<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>title</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style>
#tab{
	
	padding-left: 380px;
	padding-right: 380px;
}
table.type04 {
  border-collapse: separate;
  border-spacing: 1px;
  text-align: center;
  line-height: 1.5;
  border-top: 1px solid #ccc;
  margin : 20px 10px;
  margin-left: auto;
  margin-right: auto;
}
table.type04 th {
  width: 150px;
  padding: 10px;
  font-weight: bold;
  vertical-align: top;
  border-bottom: 1px solid #ccc;
}
table.type04 td {
width: 350px;
  padding: 10px;
  vertical-align: top;
  border-bottom: 1px solid #ccc;
}
table.type05 {
  border-collapse: separate;
  border-spacing: 1px;
  text-align: center;
  line-height: 1.5;
  border-top: 1px solid #ccc;
  margin : 20px 10px;
  margin-left: auto;
  margin-right: auto;
  width: 500px;
  height: 200px;
  float: left;
}
table.type05 th {
  width: 150px;
  padding: 10px;
  font-weight: bold;
  vertical-align: top;
  border-bottom: 1px solid #ccc;
}
table.type05 td {
width: 350px;
  padding: 10px;
  vertical-align: top;
  border-bottom: 1px solid #ccc;
}
table.type06 {
  border-collapse: separate;
  border-spacing: 1px;
  text-align: center;
  line-height: 1.5;
  border-top: 1px solid #ccc;
  margin : 20px 10px;
  margin-left: auto;
  margin-right: auto;
  width: 500px;
  height: 200px;
  float: right;
}
table.type06 th {
  width: 150px;
  padding: 10px;
  font-weight: bold;
  vertical-align: top;
  border-bottom: 1px solid #ccc;
}
table.type06 td {
width: 350px;
  padding: 10px;
  vertical-align: top;
  border-bottom: 1px solid #ccc;
}
.bt{
 width:115px;
    background-color: black;
    border: none;
    color:#fff;
    font-size: 15px;
    outline:none;
    cursor: pointer;
}
a:link { color: black; text-decoration: none;}
a:visited { color: black; text-decoration: none;}
a:hover { color: black; text-decoration: underline;}
</style>
</head>
<body>
<c:import url="/WEB-INF/views/include/top.jsp" />
<div id="tab">
<!-- tabs link -->
<ul class="nav nav-tabs" id="rowTab">
    <li class="active"><a href="#info" data-toggle="tab">내정보</a></li>
    <li><a href="#myBoard" data-toggle="tab">내가 쓴 게시글</a></li>
    <li><a href="#myComm" data-toggle="tab">내가 쓴 댓글</a></li>
</ul>
<!-- end: tabs link -->
</div>
<div class="tab-content" id="tab">
    <div class="tab-pane active" id="info">
        <div class="body">
<table class="type04">
<tr>
<th scope="row">아이디</th> <td>${user.memberid}</td></tr>
<tr>
<th scope="row">비밀번호</th> <td>${user.memberpw}</td></tr>
<tr>
<th scope="row">이름</th> <td>${user.name }</td></tr>
<tr>
<th scope="row">전화번호 </th><td>${user.phone }</td></tr>
<tr>
<th scope="row">주소     </th><td> ${user.address }</td></tr>
<tr>
<th scope="row">성별 </th><td>${user.gender }</td></tr>
<tr>
<th scope="row">생년월일 </th><td><fmt:formatDate value="${user.birthday }" pattern="yyyy-MM-dd"/></td></tr>
<tr>
<th scope="row">메일  </th><td>${user.email }</td></tr>
<tr>
<th scope="row">반려동물여부</th><td>${user.pet }</td></tr>
</table>
<div class="bt1" style="text-align: center; padding-bottom: 26%;">
<button type="button" onclick="location.href='updateform'" class="bt">회원 정보 수정</button>
<button type="button" onclick="location.href='deleteform'" class="bt">회원 탈퇴</button>
</div>
    </div>
</div>
    <div class="tab-pane" id="myBoard">
       
	<div>
    <div><h4 style="text-align: center;">같이살아요</h4></div>
 	<c:if test="${count != 0 }">
 	
			<table class="table table-hover">
			<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr id="boardtr">
					<th id="boardth">글번호</th>
					<th id="boardth">제목</th>
					<th id="boardth">작성자</th>
					<th id="boardth">작성일</th>
					
				</tr>
				<c:forEach items="${rList}" var="rooms">
					<tr>
						<td><a href ="/room/list/${rooms.roomno}">${rooms.roomno}</a></td>
						<td><a href ="/room/list/${rooms.roomno}">${rooms.roomtitle}</a></td>
						<td><a href ="/room/list/${rooms.roomno}">${rooms.memberid }</a></td>
						<td><a href ="/room/list/${rooms.roomno}"><fmt:formatDate value="${rooms.roomregdate }" dateStyle="short"/></a> </td>
						
					</tr>
				</c:forEach>
			</table>
			<div id="page" style="text-align: center;">
				<c:if test="${begin1 > pageNum1 }">
					<a href="mypage?p1=${begin1 -1 }">[이전]</a>
				</c:if>
				<c:forEach begin="${begin1 }" end="${end1}" var="i">
					<a href="mypage?p1=${i}">${i}</a>
				</c:forEach>
				<c:if test="${end < totalPages }">
					<a href="mypage?p1=${end1 +1}">[다음]</a>
				</c:if>
			</div>

		</c:if></div>
		<c:if test="${count == 0 }">
	<table class="table table-hover">
	<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					
				</tr>
		
		</table>
		<div style="text-align: center;"><strong style="text-align: center;">아직 입력한 글이 없습니다.</strong></div><hr>
</c:if>


<div><h4 style="text-align: center;">자유게시판</h4></div>
<c:if test="${count1 != 0 }">
			<table class="table table-hover">
			
			<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					
				</tr>
				<c:forEach items="${bList}" var="blist">
					<tr>
						<td><a href ="/board/content/${blist.no}">${blist.no}</a></td>
						<td><a href ="/board/content/${blist.no}">${blist.title}</a></td>
						<td><a href ="/board/content/${blist.no}">${blist.memberid }</a></td>
						<td><a href ="/board/content/${blist.no}"><fmt:formatDate value="${blist.regdate }" dateStyle="short"/></a></td>
						
					</tr>
				</c:forEach>
			</table>
			
			<div id="page" style="text-align: center;">
				<c:if test="${begin2 > pageNum2 }">
					<a href="mypage?p2=${begin-1 }">[이전]</a>
				</c:if>
				<c:forEach begin="${begin2 }" end="${end2}" var="i">
					<a href="mypage?p2=${i}">${i}</a>
				</c:forEach>
				<c:if test="${end2 < totalPages2 }">
					<a href="mypage?p2=${end2 +1}">[다음]</a>
				</c:if>
			</div>

		</c:if>
		<c:if test="${count1 == 0 }">
		<table class="table table-hover">
		<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					
				</tr>
		
		</table>
		<div style="text-align: center;"><strong style="text-align: center;">아직 입력한 글이 없습니다.</strong></div><hr>
</c:if>

		<div>
	<div><h4 style="text-align: center;">같이먹어요</h4></div>
	<c:if test="${count2 != 0 }">
			<table class="table table-hover">
			<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					
				</tr>
				<c:forEach items="${fList}" var="flist">
					<tr>
						<td><a href ="/fsboard/content/${flist.fsno}">${flist.fsno}</a></td>
						<td><a href ="/fsboard/content/${flist.fsno}">${flist.fstitle}</a></td>
						<td><a href ="/fsboard/content/${flist.fsno}">${flist.memberid }</a></td>
						<td><a href ="/fsboard/content/${flist.fsno}"><fmt:formatDate value="${flist.regdate }" dateStyle="short"/></a> </td>
						
					</tr>
				</c:forEach>
			</table>
			<div id="page" style="text-align: center;">
				<c:if test="${begin3 > pageNum3 }">
					<a href="mypage?p3=${begin3-1 }">[이전]</a>
				</c:if>
				<c:forEach begin="${begin3 }" end="${end3}" var="i">
					<a href="mypage?p3=${i}">${i}</a>
				</c:forEach>
				<c:if test="${end3 < totalPages3 }">
					<a href="mypage?p3==${end3 +1}">[다음]</a>
				</c:if>
			</div>

		</c:if>
		<c:if test="${count2 == 0 }">
	<table class="table table-hover">
	<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					
				</tr>
		
		</table>
		<div style="text-align: center;"><strong style="text-align: center;">아직 입력한 글이 없습니다.</strong></div><hr>
</c:if>
</div>

		<div>
<div><h4 style="text-align: center;">같이키워요</h4></div>
<c:if test="${count3 != 0 }">
			<table class="table table-hover">
			<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					
				</tr>
				<c:forEach items="${P_list}" var="plist">
					<tr>
						<td><a href ="/petcare/content/${plist.pno}">${plist.pno}</a></td>
						<td><a href ="/petcare/content/${plist.pno}">${plist.ptitle}</a></td>
						<td><a href ="/petcare/content/${plist.pno}">${plist.memberid }</a></td>
						<td><a href ="/petcare/content/${plist.pno}"><fmt:formatDate value="${plist.pregdate }" dateStyle="short"/></a> </td>
						
					</tr>
				</c:forEach>
			</table>
			<div id="page" style="text-align: center;">
				<c:if test="${begin4 > pageNum4 }">
					<a href="mypage?p4=${begin4-1 }">[이전]</a>
				</c:if>
				<c:forEach begin="${begin4 }" end="${end4}" var="i">
					<a href="mypage?p4=${i}">${i}</a>
				</c:forEach>
				<c:if test="${end4 < totalPages4 }">
					<a href="mypage?p4=${end4 +1}">[다음]</a>
				</c:if>
			</div>

		</c:if>
		<c:if test="${count3 == 0 }">
	<table class="table table-hover">
	<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					
				</tr>
		
		</table>
		<div style="text-align: center;"><strong style="text-align: center;">아직 입력한 글이 없습니다.</strong></div><hr>
</c:if>
 	</div>


    </div>


    <div class="tab-pane" id="myComm">
     <div>
    <div><h4 style="text-align: center;">같이살아요</h4></div>
 	<c:if test="${commcount != 0 }">
 	
			<table class="table table-hover">
			<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr id="boardtr">
					<th id="boardth">댓글번호</th>
					<th id="boardth">댓글내용</th>
					<th id="boardth">작성일</th>
					<th id="boardth">본문보기</th>
					
				</tr>
				<c:forEach items="${rc}" var="rc">
					<tr>
						<td>${rc.rsno}</td>
						<td>${rc.rscontent}</td>
						<td>${rc.rsdate }</td>
						<td><button class="bt" onclick="location.href='/room/list/${rc.roomno}'">본문보기</button></td>
						
					</tr>
				</c:forEach>
			</table>
			<div id="page" style="text-align: center;">
				<c:if test="${begin5 > pageNum5 }">
					<a href="mypage?p5=${begin5 -1 }">[이전]</a>
				</c:if>
				<c:forEach begin="${begin5 }" end="${end5}" var="i">
					<a href="mypage?p5=${i}">${i}</a>
				</c:forEach>
				<c:if test="${end5 < totalPages5 }">
					<a href="mypage?p5=${end5 +1}">[다음]</a>
				</c:if>
			</div>

		</c:if></div>
		<c:if test="${commcount == 0 }">
	<table class="table table-hover">
	<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>댓글번호</th>
					<th>댓글내용</th>
					<th>작성일</th>
					<th>본문보기</th>
					
				</tr>
		
		</table>
		<div style="text-align: center;"><strong style="text-align: center;">아직 작성하신 댓글이 없습니다.</strong></div><hr>
</c:if>  
       
       <div><h4 style="text-align: center;">자유게시판</h4></div>
<c:if test="${commcount1 != 0 }">
			<table class="table table-hover">
			<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>댓글번호</th>
					<th>댓글내용</th>
					<th>작성일</th>
					<th>본문보기</th>
					
				</tr>
				<c:forEach items="${bc}" var="bc">
					<tr>
						<td>${bc.cno}</td>
						<td>${bc.ccontent}</td>
						<td><fmt:formatDate value="${bc.regdate }" pattern="yyyy-MM-dd"/></td>
						<td><button class="bt" onclick="location.href='content/${bc.no}'">본문보기</button></td>
						
					</tr>
				</c:forEach>
			</table>
			<div id="page" style="text-align: center;">
				<c:if test="${begin6 > pageNum6 }">
					<a href="mypage?p6=${begin6 -1 }">[이전]</a>
				</c:if>
				<c:forEach begin="${begin6 }" end="${end6}" var="i">
					<a href="mypage?p6=${i}">${i}</a>
				</c:forEach>
				<c:if test="${end6 < totalPages6 }">
					<a href="mypage?p6=${end6+1}">[다음]</a>
				</c:if>
			</div>

		</c:if>
		<c:if test="${commcount1 == 0 }">
		<table class="table table-hover">
		<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>댓글번호</th>
					<th>댓글내용</th>
					<th>작성일</th>
					<th>본문보기</th>
					
				</tr>
		
		</table>
		<div style="text-align: center;"><strong style="text-align: center;">아직 입력한 글이 없습니다.</strong></div><hr>
</c:if>

	<div><h4 style="text-align: center;">같이먹어요</h4></div>
		<c:if test="${commcount2 != 0 }">
			<table class="table table-hover">
			<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>댓글번호</th>
					<th>댓글내용</th>
					<th>작성일</th>
					<th>본문보기</th>
					
				</tr>
				<c:forEach items="${fc}" var="fc">
					<tr>
						<td>${fc.fscno}</td>
						<td>${fc.fsccontent}</td>
						<td>${fc.fsdate }</td>
						<td><button class="bt" onclick="location.href='content/${fc.fsno}'">본문보기</button></td>
						
					</tr>
				</c:forEach>
			</table>
			<div id="page" style="text-align: center;">
				<c:if test="${begin7 > pageNum7 }">
					<a href="mypage?p7=${begin7-1 }">[이전]</a>
				</c:if>
				<c:forEach begin="${begin7 }" end="${end7}" var="i">
					<a href="mypage?p7=${i}">${i}</a>
				</c:forEach>
				<c:if test="${end7 < totalPages7 }">
					<a href="mypage?p7=${end7 +1}">[다음]</a>
				</c:if>
			</div>

		</c:if>
		<c:if test="${commcount2 == 0 }">
		<table class="table table-hover">
		<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>댓글번호</th>
					<th>댓글내용</th>
					<th>작성일</th>
					<th>본문보기</th>
					
				</tr>
		
		</table>
		<div style="text-align: center;"><strong style="text-align: center;">아직 입력한 글이 없습니다.</strong></div><hr>
</c:if>

		<div><h4 style="text-align: center;">같이키워요</h4></div>
		<c:if test="${commcount3 != 0 }">
			<table class="table table-hover">
			<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>댓글번호</th>
					<th>댓글내용</th>
					<th>작성일</th>
					<th>본문보기</th>
					
				</tr>
				<c:forEach items="${pc}" var="pc">
					<tr>
						<td>${pc.pcno}</td>
						<td>${pc.pccontent}</td>
						<td>${pc.pcregdate }</td>
						<td><button class="bt" onclick="location.href='content/${pc.pno}'">본문보기</button></td>
					
					</tr>
				</c:forEach>
			</table>
			<div id="page" style="text-align: center;">
				<c:if test="${begin8 > pageNum8 }">
					<a href="mypage?p8=${begin8 -1 }">[이전]</a>
				</c:if>
				<c:forEach begin="${begin8 }" end="${end8}" var="i">
					<a href="mypage?p8=${i}">${i}</a>
				</c:forEach>
				<c:if test="${end8 < totalPages8 }">
					<a href="mypage?p8=${end8 +1}">[다음]</a>
				</c:if>
			</div>

		</c:if>
		<c:if test="${commcount3 == 0 }">
		<table class="table table-hover">
		<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			</colgroup>
				<tr>
					<th>댓글번호</th>
					<th>댓글내용</th>
					<th>작성일</th>
					<th>본문보기</th>
					
				</tr>
		
		</table>
		<div style="text-align: center;"><strong style="text-align: center;">아직 입력한 글이 없습니다.</strong></div><hr>
</c:if>
		


    </div>

   
</div>

<c:import url="/WEB-INF/views/include/bottom.jsp" />
</body>
<script>
$('a[data-toggle="tab"]').click(function (e) {
    e.preventDefault();
    $(this).tab('show');
});

$('a[data-toggle="tab"]').on("shown.bs.tab", function (e) {
    var id = $(e.target).attr("href");
    localStorage.setItem('selectedTab', id)
});

var selectedTab = localStorage.getItem('selectedTab');
if (selectedTab != null) {
    $('a[data-toggle="tab"][href="' + selectedTab + '"]').tab('show');
}
</script>
</html>