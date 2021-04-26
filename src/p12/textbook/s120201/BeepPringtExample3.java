package p12.textbook.s120201;

import java.awt.Toolkit;

public class BeepPringtExample3 {
	public static void main(String[] args) {
	Thread thread = new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Toolkit toolkit = Toolkit.getDefaultToolkit();

			for (int i = 0; i < 5; i++) {
				toolkit.beep();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	});
	thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}