package p06.lecture.p3constructor;

import java.util.Arrays;

public class A05ThisConstructor {
	// this : 이 클래스에 의해 만들어지는 참조 변수를 대체 키워드
	// this() : 이 클래스 내의 다른 생성자
	// () 이거 잘봐 ~~

	public static void main(String[] args) {
		Notebook n1 = new Notebook("lenovo", 32, "intel");
		System.out.println(n1.re());
	}
}
