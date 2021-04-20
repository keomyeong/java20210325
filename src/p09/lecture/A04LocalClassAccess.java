package p09.lecture;

public class A04LocalClassAccess {
	void method(int param) {
		final int localVar = 3;
		// 저안에들어가는건 무조건 final 이여됨
		
	
		class LocalClass{
			void method1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}
}
