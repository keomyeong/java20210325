package p12.lecture;

public class A03ThreadSleep {
	public static void main(String[] args) {
		System.out.println("실행1 ");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("실행2");
		
		
		for(int i = 0; i < 10; i++ ) {
		}
	}
}
