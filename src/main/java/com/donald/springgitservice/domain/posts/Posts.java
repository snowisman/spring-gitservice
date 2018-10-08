package com.donald.springgitservice.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// Lombok, 기본 생성자 자동 추가, protected Posts() {}
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
// JPA 테이블 매핑
@Entity
public class Posts extends BaseTimeEntity {

	@Id
	@GeneratedValue
	// SpringBoot 2.0 -> auto increment 문제, Hibernate 5.0 이전 / 이후 버전 차이
	// 해결책
	// 1. @GeneratedValue(strategy = GenerationType.IDENTITY)
	// 2. application 설정 변경 -> hibernate: use-new-id-generator-mappings: false 설정
	private Long id;

	@Column(length = 500, nullable = false)
	private String title;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String content;

	private String author;

	@Builder
	public Posts(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Posts{" +
				"id=" + id +
				", title='" + title + '\'' +
				", content='" + content + '\'' +
				", author='" + author + '\'' +
				'}';
	}
}
