package p11.lecture.textbook.s111201;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		Integer obg1 = new Integer(100);
		Integer obg2 = new Integer("200");
		Integer obg3 = Integer.valueOf("300");

		int value1 = obg1.intValue();
		int value2 = obg2.intValue();
		int value3 = obg3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}
}
