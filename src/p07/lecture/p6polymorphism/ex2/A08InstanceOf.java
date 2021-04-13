

package p07.lecture.p6polymorphism.ex2;

public class A08InstanceOf {
public static void main(String[] args) {
	//instanceOf = 결과  - boolean
	// 왼쪽항 참조 변수 , 오른쪽항 Type
	// 참조변수가 가리키는 인스턴스가 오른쪽항 type이면 true
	//그렇지 않으면 false
	
	KindaCat k1 = new Tiger();
	System.out.println(k1 instanceof Tiger);
	System.out.println(k1 instanceof KindaCat);
	System.out.println(k1 instanceof Cat);
}
}
