package p03.lecture.p2binary.p1arithmetic;

public class A05StringConcat {
	public static void main(String[] args) {
		int a = 3;
		int b = 9;
		
		int c = a + b;
		System.out.println(c);
		
		// string : 문자열""
		String str1 = "Java";
		String str2 = "spring";
		
		String str = str1 + str2;
		System.out.println(str);
		
		String str4 =  str1 + a;
		System.out.println(str4);
		
		//연산의 순서가 중요해
		
		String str5 =  str1 + a + b;
		System.out.println(str5);
		
		String str6 =  a + b + str1;
		System.out.println(str6);
		
	}
}
