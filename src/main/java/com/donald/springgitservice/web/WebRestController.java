package com.donald.springgitservice.web;

import com.donald.springgitservice.domain.posts.Posts;
import com.donald.springgitservice.domain.posts.PostsRepository;
import com.donald.springgitservice.domain.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

	// 스프링 Bean 주입 방식 -> @Autowires, setter, 생성자
	// 생성자 주입 방식 권장 (= @AllArgsConstructor)
	private PostsRepository postsRepository;

	@GetMapping("/hello")
	public String hello() {
		return "helloWorld";
	}

	@PostMapping("/posts")
	public void savePosts(@RequestBody PostsSaveRequestDto dto){
		postsRepository.save(dto.toEntity());
	}

}
