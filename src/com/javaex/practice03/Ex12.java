package com.javaex.practice03;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		  System.out.print("숫자를 입력하세요 : ");
		   a = sc.nextInt();
		  
		  int b = a;
		  while(a>1)
		  {
		   a--;
		   b=b*a;
		  
		  }
		  System.out.print("결과값 : " + b);
		 }
		
	}
