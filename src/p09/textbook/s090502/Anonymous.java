package p09.textbook.s090502;

public class Anonymous {
RemoteControl field = new RemoteControl() {
	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	};
	
};
void method() {
	RemoteControl localVar = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("audio를 켭니다.");
		}
		public void turnOff() {
			System.out.println("audio를 끕니다.");
		}
};
localVar.turnOn();
}
void method2(RemoteControl rc) {
	rc.turnOn();
}
}
