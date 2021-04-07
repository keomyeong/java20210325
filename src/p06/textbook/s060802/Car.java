package p06.textbook.s060802;

import java.util.Scanner;

public class Car {
	int gas = 0;
	
	Scanner scanner = new Scanner(System.in);

	void setGas() {
		//this.gas = scanner.nextInt();
		this.gas = (int)(Math.random()*6)+1;
			}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas 잔량 : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas 잔량 : " + gas + ")");
				return;
			}
		}
	}
}
