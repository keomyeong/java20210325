package p06.textbook.s060802;

import java.util.Scanner;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.print("입력 > ");
		myCar.setGas();
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}