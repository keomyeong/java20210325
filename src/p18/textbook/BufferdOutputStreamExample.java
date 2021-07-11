package p18.textbook;

public class BufferdOutputStreamExample {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		String src = "src/p18/textbook/BufferedOutputStreamExample.java";
		String des = "src/p18/textbook/BufferedOutputStreamExample.copy";
		
		bis = new BufferedInputStream(src);
		fos = new FileOutputStream(des);
		
		start

	}
}
