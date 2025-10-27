package ucu.edu.ua.com.proj_6;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Proj6Application {

	public static void main(String[] args) {
		SpringApplication.run(Proj6Application.class, args);
	}


	@GetMapping("/list")
	// @RequestMapping{method = RequestMethod.GET, path = "/List"}  треба один з
	public List<String> getRandomUUIDs(){
		UUID.randomUUID();
		return Stream.generate(() -> UUID.randomUUID())
				.map(UUID::toString)
				.limit(10)
				.toList();
	}

}
