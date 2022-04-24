<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>회원 정보 수정</title>
<style>
body{
    background-color: #f5f6f7;
}
select{
    width:85px;
    height:25px;
    outline: none;
    background: #f5f6f7;
    border: 1px solid #999;
}
a{
    color: black;
    text-decoration: none;
}
.main{
    text-align: center;
	margin-top: 20px;
}
input{
    cursor: pointer
}



/*회원가입 부분*/
.main-signup{
    text-align: center;
    width: 460px;
    margin: auto;
}
h3{
    margin:19px 0px 8px;
    text-align: left;
    font-size: 14px;
    font-family: Dotum,'돋움',Helvetica,sans-serif;
}
.signup-input{
    display:flex;
    /* margin: 0px 10px 8px 10px; */
    padding: 10px;
    border: solid 1px #dadada;
    background: #fff;
    cursor: pointer;
}
.signup-input-c{
    display:flex;
    /* margin: 0px 10px 8px 10px; */
    padding: 10px;
    border: solid 1px #dadada;
    background: #f5f6f7;
    cursor: pointer;
}
.signup-input-c input{
    background: #f5f6f7;
}
 #signup-pw, #signup-pww{
    height: 29px;
    border: none;
    outline:none;
    width:100%;
}
.signup-at{
    top: 50%;
    right: 13px;
    width: 90px;
    height: 24px;
    margin-top: 1px;
    
}
.pw-lock{
    /* content: ''; */
    /*display: inline-block;*/ 
    top: 50%;
    right: 13px;
    width: 70px;
    height: 24px;
    margin-top: 1px;
    
    background-size: 125px 75px;
    cursor: pointer;
}
.pww-lock{
    /* content: ''; */
    /* display: inline-block; */
    top: 50%;
    right: 13px;
    width: 70px;
    height: 24px;
    margin-top: 1px;
    
    background-size: 125px 75px;
    cursor: pointer;
}

.signup-input-birth{
    display: block;
    position: relative;
    width: 100%;
    height: 51px;
    border: solid 1px #dadada;
    padding: 10px;
    background: #fff;
    box-sizing: border-box;
}
#signup-birth-yy, #signup-birth-mm, #signup-birth-dd{
    width: 113px;
    height: 29px;
    border: none;
    outline:none;
}
#signup-name, #signup-gender, #signup-email, #signup-country, #signup-phone, #signup-cnum, #memberid, #address, #email, #ck_num{
    width:100%;
    height: 29px;
    border: none;
    outline:none;
}
#signup-gender{
    background-color: white;
}
#signup-country{
    background-color: white;
}
#signup-birth-mm{
    background-color: white;
}
/*본인 확인 이메일*/
.choice{
    display: flex;
}
.choice span{
    margin-top: 20px;
    color: rgb(150, 150, 150);
    font-size: 13px;
    font-family: Dotum,'돋움',Helvetica,sans-serif;
}
/*회원가입버튼박스*/
.signup-btn-wrap{
    height: 52px;
    line-height: 55px;
    margin: 10px 0px 50px 0px;
    border: solid 1px rgba(0,0,0,.1);
    background-color: black;
    color: #fff;
    cursor: pointer;
}
/*회원가입버튼*/
#signup-btn{
    width:100px;
    background-color: black;
    border: none;
    color:#fff;
    font-size: 18px;
    outline:none;
    cursor: pointer;
}
/*인증번호버튼박스*/
.cnum-btn-wrap{
    height: 52px;
    line-height: 55px;
    margin: 10px 0px 0px 10px;
    border: solid 1px rgba(0,0,0,.1);
    background-color: black;
    color: #fff;
    cursor: pointer;
}
/*인증번호버튼*/
#cnum-btn, #addresscheck, #mail_ck, #ck_b{
    width:115px;
    background-color: black;
    border: none;
    color:#fff;
    font-size: 15px;
    outline:none;
    cursor: pointer;
}
#id_check{
    width:115px;
    background-color: black;
    border: none;
    color:#fff;
    font-size: 15px;
    outline:none;
    cursor: pointer;
}
a:link { color: red; text-decoration: none;}
a:visited { color: black; text-decoration: none;}
a:hover { color: black; text-decoration: underline;}
</style>
<script>
function birth_keyup(obj){
	   let birth_len = obj.value.length;
	   if (event.keyCode==8){
	       obj.value = obj.value.slice(0,birth_len)
	       return 0;
	   }else if(birth_len==4 || birth_len==7){
	       obj.value += '-';
	   }
	}
