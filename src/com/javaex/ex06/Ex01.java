package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		//new는 새로 생성
		String s01 = new String("안녕하세요.");
		String s02 = new String("안녕하세요.");
		
		System.out.println(s01.toString());
		System.out.println(s02.toString());
		
		System.out.println(s01 == s02);
		
		System.out.println("\n====================\n");
		
		//바로 대입하는 형태 | 메모리에서 비교하고 동일하면 새로 만들지 않음.
		String s03 = "Hi";
		String s04 = "Hi";
		
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		System.out.println(s03 == s04);
		
		System.out.println("\n====================\n");
		
		s03 = "Hi Hi";
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		System.out.println(s03 == s04);

	}

}
