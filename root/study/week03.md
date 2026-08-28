# 3주차 내용 정리

## REST
자원을 URI로 표현하고 HTTP Method로 자원을 조작하는 설계 방식

ex) GET /posts/1

## RESTful API
REST의 설계 규칙을 잘 지켜서 설계된 API

1. URI에는 동사 X → 명사 사용
2. 복수형 사용
3. 소문자 사용
4. 마지막 `/` 사용 X

## CRUD <-> HTTP Method

| CRUD   | 의미      | HTTP Method |
| ------ | --------- | ----------- |
| Create | 생성      | `POST`      |
| Read   | 조회      | `GET`       |
| Update | 부분 수정 | `PATCH`     |
| Update | 전체 수정 | `PUT`       |
| Delete | 삭제      | `DELETE`    |
+ soft delete : 논리적 삭제( DB에서 데이터를 직접 삭제 X -> 사용자 입장에서 접근할 수 없게 하는거임 boolean 값) 
+ hard delete : 물리적 삭제( DB까지 완전히 삭제)

### 멱등성
같은 요청을 여러 번 보내도 결과가 동일한 성질

- PUT → 멱등성을 가짐
- PATCH → 요청 방식에 따라 멱등성이 보장되지 않을 수 있음

## REST와 CRUD
REST는 URI와 HTTP Method를 통해 CRUD를 수행하는 설계 방식

## Path Variable과 Query Parameter

`/posts/{postId}`
→ 특정 자원을 식별
→ Path Variable

`/posts?page=1`
→ 검색, 필터, 페이지네이션 등의 조건 전달
→ Query Parameter

## Bean
Spring Container가 생성하고 관리하는 객체

## DI (의존성 주입)
Spring이 관리하는 Bean을 필요한 곳에 주입하는 방식

## Lombok Annotation
@Getter : 필드 값 조회할 때 사용 ( getter 메서드 자동 생성 )
@Setter : 필드 값 수정할 때 사용 ( setter 메서드 자동 생성 )
@Bilder : 객체 생성 시 값을 하나씩 설정할 수 있는 방식
  + @AllAragesConstructor 이랑 함께 사용되어 객체 생성에 활용 ( 모든 필드를 매개변수로 받는 생성자 자동 생성 )



## API 명세서 노션 주소
https://paint-swordtail-a3c.notion.site/API-bd2a4bd5fa7082c4a9d50168f5563d78?source=copy_link
