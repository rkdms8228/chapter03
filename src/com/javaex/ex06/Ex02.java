package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//System.out.println(a.concat(b));
		//System.out.println(a+b);
		
		//여러가지 메소드
		
		a = a.concat(b);
		System.out.println(a);
		
		System.out.println("\n====================\n");
		
		a = a.trim(); //여백 제거
		System.out.println("__"+a+"__"); //여백 제거되었는지 출력으로 확인
		
		System.out.println("\n====================\n");
		
		a = a.replace("ab", "12"); //ab를 12로 바꾸는 작업
		System.out.println(a);
		
		System.out.println("\n====================\n");
		
		String[] sArray = a.split(","); //,(쉼표)를 기점으로 절단
		
		for(int i = 0; i<sArray.length; i++) { //절단된 값 확인 작업 + 얼마나 절단되어 값이 나뉘어졌는지 알 수 없음으로 for문에 i로 출력하여 확인
			System.out.println(sArray[i]);
		}
		
		//System.out.println(sArray[0]);
		//System.out.println(sArray[1]);
		
		System.out.println("\n====================\n");
		
		String str = "Hello java!";
		String result01 = str.substring(3); //String칸은 0부터 시작|3칸 자름
		System.out.println(result01);
		
		String result02 = str.substring(1, 3); //1부터 3전까지의 값 출력
		System.out.println(result02);
		
		char result03 = str.charAt(8); //방 번호
		System.out.println(result03);  //방 번호에 있는 값 출력

	}

}
