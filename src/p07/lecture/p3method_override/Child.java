package p07.lecture.p3method_override;

public class Child extends Parent {
	
	@Override // 재정의 점검
	public void method1() {
		// 재정의;
		super.method1();
		System.out.println("method1 - child");
	}
}
