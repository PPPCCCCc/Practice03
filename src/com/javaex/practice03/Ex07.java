package com.javaex.practice03;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		int num;
		Scanner sc =new Scanner(System.in); {
			System.out.println("숫자를 입력하세요");
			num= sc.nextInt();
		}
		
		for(int i = 1; i <= num; i++) {
		    for(int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println("");
		}
	}
}
