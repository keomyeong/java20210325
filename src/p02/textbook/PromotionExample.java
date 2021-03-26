package p02.textbook;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue); // int <- byte

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드=" + intValue); // int <- char

		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue); // long <- int

		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue); // double <- int
	}
}
