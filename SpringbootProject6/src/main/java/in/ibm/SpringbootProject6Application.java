package in.ibm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.ibm.beans.Student;

@SpringBootApplication
//public class SpringbootProject6Application implements CommandLineRunner {   
public class SpringbootProject6Application  {
   

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject6Application.class, args);
	}


	
	
	
	// remove the code because it is main method 
	
	
//	@Override
//	public void run(String... args) throws Exception {
//		stdBean1().displayStdDetails();
//		System.out.println("-------------------------");
//		stdBean2().displayStdDetails();
//		System.out.println("-------------------------");
//		stdBean3().displayStdDetails();
//		System.out.println("-------------------------");
//		stdBean4().displayStdDetails();
//		
//	}
	
//	@Bean
//	public Student stdBean1() {
//		return new Student("Pooja", 1, 70.5f);
//	}
//
//	@Bean
//	public Student stdBean2() {
//		return new Student("Bulbul", 2, 89.90f);
//	}
//
//	@Bean
//	public Student stdBean3() {
//		return new Student("Vivek", 3, 90.24f);
//	}
//	@Bean
//	public Student stdBean4() {
//		return new Student("Rahul", 4, 85.53f);
//	}


}
