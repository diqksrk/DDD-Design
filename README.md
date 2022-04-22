# DDD-Design

## 1. 도메인 모델
<p align="center">
<img src="/img/universitySystemDDDdesign.JPG" style="float:left;" alt="img1">
<p/>

## 2. Entity
<p align="center">
<img src="/img/universitySystemErd.JPG" style="float:left;" alt="img1">
<p/>

## 3. MSA Architecture
<p align="center">
<img src="/img/msaDesign.JPG" style="float:left;" alt="img1">
<p/>

## 4. API
POST /user/join - 유저 생성 <br/>
POST /user/lecture/join - 강사회원 생성<br/>
POST /user/login - 로그인<br/>

POST /lecture/{lectureId}/enrolment - 수강신청<br/>
GET /lecture/{lectureId}/content - 강의 컨텐츠 리스트 열람<br/>
POST /lecture/{lectureId}/evaulation - 별점 입력<br/>
POST /lecture/{userId}/enrolment - 수강신청 강의 조회<br/>

POST /lecture/{lectureId}/manage - 강사 매칭<br/>
POST /lecture/{lectureId} -강의 노출 상태 변경<br/>
GET /lecture/{lectureId}/{userId}/evaulation - 별점 열람<br/>

POST /lecture/{lectureId}/content - 컨텐츠 업로드<br/>
POST /content/{contentId} - 시험 컨텐츠 업로드<br/>
POST /lecture/{lectureId}/score - 성적 입력<br/>

GET /article - 게시글 조회<br/>
POST /article - 게시글 작성 <br/>
POST /article/{ardticleId}/comment - 댓글 작성<br/>
POST /article/{articleId} - 게시글 숨김처리<br/>
POST /comment/{commentId} - 댓글 숨김처리<br/>
