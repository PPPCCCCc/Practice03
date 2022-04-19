package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		int num; // 선택
		int deposit = 0; // 예금액
		Scanner sc = new Scanner(System.in);
		boolean a = true;

		while (a) {
			System.out.println("--------------------------");
			System.out.println("1.예금| 2.출금| 3.잔고| 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("예금액>");
				deposit += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				deposit -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + deposit);
				deposit = sc.nextInt();
				break;
			case 4:
				a = false;
				break;
				default:
					System.out.println("알 수 없는 입력입니다.");
			}
		}
		System.out.println("프로그램 종료");
	}

}
