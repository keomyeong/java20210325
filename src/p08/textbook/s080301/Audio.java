package p08.textbook.s080301;

import p08.textbook.s080205.RemoteControl;

public class Audio implements RemoteControl {
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
		System.out.println("현재 오디오 볼륨" + this.volume);
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 꺼요");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켜요");
		
	}

}
