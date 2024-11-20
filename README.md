# DevHelper

# 📄프로젝트 소개<br>
신입 개발자를 꿈꾸는 학생들에게 도움이 되는 정보와 시스템을 한번에 편리하게 제공해주기 위해 깃, 채용공고, 자기소개서 작성, 커뮤니티를 이용한 질의문답 등의 서비스를 만들고 싶었습니다.

# 🧷프로젝트 특징 <br>
만든 부분 : 만든 이유로 작성해주시면 좋을것 같습니다.<br>
ex)
#### 깃 API  
기존의 CLI위주의 형상관리시스템을 학생들에게 클릭이나 드래그 앤 드롭으로 쉽게 관리할 수 있도록 기능 제공<br>
#### AI 자기소개서 
글쓰기에 자신이 없거나 이력서를 작성해보지 못한 학생들에게 oepnAI를 활용하여 임시 자기소개서를 제공하여 편의성 있게 이력서를 작성하도록 도움을 주기 위해 구현<br>




# 🗓️ 개발기간 <br>
24.09.23 ~ 09.26 : 화면 설계 회의 및 보고서 작성 <br>
24.09.27 ~ 09.30 : 데이터 설계 회의 및 보고서 작성 <br>
24.10.01 ~ 10.03 : 최종보고서, DB스크립트 파일 작성 <br>
24.10.04 ~ 10.22 : 프로젝트 구현 및 디버깅 <br>
24.10.22 ~ 10.24 : 베타테스트 진행 및 오류수정 <br>
24.10.24 ~ 10.24 : 최종 발표자료 준비 및 발표 <br><br>

# 😎 팀원 및 역할 <br>
### 유현동 (Leader) (https://github.com/ehd8216)<br>
- oAuth API를 이용한 깃허브 연동 로그인 <br>
- org.kohsuke.github 라이브러리를 이용<br>
- git commit리스트 불러오기, branch별 commit리스트 불러오기 <br>
- branch 리스트 불러오기 <br>
- repository 불러오기, 생성하기 <br>
### 정택은 (https://github.com/tak511)<br>
- oAuth API를 이용한 깃허브 연동 로그인 <br>
- GHRepository메소드를 이용한 깃허브 이슈 조회,삭제,생성<br>
- 공고문 스크랩,최근본 공고문조회 <br>
- 친구신청, 친구 조회 <br>
### 최규호 (https://github.com/cgh7373)<br>
- 게시판 CRUD <br>
- 뉴스 API를 통한 실시간 뉴스목록 조회 <br>
- disqus API를 통해 댓글기능 구현 <br>
- codeforce API를 통한 코딩테스트, Contest 참여, 순위 조회 <br>
- edidor API와 웹소켓의 결합을 통한 실시간 토론 페이지 구현 <br>
### 최승균 (https://github.com/0724choi)<br>
- 공공데이터 API를 통한 기획재정부_공공기관 채용정보목록 조회서비스 제공 <br>
- 공공데이터 API를 통한 기획재정부_공공기관 채용정보 상세조회서비스 제공 <br>
- 취업지원 CRUD <br>
- openAI API를 통한 AI자기소개서 구현 <br>
- 이력서 CRUD <br><br>

# 📚 사용 기술 <br>
- OS : Windows11 <br>
- language : JAVA11 , JavaScript <br>
- Back-End : Spring framework/ JSP & Servlet / mybatis <br>
- Front-End : JavaScript / jQuery / AJAX / JSON <br>
- Developer Tools : Eclipse / VS Code / SqlDeveloper <br>
- Server : Apache Tomcat 9.0 / Apache maven <br>
- DBMS : Oracle <br>
- SCM : Git, GitHub, Sourcetree <br><br>


