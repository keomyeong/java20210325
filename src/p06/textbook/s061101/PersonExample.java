package p06.textbook.s061101;

public class PersonExample {
public static void main(String[] args) {
	Person p1 = new Person("123456-7894561","계백");
	System.out.println(p1.nation);
	System.out.println(p1.ssn);
	System.out.println(p1.name);
	
	p1.name = "을지문덕";
}
}
