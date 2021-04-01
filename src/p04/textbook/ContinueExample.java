package p04.textbook;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i =1; i <=10; i++) {
			if(i%2 != 10) {
				continue;
			}
			System.out.println(i);
		}
	}
}
