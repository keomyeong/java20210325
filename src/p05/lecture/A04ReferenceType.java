package p05.lecture;

public class A04ReferenceType {
	//03.참조타입.png
	public static void main(String[] args) {
		int i = 3;
		int g = i;
		
		String s = new String("java");
		String t = s;
		
		
		System.out.println(i==g);
		System.out.println(s==t);
		
	}
}
