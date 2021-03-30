package p04.lecture;

import java.util.Scanner;

public class A07IfSampleWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("주사위 수를 맞춰라");

		while (true) {
			int dice = (int) (Math.random() * 6) + 1;
			int user = scanner.nextInt();

			if (user == dice) {
				System.out.println("맞췄습니다.");
				break;
			} else {
				System.out.println("다시 시도해보세요");
				System.out.println("주사위 수는" + dice + "입니다");
			}
		}
	}
}
