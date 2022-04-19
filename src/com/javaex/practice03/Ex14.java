package com.javaex.practice03;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		int a;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		a = sc.nextInt();
		
		while(a>0) {
			sum=sum+a;
		}a++;
		System.out.println("합계 : " + sum);
	}

}
