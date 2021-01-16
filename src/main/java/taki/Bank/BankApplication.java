package taki.Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BankApplication {

	@RestController
	public class homeController{
		@RequestMapping("/")
		public String home(){
			return "home";
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}
