package p07.textbook.s070706;

public class InstanceofExample {
public static void method1(Parent parent) {
	if(parent instanceof Child) {
		Child child = (Child) parent;
		System.out.println("method1 = child 로 변경 성공");
	}else {
		System.out.println("method1 -child로 변환되지 않음");
	}
	
}
public static void method2(Parent parent) {
	Child child = (Child) parent;
	System.out.println("method2 - child로 변호나성공");
	
}
public static void main(String[] args) {
	
	Parent parentA = new Child();
	method1(parentA);
	method2(parentA);
	
	Parent parentB = new Parent();
	method1(parentB);
	method2(parentB);
}
}
