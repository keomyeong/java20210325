package p09.lecture;

public class A03Access {
	class NonStaticClass {

	}

	static class StaticClass {

	}

	NonStaticClass o1 = new NonStaticClass();
	StaticClass o2 = new StaticClass();

	// static NonStaticClass o4 = new NonStaticClass();
	static StaticClass o3 = new StaticClass();

	void instanceMethod() {
		staticMethod();
		// non-static member 는 static 접근 가능
	}

	static void staticMethod() {
		// instanceMethod();

		// static member는 non-static 접근 불가능
	}
}
