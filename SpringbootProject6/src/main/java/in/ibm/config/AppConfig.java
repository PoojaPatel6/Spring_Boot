package in.ibm.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ibm.beans.Student;

@Configuration
public class AppConfig {
@Bean 
public CommandLineRunner cmdLineRunner() {
	return new CommandLineRunner() {

		@Override
		public void run(String... args) throws Exception {
		
			
			stdBean1().displayStdDetails();
			System.out.println("-------------------------");
			stdBean2().displayStdDetails();
			System.out.println("-------------------------");
			stdBean3().displayStdDetails();
			System.out.println("-------------------------");
			stdBean4().displayStdDetails();
			
		}
			
		
		
	};
}
	
	@Bean
	public Student stdBean1() {
		return new Student("Pooja", 1, 70.5f);
	}

	@Bean
	public Student stdBean2() {
		return new Student("Bulbul", 2, 89.90f);
	}

	@Bean
	public Student stdBean3() {
		return new Student("Vivek", 3, 90.24f);
	}
	@Bean
	public Student stdBean4() {
		return new Student("Rahul", 4, 85.53f);
	}
}
