package com.likelion.besession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //엔티티 생성일, 수정일 자동 기록0
public class BeSessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeSessionApplication.class, args);
    }

}
