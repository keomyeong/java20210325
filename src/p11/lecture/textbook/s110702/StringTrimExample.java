package p11.lecture.textbook.s110702;

public class StringTrimExample {
public static void main(String[] args) {
	String tel1 = "          02";
	String tel2 = "    121      02";
	String tel3 = "       32102";
	
	String tel = tel1.trim() + tel2.trim() + tel3.trim();
	System.out.println(tel);
}
}
