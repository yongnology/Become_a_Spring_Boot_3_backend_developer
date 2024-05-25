package me.yongmin.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 엔티티로 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name="title", nullable = false) // 'title' 이라는 not null 컬럼과 매핑
    private String title;

    @Column(name="content", nullable = false)
    private String content;

    @Builder // 빌더 패턴으로 객체 생서
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }


    // 롬복의 애너테이션(@Getter)을 사용하면 코드를 반복해서 사용할 필요가 없다.

//    protected Article() {   // 기본 생성자
//
//    }
//    // GETTER
//    public Long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContent() {
//        return content;
//    }
}
