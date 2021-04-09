package p06.lecture.p4method;

public class A06ParameterCast {
	public static void main(String[] args) {
		int a =5;
		double b;
		b = a;
		
		MyClass6 o1 = new MyClass6();
		o1.method1(a);
	//	o1.method1(b); 는 안됨
		
		o1.method2(a);
		o1.method2(b); // 자동형변환이됨
	}
}
