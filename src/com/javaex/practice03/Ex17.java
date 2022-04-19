package com.javaex.practice03;
import java.util.*;

public class Ex17 {

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
	}

}
