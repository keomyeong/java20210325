package p10.textbook.s100601;

public class ThrowsExample {
public static void main(String[] args) {
	try {
		findClass();
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
		System.out.println("클래스가 존재하지 않습니다.");
	}
}

public static void findClass() throws ClassNotFoundException {
	// TODO Auto-generated method stub
	Class clazz = Class.forName("java.lang.String2");
	
}
}
