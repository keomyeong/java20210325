package p11.lecture.textbook.s110702;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "730641230123";

		int length = ssn.length();
		
		if(length == 13) {
			System.out.println("자리수 맞음");
		}else {
			System.out.println("자리수 안맞음");
		}
	}
}
