package p03.lecture.p2binary.p4bit;

public class A03BitShiftRight {
	public static void main(String[] args) {
		// >> 왼쪽을 부호비트 채움
		// >>> 왼쪽을 0 으로 채움
		
		int a = -99;
		//11111111111111111111111110011101
		// a >> 1
		//11111111111111111111111111001110
		System.out.println(a >> 1);
		
		//a>>>1
		//01111111111111111111111111001110
	}
}
