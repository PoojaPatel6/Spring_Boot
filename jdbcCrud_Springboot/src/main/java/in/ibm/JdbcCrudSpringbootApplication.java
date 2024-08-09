package in.ibm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import in.ibm.dao.UserDao;
import in.ibm.entity.User;

@SpringBootApplication
public class JdbcCrudSpringbootApplication implements CommandLineRunner {

	
	@Autowired
	private UserDao userDao;
	
	public static void main(String[] args) {
		
		SpringApplication.run(JdbcCrudSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
// ------------Insert data--------------------------

//	User user1 = new User("Pooja","pooja@gmail.com","female", "varanasi");
//	User user2 = new User("Anjali","anjali@gmail.com","female", "Delhi");
//	User user3 = new User("Divesh","divesh@gmail.com","Male", "Bangalore");
//	User user4 = new User("Amit","amit@gmail.com","male", "Mumbai");
//	
	
//	boolean status = userDao.insertUser(user1);
//	boolean status = userDao.insertUser(user2);
//	boolean status = userDao.insertUser(user3);
//	boolean status = userDao.insertUser(user4);
//	
//	if(status) {
//		System.out.println("User Inserted Successfully");
//	}
//	else {
//		System.out.println("User Not Inserted");	
//	}
	
		
		
		
		// ------------------update-1---------------
		
//		User user = new User("Pooja", "pooja@gmail.com","female","Patna");
//		boolean status = userDao.updateUser(user);
//
//	
//	if(status) {
//		
//		System.out.println("updated successfully");
//	}else {
//		
//		System.out.println("not updated");
//	}
		
		
		
		
		// ------------------update-2---------------
		
		User user = userDao.getUserByEmail("amit@gmail.com");
		user.setCity("varanasi");
		boolean status = userDao.updateUser(user);

	
	if(status) {
		
		System.out.println("updated successfully");
	}else {
		
		System.out.println("not updated");
	}
		
		
		
		
		
		//--------------Delete-------------------
//		boolean status = userDao.deleteUserByEmail("pooja@gmail.com");
//		if(status) {
//			System.out.println("success to delete");
//		}
//		else {
//			
//			System.out.println("failed to delete");
//		}
//		
		
		
		
	//  select
		
		
		
//		User user = userDao.getUserByEmail("amit@gmail.com");
//		System.out.println("Name :"  +user.getName());
//		System.out.println("Email : "  +user.getEmail());
//		System.out.println("Gender : "  +user.getGender());
//		System.out.println("City :"  +user.getCity());
		
	// Select all user
		
//	List<User> list = userDao.getAllUser();
//    for(User user : list) {
//	
//    	System.out.println("Name :"  +user.getName());
//		System.out.println("Email : "  +user.getEmail());
//		System.out.println("Gender : "  +user.getGender());
//		System.out.println("City :"  +user.getCity());
//	
//}
}
}