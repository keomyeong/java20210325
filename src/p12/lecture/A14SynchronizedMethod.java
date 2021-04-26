package p12.lecture;


public class A14SynchronizedMethod {
	public static void main(String[] args) {
		Thread14 t1 = new Thread14();
		Thread15 t2 = new Thread15();
		
		Box box = new Box();
		t1.box = box;
		t2.box = box;
		
		t1.start();
		t2.start();
	}
}

class Thread14 extends Thread {
	public Box box;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		box.update(100);
		
	}
}
class Thread15 extends Thread {
	public Box box;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		box.update(50);

	}
}
class Box{
	public int i;
	public void update(int i) {
		this.i = i;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
