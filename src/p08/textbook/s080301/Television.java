package p08.textbook.s080301;

import p08.textbook.s080205.RemoteControl;

public class Television implements RemoteControl {
	private int volume;
	
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
				
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
				
		}else {
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨" + this.volume);
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv를 꺼");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv를 켜");
		
	}


}
