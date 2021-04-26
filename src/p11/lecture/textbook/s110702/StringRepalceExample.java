package p11.lecture.textbook.s110702;

public class StringRepalceExample {
public static void main(String[] args) {
	String oldStr = "자바바바바바바바자자자자자바바바";
	String newStr = oldStr.replace("자바", "java");
	System.out.println(oldStr);
	System.out.println(newStr);
}
}
