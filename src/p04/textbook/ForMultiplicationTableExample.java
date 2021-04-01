package p04.textbook;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			for (int n = 1; n <= 9; n++)
				System.out.println(m + "X" + n + "=" + (m * n));
		}
		System.out.println();

		for (int m = 2; m <= 9; m += 2) {
			for (int n = 1; n <= 9; n++)
				System.out.println(m + "X" + n + "=" + (m * n));
		}
		System.out.println();

		for (int m = 2; m <= 9; m++) {
			for (int n = 2; n <= 9; n += 2)
				System.out.println(m + "X" + n + "=" + (m * n));
		}
		System.out.println();

		for (int m = 9; m >= 2; m--) {
			for (int n = 1; n <= 9; n++)
				System.out.println(m + "X" + n + "=" + (m * n));
		}
		System.out.println();

		for (int m = 9; m >= 2; m--) {
			for (int n = 9; n >= 1; n--)
				System.out.println(m + "X" + n + "=" + (m * n));
		}
	}
}
