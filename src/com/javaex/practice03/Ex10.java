package com.javaex.practice03;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b;
		
		System.out.println("숫자를 입력하세요");
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			
			a = sc.nextInt();
			//수정
			
		}
		
		System.out.println("최대값은 " + a + "입니다.");
		sc.close();

	}

}