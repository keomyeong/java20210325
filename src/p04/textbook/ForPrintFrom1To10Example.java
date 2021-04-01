package p04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);
		}
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		for (int i = 10; i > 0; i -= 2) {
			System.out.println(i);
		}
		for (int i = 9; i > 0; i -= 2)
		{
			System.out.println(i);
		}
	}
}
