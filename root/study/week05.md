## Repository
- DB 한테 실제로 요청하는 코드
- JpaReository 상속
  
### JPA 매서드
| 코드           | 뜻         |
| -------------- | --------- |
| `save()`       | 저장        |
| `findById()`   | ID로 하나 찾기 |
| `findAll()`    | 전부 찾기     |
| `delete()`     | 삭제        |
| `deleteById()` | ID로 삭제    |
| `saveAll()`    | 여러 개 저장   |

JPA : java 객체를 이용해서 DB를 편하게 다루게 해주는 규칙
ORM : Java 객체 <-> DB 연결 기술
JPQL

## 게시글 생성 전체적인 흐름

1. 프론트에서 요청
{
  "title": "안녕",
  "content": "첫 글"
}

        ↓
2. Controller
"게시글 생성 요청이구나"

        ↓
3. CreatePostRequest DTO
데이터를 담아서 Service로 전달

        ↓
4. Service
Post Entity를 만들고

        ↓
5. Repository
postRepository.save(post)

        ↓
6. JPA
DB 저장 작업 처리

        ↓
7. Database
실제로 게시글 저장

        ↓
8. PostResponse DTO 생성

        ↓
9. Controller
JSON으로 사용자에게 응답


## 영속성 컨텍스트
이해못함 나중에 공부할랭

