package p09.textbook.s090203;

public class A {
	A() {
		System.out.println("A객체가 생성됨");
	}

	class B {
		B() {
			System.out.println("B객체가 생성됨");
		}

		int field1;

		// static int field2;
		void method1() {
		}
		// static void method2() {}
	}

//정적멤버클래스
	static class C {
		C() {
			System.out.println("c객체가 생성됨");
		}

		int field1;
		static int field2;

		void method1() {
		}

		static void method2() {
		}
	}

	void method() {
		class D {
			D() {
				System.out.println("D객체가 생성됨");
			}

			int field1;

			// static int field2;
			void method1() {
			}
			// static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
