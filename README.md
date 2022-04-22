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

POST /lecture/{lectureId}/enrolment - 수강신청
GET /lecture/{lectureId}/content - 강의 컨텐츠 리스트 열람
POST /lecture/{lectureId}/evaulation - 별점 입력
POST /lecture/{userId}/enrolment - 수강신청 강의 조회

POST /lecture/{lectureId}/manage - 강사 매칭
POST /lecture/{lectureId} -강의 노출 상태 변경
GET /lecture/{lectureId}/{userId}/evaulation - 별점 열람

POST /lecture/{lectureId}/content - 컨텐츠 업로드
POST /content/{contentId} - 시험 컨텐츠 업로드
POST /lecture/{lectureId}/score - 성적 입력

PATCH /lecture/{lectureId} (강의 노출 상태 변경)
Community
GET /article - 게시글 조회
POST /article - 게시글 작성 
POST /article/{ardticleId}/comment - 댓글 작성
POST /article/{articleId} - 게시글 숨김처리
POST /comment/{commentId} - 댓글 숨김처리
