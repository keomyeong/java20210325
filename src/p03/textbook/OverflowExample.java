package p03.textbook;

public class OverflowExample {
public static void main(String[] args) {
	int x = 100000;
	int y = 100000;
	
	int z = x*y;
	System.out.println(z);
}
}
