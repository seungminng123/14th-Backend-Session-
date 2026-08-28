JPA : Java 객체와 DB 사이에서 통역해주는 역할

Lombok : 반복되는 Java 코드를 자동으로 만들어주는 라이브러리

## Lombok 의존성 추가 ( 직접 작성해주기!)
why? Lombok은 컴파일 시점에만 필요, 어노테이션을 분석해 실제 코드를 생성하도록함
compileOnly 'org.projectlombok:lombok'
annotationProcessor 'org.projectlombok:lombok'

## BestTimeEntity
공통 필드 중복 문제 해결법 -> 공통 필드를 상속 구조로 관리
@MappedSuperclass : 해당 클래스를 테이블 생성 X 상복받은 자식 엔티티에 필드 포함

