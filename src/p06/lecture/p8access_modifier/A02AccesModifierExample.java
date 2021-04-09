package p06.lecture.p8access_modifier;

import p06.lecture.p8access_modifier.package1.MyClass1;

public class A02AccesModifierExample {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		
		// System.out.println(o1.j); // private
		// System.out.println(o1.k); //package private, default
		System.out.println(o1.i);
	}
}