</script>
</head>
<body>
<div class="main-signup">
        <!--웹페이지 상단-->
        <header>
            <!--LOGO-->
            <div class="logo">
                <h1><a href="/">혼사모</a></h1><br><h5>정보수정</h5>
            </div>
        </header>
		<form action="update" method="post" id="updateform" class="updateform">
        <!--회원가입 부분-->
        <section class="signup-wrap">

            <div>
                <!--아이디,비번,비번재확인-->

                <h3>아이디</h3>
                <div style="display: flex;">
                    <span class="signup-input" style="width:100%; margin: 10px 0px 0px 0px">
                        <input id="memberid" type="text" name="memberid" required placeholder="${user.memberid }" disabled></input>
                        <span class="signup-at" id="id_msg"></span>
                    </span>
                <span class="cnum-btn-wrap">
                        <input type="button" id="id_check" value="아이디확인" disabled>
                    </span>
                </div>

                <h3>비밀번호</h3>
                <span class="signup-input">
                    <input id="signup-pw" type="password" name="memberpw" value="${user.memberpw }" required></input>
                    <span class="pw-lock" id="message"></span>
                </span>

                <h3>비밀번호 재확인</h3>
                <span class="signup-input">
                    <input id="signup-pww" type="password" name="password1" value="${user.memberpw }"  required></input>
                    <span class="pww-lock" id="message1"></span>
                </span>

            </div>

            <div style="margin-top: 35px;">
                <!--이름,생년월일,성별,이메일-->
                <h3>이름</h3>
                <span class="signup-input">
                    <input id="signup-name" type="text" name="name" value="${user.name }" required></input>
                </span>

                <h3>생년월일</h3>
                <span class="signup-input">
                    <input id="signup-name" type="text" name="birthday" placeholder="ex 숫자만작성해주세요"  onkeyup="birth_keyup(this)" maxlength="10" value='<fmt:formatDate value="${user.birthday }" pattern="yyyy-MM-dd"/>' required></input>
                </span>

                <h3>전화번호</h3>
                <span class="signup-input">
                    <input id="signup-name" type="text" name="phone" oninput="autoHyphen(this)" maxlength="13" value="${user.phone }" required></input>
                </span>

                <h3>성별</h3>
                <span class="signup-input">
                    <select id="signup-gender" class="selectbox" name="gender" onchange="" required>
                        <option value="gender">성별</option>
                        <option value="남자">남자</option>
                        <option value="여자">여자</option>
                    </select>
                </span>

                <span class="choice">
                    <h3>본인 확인 이메일</h3>
                </span>
                <div style="display: flex;">
                    <span class="signup-input" style="width:100%; margin: 10px 0px 0px 0px">
                        <input id="email" type="email" name="email" value="${user.email } "disabled></input>
                    </span>
       
	
            </div>
				
            <div style="margin-top: 35px;">
                <!--주소-->
                <h3>주소</h3>
                
                <div style="display: flex;">
                    <span class="signup-input" style="width:100%; margin: 10px 0px 0px 0px">
                        <input id="address" type="text" name="address" placeholder="주소검색" value="${user.address }"  required></input>
                    </span>
                    <span class="cnum-btn-wrap">
                        <input type="button" id="addresscheck" name="addresscheck" value="주소찾기">
                    </span>
                </div>
                
                <span class="signup-input-c" style="margin-top: 10px;">
                    <input id="signup-cnum" type="text" name="address" placeholder="상세주소"></input>
                </span>
            </div>
            	<h3>반려동물</h3>
                <span class="signup-input">
                    <select id="signup-gender" class="selectbox" name="pet" onchange="" required>
                        <option value="pet">반려동물</option>
                        <option value="유"<c:if test="${user.pet eq '유'}">selected</c:if>>유</option>
                        <option value="무">무</option>
                    </select>
                </span>

            <div>
                <!--가입하기-->
                <div class="signup-btn-wrap">
                    <button type="submit" id="signup-btn">수정하기</button>
                </div>
            </div>
        </section>
</form>
        <!--저작권 정보-->
        <footer>
            <div class="copyright-wrap" style="font-size: 12px;">
                <span>Copyright 2022. Team3 all rights reserved.<br>김남준 김동희 안찬우 엄혜선 홍해영 현지은</span>
                
            </div>
        </footer>

    </div>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
function addPost(){
    new daum.Postcode({
        oncomplete: function(data) {
            	document.querySelector("#address").value = data.address;
            	alert("나머지 주소도 입력하세요.");
        }
    }).open();
}    



const autoHyphen = (target) => {
	 target.value = target.value
	   .replace(/[^0-9]/, '')
	   .replace(/^(\d{2,3})(\d{3,4})(\d{4})$/, `$1-$2-$3`);
	}
</script>
<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
	//주소 api
	$(function() {
		$("#addresscheck").click(function searchaddress() {
			new daum.Postcode({
				oncomplete : function(data) {
					document.querySelector("#address").value = data.address;
					alert("상세주소도 입력하세요.");
				}
			}).open();
		})

	})
</script>
<script>
	//패스워드 일치 검사.
	$(function() {
		$("#signup-pww").on('blur', function() { //password1탭에 키보드를 치면 function 수행
			if ($('#signup-pw').val() == $('#signup-pww').val()) {//password값과 password1의 값이 같다면,
				$("#message").html('일치').css('color', 'black');  
				$("#message1").html('일치').css('color', 'black'); //일치한다고 나타내기.
			} else {
				$("#message").html('불일치').css('color', 'red'); 
				$("#message1").html('불일치').css('color', 'red'); //그 외의 경우에는 일치하지 않는다고 하며 false값 리턴. 
				return false;
			}
		})//on

	}) //ready

</script>
<script>
const autoHyphen = (target) => {//전화번호 입력시 자동 - 
	 target.value = target.value
	   .replace(/[^0-9]/, '')
	   .replace(/^(\d{2,3})(\d{3,4})(\d{4})$/, `$1-$2-$3`);
	}
</script>
</body>
</html>