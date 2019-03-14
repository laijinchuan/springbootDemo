package hello.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class hello {
	public static void main(String[] args) {
		SpringApplication.run(hello.class, args);
	}

	@RequestMapping("/hello")
	public String hel() {
		return "你哈1";
	}
}
