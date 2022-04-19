package com.javaex.practice03;

import java.util.*;

public class Ex20 {

	public static void main(String[] args) {
		int num;
		int random = (int) (Math.random() * 100) + 1;
		int n;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================================");
		System.out.println("           숫자맞추기게임 시작");
		System.out.println("=====================================");

		while (true) {
			System.out.print(">>");
			num = sc.nextInt();
			if (num == random) {
				System.out.println("정답입니다");
				break;
			} else if (num > random) {
				System.out.print("더 낮게");
			} else {
				System.out.print("더 높게");
			}

		}
		System.out.printf("게임을 종료하시겠습니까 (y/n)",y,n);//여기서부터
	}

}
