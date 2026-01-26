package net.engineeringdigest.journalApp.service;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import net.engineeringdigest.journalApp.entity.User;


public class UserArgumentsProvider implements ArgumentsProvider{

	@Override 
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		return Stream.of( 
				Arguments.of(User.builder().userName("shyam").password("shyam").build()), 
				Arguments.of(User.builder().userName("vipul").password("").build())); 
		/*User u1 = new User();
		u1.setUserName("aaa");
		u1.setPassword("aaa");

		User u2 = new User();
		u2.setUserName("bbb");
		u2.setPassword("");

		return Stream.of(
		    Arguments.of(u1),
		    Arguments.of(u2)
		);*/

    }

}
