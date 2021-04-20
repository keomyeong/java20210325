package p09.lecture;

public class A01NestedClassExample {
	A01NestedClass.StaticCalss o1 = new A01NestedClass.StaticCalss();
//	A01NestedClass.innerClass o2 = new A01NestedClass.innerClass(); 바로 접근 불가
	
	A01NestedClass outer1 = new A01NestedClass();
	A01NestedClass.InnerClass o3 = outer1.new InnerClass();
	
	
}
