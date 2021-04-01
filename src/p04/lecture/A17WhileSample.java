package p04.lecture;

import java.util.Scanner;

public class A17WhileSample {
	public static void main(String[] args) {
		int com = (int)(Math.random()*100)+1;
		System.out.println("com:" + com);
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("컴퓨터의 수를 맞춰보세요>");
			int userNumber = scanner.nextInt();
			
			if(userNumber == com) {
			System.out.println("맞춰습니다.");
			break;
			}else if(userNumber < com) {
			System.out.println("큰 수를 입력해보세요.");
			}else {
				System.out.println("작은 수를 입력해보세요");	
			}
		}
		scanner.close();
		System.out.println("프로그램 종료.");
	}
}
