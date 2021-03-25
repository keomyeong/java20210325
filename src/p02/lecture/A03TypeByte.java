package p02.lecture;

public class A03TypeByte {
	public static void main(String[] args) {
		// byte : 1byte 크기의 정수를 저장할 수 있음.
		// 1byte == 8bit
		// 0000 0000 ~ 1111 1111 까지 저장가능

		// 십진법 0 == 0000 0000
		// 십진법 1 == 0000 0001
		// 십진법 2 == 0000 0010
		// 십진법 3 == 0000 0011
		// :
		// 127 == 0111 1111
		// -128 == 1000 0000 // 맨 왼쪽 비트가 1이면 음수로 판단
		// -126 == 1000 0010
		// -1 == 1111 1111
		// 0 == 0000 0000

		// min -128 max 127

		byte bateVar;
		// byteVar = -129; //not ok
		// byteVar = 128; // not ok
	}
}
