package p11.lecture.textbook.s110702;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String sub = "자바 프로그래밍";
		int location = sub.indexOf("프로그래밍");
		System.out.println(location);
		
		if(sub.indexOf("자바")!= -1) {
			System.out.println("자바관련책");
		}else {
			System.out.println("자바와 관련없는 책");
		}
	}
}
