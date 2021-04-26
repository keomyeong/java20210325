package p12.lecture;

public class A14SynchronizedMethod1 {
	public static void main(String[] args) {
		Thread141 t1 = new Thread141();
		Thread141 t2 = new Thread141();
		Box1 box = new Box1();
		t1.box = box;
		t2.box = box;
		
		t1.start();
		t2.start();
		
		
	}
}

class Thread141 extends Thread {
	public Box1 box;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		box.execute();
	}
}

class Box1 {
	public synchronized void execute() {
		System.out.println("method Start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("method End");
	}
}