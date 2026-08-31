package com.likelion.besession.domain.post.entity;

import com.likelion.besession.domain.post.dto.request.UpdatePostRequest;
import com.likelion.besession.global.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 자동으로 숫자 증가 시켜 기본키 생성
    private  Long id;

    @Column(nullable = false)
    private  String title;

    @Column(nullable = false)
    private  String content;

    //게시글 조회 칼람 추가
    @Column(nullable = false)
    private long viewCount;
    //Long 안쓴 이요 : Null++ 되면 오류 날 수 있음.
    // long 은 기본값이 자동으로 0임.

    public void updatePost(UpdatePostRequest request) {
    }
    // 게시글 조회 시 1증가
    public void increaseViewCount(){
        this.viewCount++;
    }
}
