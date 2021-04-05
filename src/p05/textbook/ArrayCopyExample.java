package p05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "JAVA", "array", "copy" };
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		System.out.println(newStrArray.length);
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i]);
			if (i < newStrArray.length - 1) {
				System.out.print(",");
			}
		}

	}
}
