# 🏡Final Team Project _ 혼사모 

솔데스크 IT 아카데미 수료 팀 프로젝트 혼자사는 당신을 위한 모든것 '혼사모' 웹사이트 입니다. 



# 📋Description

* 개발 기간: 2022.03.01 ~ 2022.03.28 (약 4주)

* 참여 인원: Backend 6명

* 사용 기술

  Springboot, Apache Tomcat 9.0, Mybatis
  Java, Ajax, Jquery, Googledrive, MVC Pttern
  HTML, CSS, Gradle, Oracle 19g DataBase

* 개발 환경

  MAC OS,
  ECLIPSE,
  ORACLE CLOUD DATABASE

* 담당 구현 파트

  프로젝트 개발환경 구축, 설계 참여

  DB 모델링

  펫케어 페이지 구현 (리스트, 랭킹리스트, 글쓰기, 글수정, 댓글, 상세페이지, 페이징, 검색)

  오늘 뭐먹지? 페이지 구현 (리스트, 랭킹리스트, 별점등록, 별점평균, 댓글, 상세페이지, 페이징, 검색)
  
  
  # 📋 DB모델링
  
  <img width="910" alt="image" src="https://user-images.githubusercontent.com/95472522/165872377-bfe23f34-29a1-44a0-bf36-cd3a94ac6c35.png">
  
  총 23개의 테이블로 구성됨.
  
  각 테이블은 PK, FK를 활용하여 모델링하였으며, PK 와 FK 설정 테이블 간의 ON DELETE CASCADE 활성화
  
  
  # 📋 담당 파트 View
  
* 펫케어 페이지 - 메인 
  
   ![petcare_final](https://user-images.githubusercontent.com/95472522/165695053-507d41d9-40e4-4b9e-83b9-5aa8997549ff.gif)
  
  * BEST5 게시글  : 게시물 중 제일 높은 조회수의 5개의 게시물의 사진과 제목을 보여줌 (실시간 반영)
  
  * 게시판 : 검색 기능, 페이징 처리
  

* 펫케어 페이지 - 상세

  ![petcare_comment](https://user-images.githubusercontent.com/95472522/165870662-3d1a008d-d739-422c-9253-6ab33b3c199f.gif)
  
  * 글쓰기 폼에서 입력한 상세 내용 출력

  * 댓글 작성자만 댓글 수정, 삭제가 가능하게 처리


* 오늘 뭐먹지? - 메인

![foodreview_main](https://user-images.githubusercontent.com/95472522/165871727-a9be4ac8-864f-4d4f-9e8d-f89ca91f648a.gif)

  * 우리동네 BEST5 게시글  : 게시물 중 제일 높은 별점평균의 5개의 게시물의 사진과 제목을 보여줌 (실시간 반영)
  
  * 게시판 : 검색 기능, 페이징 처리


* 오늘 뭐먹지? - 상세페이지

![food_review](https://user-images.githubusercontent.com/95472522/165872109-2f684934-b496-4e5a-b911-b3f60f4090ac.gif)

  * 글쓰기 폼에서 입력한 상세 내용 출력

  * 댓글 작성자만 댓글 수정, 삭제가 가능하게 처리

  * 원하는 별점을 선택하여 리뷰할 수 있으며, 댓글 수정시에는 별점도 수정 가능함. => 리스트 상 평균별점에 실시간으로 반영됨.



  
  

