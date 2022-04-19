package com.javaex.practice03;
import java.util.*;
public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int a,b = 0;
        int c = 0;
        int sum = 0;
        int d;
        
        System.out.print("숫자를 입력하세요 : ");
        d = sc.nextInt();
        
        for (int i = 1; i<d+1; i++){
            a = i / 5;
            b = i - (a*5);
            if (b==0){
                c++;
                sum = sum + i;
            }
        }
        System.out.println("5의 배수의 개수 : " + c);
        System.out.println("5의 배수의 합 : " + sum);
        
    }
	}

