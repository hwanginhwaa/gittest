package com.tutorials.tests;

import com.tutorials.domain.Member;

public class MemberTest {

	public static void main(String[] args) {
		Member mem1 = new Member();
		Member mem2 = new Member("lee","1234","이시웅");
		System.out.println("mem1: " + mem1);
		System.out.println("mem2: " + mem2);
	}

}
