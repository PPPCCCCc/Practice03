package com.javaex.practice03;
import java.util.Scanner;
public class Ex15 {
	public static void main(String args[]) {
	
	  int a;	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("숫자를 입력하ㅓ세요 : ");
	  a = sc.nextInt();
	  
	  for(int i= 1 ; i<=a ; i++)
	  {
	   if(a%i==0)
	    System.out.println(i);
	  }
	 }
	
}


