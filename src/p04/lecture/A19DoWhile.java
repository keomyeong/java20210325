package p04.lecture;

public class A19DoWhile {
	public static void main(String[] args) {
		boolean a = false;
		while (a) {
			System.out.println("while coade block");
			
			//do while(); 코드 블럭이 최 초 한번은 실행됨
			
			// true 코드블럭 false 다음 실행 흐름
		}
		do {
			System.out.println("doWhile");
		} while (a);
		System.out.println("프로그램 종료");
	}

}
