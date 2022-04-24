<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Parcel Sandbox</title>
    <meta charset="UTF-8" />
<style type="text/css">
* {
  box-sizing: border-box;
}

html,
body {
  height: 100%;
}

body {
  display: flex;
  margin: 0;
  background-color: #f5f6f7;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
    Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
}

ul {
  list-style: none;
  padding: 0;
  margin: 0;
}

.wrap {
  margin: auto;
}

.wrap .logo {
  text-align: center;
  margin-bottom: 20px;
}

.wrap .logo h1 {
  margin: 0;
  font-size: 50px;
}

.wrap .contents {
  padding: 50px;
  background-color: #ffffff;
  border: 1px solid #dadada;
  border-radius: 5px;
  box-shadow: 0 4px 6px rgba(50, 50, 93, 0.11), 0 1px 3px rgba(0, 0, 0, 0.08);
}

#form__wrap {
  margin: 0 auto;
  width: 460px;
  font-size: 14px;
}

#form__wrap .terms__check__all {
  display: flex;
  margin-bottom: 35px;
}

#form__wrap .terms__check__all label {
  margin-left: 3px;
  text-decoration: underline;
}

.terms__list .terms__box {
  margin: 20px 0;
}

.contents label {
  font-weight: 700;
}

label.required::after {
  margin-left: 4px;
  font-size: 13px;
  font-weight: 400;
  line-height: 24px;
  color: #0086ff;
  content: "(필수)";
}

.terms__list .terms__content {
  height: 88px;
  overflow: auto;
  margin-top: 8px;
  padding: 12px;
  border: 1px solid #dadada;
  background: #fff;
  font-size: 12px;
}

.next-button {
  width: 100%;
  height: 40px;
  outline: none;
  cursor: pointer;
  background-color: #242222;
  color: #ffffff;
  border: none;
  border-radius: 5px;
  transition-duration: 0.2s;
}

.next-button:hover:enabled {
  background-color: #a3a2a2;
}

.next-button:disabled {
  opacity: 0.2;
  cursor: not-allowed;
}

@media (max-width: 768px) {
  .wrap {
    min-width: 280px;
    padding: 20px;
  }

  #form__wrap {
    max-width: 460px;
    width: auto;
  }
}
a:link { color: red; text-decoration: none;}
a:visited { color: black; text-decoration: none;}
a:hover { color: black; text-decoration: underline;}
</style>
  </head>

  <body>
    <div class="wrap">
      <div class="logo"><h1><a href="/">혼사모</a></h1></div>
      <div class="contents">
        <form action="insertform" method="get" id="form__wrap">
          <div class="terms__check__all">
            <input type="checkbox" name="checkAll" id="checkAll" />
            <label for="checkAll"
              >혼사모 이용약관, 개인정보 수집 및 이용, 위치정보 이용
              약관(선택)에<br />모두 동의합니다.</label
            >
          </div>
          <ul class="terms__list">
            <li class="terms__box">
              <div class="input__check">
                <input
                  type="checkbox"
                  name="agreement"
                  id="termsOfService"
                  value="termsOfService"
                  required
                />
                <label for="termsOfService" class="required"
                  >혼사모 이용약관 동의</label
                >
              </div>
              <div class="terms__content">
               여러분을 환영합니다. 혼사모 서비스를 이용해
                주셔서 감사합니다.
              </div>
            </li>
            <li class="terms__box">
              <div class="input__check">
                <input
                  type="checkbox"
                  name="agreement"
                  id="privacyPolicy"
                  value="privacyPolicy"
                  required
                />
                <label for="privacyPolicy" class="required"
                  >개인정보 수집 및 이용 동의</label
                >
              </div>
              <div class="terms__content">
                개인정보
              </div>
            </li>
            <li class="terms__box">
              <div class="input__check">
                <input
                  type="checkbox"
                  name="agreement"
                  id="allowPromotions"
                  value="allowPromotions"
                />
                <label for="allowPromotions">위치 정보이용 동의</label>
              </div>
              <div class="terms__content">
                위치정보
              </div>
            </li>
          </ul>
          <button type="submit" class="next-button" disabled>확인</button>
        </form>
      </div>
      <footer style="text-align: center; padding-top: 30px; ">
        <div class="copyright-wrap">
        <span> Copyright 2022. Team3 all rights reserved.<br>김남준 김동희 안찬우 엄혜선 홍해영 현지은</span>
        </div>
      </footer>
    </div>
  </body>
  <script src="./checkBox.js"></script>
</html>



