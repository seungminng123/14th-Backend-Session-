# 2주차 과제
# API
서로 다른 프로그램이 데이터를 주고받기 위한 인터페이스

## 기본 포트 번호
- Spring Boot: 8080
- MySQL : 3306
- 
## HTTP Method
GET, POST, PUT(데이터 전체 수정), PATCH(부분 수정), DELETE

---

# Gradle
Java/Spring 프로젝트의 **빌드 및 의존성을 관리하는 도구**

## 주요 명령어
- 프로젝트 빌드
  ./gradlew build

---

# MySQL
DB

## Spring Boot & MySQL 파일 구성
- build.gradle : spring boot 프로젝트에서 사용할 라이브러리랑 의존성 관리하는 파일
- application.yml : MySQL 서버에 접속하기 위한 DB 연결 정보(비번이나, 주소, 사용자 이름 이런거)
- BesaaionApplication.java : 실행 시작점
- Student.java : student 테이블이랑 연결되는 엔티티 클래스
- StudentRepository.java : 데이터 조회 레포 
  (DB 접근 역할,findAll(), findById(), save(), deleteById() 같은 메서드로 데이터를 조회/저장/삭제함)
- StudentController.java : HTTP 요청 받아 데이터 반환

### Controller -> Repository -> JPA -> MySQL

<img width="336" height="685" alt="image" src="https://github.com/user-attachments/assets/876686b4-d8db-4da3-a1d2-2bf71b869874" />

---

### 2주차 과제 제출
<img width="713" height="776" alt="image" src="https://github.com/user-attachments/assets/9d399596-1004-4ead-9e54-8012fed7c985" />
