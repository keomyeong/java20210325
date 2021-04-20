package p08.lecture.ex6;

public class A01Anonymous {
public static void main(String[] args) {
	MyInterface i1;
	i1 = new MyClass();
	
	MyInterface i2;
	i2 = new MyInterface() {
		@Override
		public void method1() {
			System.out.println("anonymous class method1");
		}
	};
	i1.method1();
	i2.method1();
}
}
