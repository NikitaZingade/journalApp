package net.engineeringdigest.journalApp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;

@Disabled
@SpringBootTest
public class UserServiceTests {
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private UserService userService;
	
	@Disabled
	@ParameterizedTest
	@ArgumentsSource(UserArgumentsProvider.class)
	public void testSaveNewUser(User user ) { 
		//User user = userRepository.findByUserName("ram");
		assertTrue(userService.saveNewUser(user));
		//assertTrue(!user.getJournalEntries().isEmpty());
	}
	
	@Disabled
	@ParameterizedTest
	@ValueSource(strings={
		"ram",
		"shyam",
		"vipul"
	}) 	
	public void testAdd(String name) {
		assertEquals(4,2+2);
		assertNotNull(userRepository.findByUserName(name), "failed for: "+name);
//		User user = userRepository.findByUserName("ram");
//		assertTrue(!user.getJournalEntries().isEmpty());
	}
	
	@Disabled
	@ParameterizedTest
	@CsvSource({
		"1,1,2",
		"2,10,12",
		"3,3,9"
	})
	public void test(int a, int b, int expected) {
		assertEquals(expected, a+b);
	}
}
