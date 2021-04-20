package p10.lecture;

public class A02NullPointerException {
public static void main(String[] args) {
	System.out.println("프로그램 실행중");
	
	String str = "java";
	showLength(str);
	
	str = null;
	showLength(str);
	
	System.out.println("프로그램 실행중");
}
	private static void showLength(String s) {
		// TODO Auto-generated method stub
		System.out.println("길이는"+ s.length());

	}
}
