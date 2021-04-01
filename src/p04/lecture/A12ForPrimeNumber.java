package p04.lecture;

import java.util.Scanner;

public class A12ForPrimeNumber {
	public static void main(String[] args) {
		// 소수 prime number 약수가 1과 자기자신
		// 23571113 .... 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수 입력>");
		int number = scanner.nextInt();
		
		System.out.println("입력한 수 :" + number);
		
		for(int i = 2; i<number; i++) {
			if((number%i) == 0) {
				System.out.println("소수가 아닙니다.");
				scanner.close();
				return;
			}
		}System.out.println("소수입니다.");
	}
}
