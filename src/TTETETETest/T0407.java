package TTETETETest;

import java.util.Scanner;

public class T0407 {
	public static void main(String[] args) throws Exception {
		boolean run = true;

		int balance = 0;
		
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		int keyCode = 0;
		
		while (run) {
			if(keyCode!=13 && keyCode!=10) {
			System.out.println("--------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("--------------------");
			System.out.println("선택> ");
			}

			keyCode = System.in.read();
			
			
			
			if (keyCode == 49) {
				System.out.println("예금액> ");
				int a = scanner.nextInt();
				sum += a;
				System.out.println("잔고 " + sum);
			} else if (keyCode == 50) {
				System.out.println("출금액> ");
				int b = scanner.nextInt();
				sum -= b;
				System.out.println("잔고 " + sum);
			} else if (keyCode == 51) {
				System.out.println("잔고> ");
				
				System.out.println("잔고" + sum);
			}else if (keyCode == 52) {
				run  = false;
				System.out.println("프로그램종료");
		}
			
		

	}
}
}