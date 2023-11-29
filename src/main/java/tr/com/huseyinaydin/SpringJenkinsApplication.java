package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot Jenkins Pipeline.
 *
 */

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {


	@GetMapping("/selamlar")
	public String selam() {
		return "Spring Boot uygulaman deploy edildi! Nassın i misin? İ sin i sin!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}
}