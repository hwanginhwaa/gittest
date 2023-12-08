package com.tutorials.tests;

import com.tutorials.domain.User;

public class UserTest {
	
	public static void main(String[] args) {
		User usr1 = new User();

		usr1.setUserId("Lee");
		usr1.setPassword("1234");
		usr1.setUserName("웅이아빠");
		System.out.println("usr1: " + usr1);
		
		User usr2 = new User("lee","1234","이시웅");
		System.out.println("usr2: " + usr2);
	}
}
