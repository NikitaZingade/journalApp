package net.engineeringdigest.journalApp.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.engineeringdigest.journalApp.repository.UserRepositoryImpl;

@SpringBootTest
public class UserRepositoryImplTests {

		 @Autowired
		 private UserRepositoryImpl userRepository;
		 
		 @Test
		 public void testSaveNewUser() {			 		 
			 userRepository.getUserForSA();
		 }
}
