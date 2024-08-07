package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProject1Application {

	public static void main(String[] args) {
		
		System .out.println("Application Started");
		SpringApplication.run(SpringbootProject1Application.class, args);
		
		System .out.println("Application Finished");
	}

}
