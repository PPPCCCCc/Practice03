package com.javaex.practice03;
import java.util.*;

public class Ex18 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		a = sc.nextInt();
		
		for(int i= a-1; i>=0; i--){        
			for(int j=0; j<=i;j++){
			System.out.print("*");
		}
		System.out.println("");
		}
		
		for(int i=1; i<=a; i++){        
			for(int j=1; j<=i; j++){
			System.out.print("*");
		}
		System.out.println("");
		}
	}

}
