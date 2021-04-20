package p08.textbook.s080302;

import p08.textbook.s080205.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {};
			public void turnOff() {};
			public void setVolume(int volume) {};
		};
		
		System.out.println(rc.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		rc.setMute(false);
		RemoteControl.changeBattery();
		
	}
}
