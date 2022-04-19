package com.javaex.practice03;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		int a;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		a = sc.nextInt();
		
		if(a%2==0) { 
			for (int i=2; i<=a; i=i+2) {
				sum+=i;
				}
			System.out.println("결과값: "+sum);
			}else {
			for (int i=1; i<=a; i=i+2) {
				sum+=i;
				}
			System.out.println("결과값: "+sum);
			}
		
		sc.close();
		
	}

}