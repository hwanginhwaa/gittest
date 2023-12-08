package com.tutorials;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tutorials.domain.User;

@SpringBootTest
public class UserUnitTest {

		@Test
		public void testSetter() {
			User usr = new User();

			usr.setUserId("Lee");
			usr.setPassword("1234");
			usr.setUserName("웅이아빠");
			System.out.println(usr.getUserId());
			System.out.println(usr.getPassword());
			System.out.println(usr.getUserName());
		}
		
		@Test
		public void testContructor() {
			User usr = new User("lee","1234","이시웅");
			System.out.println("usr: " + usr);
		}
		
}