# 🧾 설계 내역 <br>
<details>
  <summary>UseCase Diagram</summary>
  <pre>
    
  ![image](https://github.com/user-attachments/assets/fbf9750d-bc7a-4822-8553-b84244fe2159)
  </pre>
</details>

<details>
  <summary>ERDCLoud</summary>
  <pre>
    
  ![image](https://github.com/user-attachments/assets/5d3a658b-09c3-41ec-a694-26f83c5eb96e)
  </pre>
</details>




# 🎨 프로젝트 구현 <br>

<details>
  <summary>유현동</summary>
  <pre>
    
  ![레파지토리 조회](https://github.com/user-attachments/assets/251e41f1-36a2-4e8f-8174-c27f49b07045)
  레파지토리 조회
  <br><br>
  ![레포 생성](https://github.com/user-attachments/assets/ff540cf6-7ed2-4edc-941a-70482e571547)
  레파지토리 생성
  <br><br>
  ![레파지토리 초대](https://github.com/user-attachments/assets/233e90ba-8af0-4475-9b9d-d99d39759ac9)
  레파지토리 유저 초대
  <br><br>
  ![레포 불러오기](https://github.com/user-attachments/assets/a398a472-df4c-4d29-a3a8-1ca02f27c505)
  레포 불러오기
  <br><br>
  ![브랜치 리스트](https://github.com/user-attachments/assets/2de6e7b1-0388-420a-bb4c-3f646692b734)
  브랜치 리스트
  <br><br>
  ![브랜치 삭제](https://github.com/user-attachments/assets/7599a7bb-e9fd-4771-973a-34c7d2c15273)
  브랜치 삭제 및 생성
  <br><br>
  ![커밋 리스트](https://github.com/user-attachments/assets/11637620-89d6-443a-821d-1fa2f0258e00)
  커밋 리스트 (브랜치별)
  <br><br>
  </pre>
</details>

<details>
  <summary>정택은</summary>
  <pre>
    
  ![깃허브 연동로그인](https://github.com/user-attachments/assets/b99b6837-700f-4c1c-a06c-677103f54ab0)
  oAuthAPI활용한 깃허브 연동 로그인
  ![이슈리스트 조회,상세보기](https://github.com/user-attachments/assets/b6ec4f31-738c-4015-af2d-12babfa4bf62)
  깃허브 제공 메소드를 활용한 이슈리스트 조회,상세보기
  ![이슈 작성하기](https://github.com/user-attachments/assets/98a4ee52-f8a4-4fc5-970e-8a62e5695b01)
  깃허브 제공 메소드를 활용한 이슈작성하기
  ![공고문 스크랩하기](https://github.com/user-attachments/assets/aba3f29d-d20a-4673-b1ad-69d249729b55)
  공고문 스크랩기능
  ![스크랩 공고문 조회](https://github.com/user-attachments/assets/f0bad47b-abcb-4cd3-b8e4-0a403b3377bc)
  스크랩한 공고문 조회기능
  ![최근본 게시글 조회](https://github.com/user-attachments/assets/e9b25d00-0a52-486e-ad30-072343b48df6)
  최근본게시글 조회기능
  ![친구신청](https://github.com/user-attachments/assets/511f2c80-2795-4960-b78e-c9015710796d)
  친구신청기능
  ![친구조회](https://github.com/user-attachments/assets/27ea2733-4d53-4eda-a637-88bfe97030ac)
  친구조회기능
  </pre>
</details>

<details>
  <summary>최규호</summary>
  <pre>

  ![게](https://github.com/user-attachments/assets/2e50fc09-6c87-4883-955d-21402bd2d44a)
  게시판 CRUD

  ![뉴](https://github.com/user-attachments/assets/f51c9d09-dcf3-44e9-a3c1-8d141666622e)
  뉴스 API를 통한 실시간 뉴스목록 조회
    
  ![댓](https://github.com/user-attachments/assets/bd982a26-ee04-4fe4-b217-b0a9b2ad1adc)
  disqus API를 통해 댓글기능 구현

  ![코](https://github.com/user-attachments/assets/c7478378-7b91-411a-94f9-04761b903cd5)
  codeforce API를 통한 코딩테스트, Contest 참여, 순위 조회
    
 ![포](https://github.com/user-attachments/assets/3b97ce1c-3e67-41ad-8d36-a22773d16f0b)
  edidor API와 웹소켓의 결합을 통한 실시간 토론 페이지 구현


  </pre>
</details>
최승균<br>

  ![채용공고리스트](https://github.com/user-attachments/assets/9c351a69-d7a0-4fd6-a94f-377a4fb59973)
  공공데이터 채용 API 활용 채용정보 리스트 조회 기능(사람인API 대체)
  <br><br>
  ![검색기능](https://github.com/user-attachments/assets/fc3755ac-9a38-4c3c-b7b0-2de7b9578e70)
  공공데이터 채용 API 활용 채용정보 리스트 검색 기능 
  <br><br>
  ![상세조회](https://github.com/user-attachments/assets/7c718380-be72-4719-8516-6476dfb330ad)
  공공데이터 채용 API 활용 채용정보 상세 조회 기능
  <br><br>
  ![자기소개서ai](https://github.com/user-attachments/assets/91d03af6-65a1-45c5-8ee0-151c0251690a)
  openAI API활용 간단자기소개서 (예시제공)
  <br><br>
  ![세션영역에임시저장](https://github.com/user-attachments/assets/ae9d63b3-5fd2-428d-bc3a-bbc6b5d6af1d)
  임시저장 기능 (세션 저장소 활용)
</details>

