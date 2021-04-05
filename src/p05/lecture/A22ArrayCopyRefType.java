package p05.lecture;

import java.util.Arrays;

public class A22ArrayCopyRefType {
	public static void main(String[] args) {
		//그림08 참조타입
		String[] s = {"java", "abc"};
		String[] t = new String[2];
		
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
		
		System.arraycopy(s, 0, t, 0, 2);
		
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
		System.out.println(s == t);
		
	}
}
