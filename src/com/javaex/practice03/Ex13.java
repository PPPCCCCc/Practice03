package com.javaex.practice03;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		int a;
		int b=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		a =sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			b=b+i;
		}
		System.out.println("결과값 : " + b);
	}

}
