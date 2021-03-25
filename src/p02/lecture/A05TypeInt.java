package p02.lecture;

public class A05TypeInt {
	public static void main(String[] args) {
		//int : 4byte(32bit)
		
		// 십진법 0 : 0000 0000 0000 0000 / 0000 0000 0000 0000
		//		  1 : 0000 0000 0000 0000 0000 0000 0000 0001
		// 이런느낌입니다.
		//	2,147,483,647 : 0111 1111 1111 1111 1111 1111 1111 1111
		//-2,147,483,648 : 1000 0000 0000 0000 0000 0000 0000 0000
		
		int intVar;
		intVar = 0;
		intVar = 2147483647; // 21억이 넘어간다 싶으면 롱타입이라고 있음 그거 써라 
							//  넘기지 말구 !!
		
		// 16진법 0~F //2진법 0000~1111 // 10진법 0~15
		
		intVar = 255;
		System.out.println(intVar);
		intVar = 0xFF;
		System.out.println(intVar);
		intVar = 0377;
		System.out.println(intVar);
	}
}
