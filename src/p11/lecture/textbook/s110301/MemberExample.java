package p11.lecture.textbook.s110301;

public class MemberExample {
public static void main(String[] args) {
	Member obj1 = new Member("blue");
	Member obj2 = new Member("blue");
	Member obj3 = new Member("red");
	
	if(obj1.equals(obj2)) {
		System.out.println("1과 2는 동일하다");
	}else {
		System.out.println("1과 2는 동일하지 않다");
	}
	if(obj1.equals(obj3)){
		System.out.println("1과 3는 동일하다");
	}else {
		System.out.println("1과 3는 동일하지 않다");
	}
}
}
