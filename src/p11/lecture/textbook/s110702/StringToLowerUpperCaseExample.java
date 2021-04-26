package p11.lecture.textbook.s110702;

public class StringToLowerUpperCaseExample {
public static void main(String[] args) {
	String st1 = "JAVA PROGRAMMING";
	String st2 = "java programming";
	
	System.out.println(st1.equals(st2));
	
	String lst1 = st1.toLowerCase();
	
	System.out.println(lst1.equals(st2));
	
	System.out.println(st1.equalsIgnoreCase(st2));
	
}
}
