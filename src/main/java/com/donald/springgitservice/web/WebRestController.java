package com.donald.springgitservice.web;

import com.donald.springgitservice.domain.posts.Posts;
import com.donald.springgitservice.domain.posts.PostsRepository;
import com.donald.springgitservice.domain.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@AllArgsConstructor
public class WebRestController {

	// 스프링 Bean 주입 방식 -> @Autowires, setter, 생성자
	// 생성자 주입 방식 권장 (= @AllArgsConstructor)
	private PostsRepository postsRepository;

	@GetMapping("/hello")
	public String hello() {
		System.out.println("STEP3");

		System.out.println("Git Kraken First donald to donald2");
		System.out.println("Git Kraken First donald to donald2 : Edit file");

		return "helloWorld";
	}

	@PostMapping("/posts")
	public void savePosts(@RequestBody PostsSaveRequestDto dto){
		postsRepository.save(dto.toEntity());
	}

}
/*
package com.donald.springgitservice.web;

		import com.donald.springgitservice.domain.posts.Posts;
		import com.donald.springgitservice.domain.posts.PostsRepository;
		import com.donald.springgitservice.domain.posts.PostsSaveRequestDto;
		import lombok.AllArgsConstructor;
		import lombok.Getter;
		import lombok.NoArgsConstructor;
		import lombok.Setter;
		import org.springframework.web.bind.annotation.*;

		import javax.servlet.http.HttpServletResponse;

@RestController
@AllArgsConstructor
@RequestMapping("user")
public class WebRestController {

	// 스프링 Bean 주입 방식 -> @Autowires, setter, 생성자
	// 생성자 주입 방식 권장 (= @AllArgsConstructor)
	private PostsRepository postsRepository;

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public HttpServletResponse hello(HttpServletResponse response) throws Exception{
		response.setStatus(500, "500 Error!!!");

		throw new Exception();

	}

	@PostMapping("/posts")
	public void savePosts(@RequestBody PostsSaveRequestDto dto){
		postsRepository.save(dto.toEntity());
	}

}*/
