package p11.lecture.textbook.exercise.ex10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "a123456789012";
		String regExp = "[a-zA-Z]\\d{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("Ok");
			
		}else {
			System.out.println("No");
		}
	}
}
