package p09.textbook.s090502;

public class AnonymousExample {
public static void main(String[] args) {
	Anonymous anony = new Anonymous();
	anony.field.turnOn();
	anony.method();
	anony.method2(new RemoteControl() {
		
	
		
		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("스마트티비 온!");
		}
		 
		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("스마트티비 오프!");
		}
	});
}
}
