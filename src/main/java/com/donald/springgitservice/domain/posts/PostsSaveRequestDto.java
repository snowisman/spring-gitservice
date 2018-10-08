package com.donald.springgitservice.domain.posts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
// @RequestBody로 외부에서 데이터를 받는 경우엔 기본생성자 + set메소드를 통해서만 값이 할당
@Setter
@NoArgsConstructor
// Entity 클래스와 Controller에서 쓸 DTO는 분리해서 사용 -> Entity 클래스가 변경되면 여러 클래스에 영향을 끼치게 되는 반면 Request와 Response용 DTO는 View를 위한 클래스라 정말 자주 변경
public class PostsSaveRequestDto {

	private String title;
	private String content;
	private String author;

	public Posts toEntity(){
		return Posts.builder()
				.title(title)
				.content(content)
				.author(author)
				.build();
	}

}
