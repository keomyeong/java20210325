package p04.lecture;

import java.util.Scanner;

public class A05IfSa mpleScanner {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		String str = scanner.nextLine(); //string 입력 받는 것 중 하나
		
		System.out.println("출력>");
		System.out.println(str);
		
		System.out.println("수 입력>");
		int in = scanner.nextInt();
		
		System.out.println("수 출력>");
		System.out.println(in);
		
	}

}
