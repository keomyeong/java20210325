package p07.lecture.p6polymorphism.ex2;

public class A07ClassCastException {
public static void main(String[] args) {
	KindaCat k1 = new Tiger();
	
	Tiger t1 = (Tiger) k1;
	
	Cat c1 = (Cat) k1; // 이럴경우 컴파일에러 를 잡아주지않기에 위험한 코드
	
	
	
	System.out.println("프로그램 종료...");
}
}
