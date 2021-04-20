package p08.textbook.s080402;

import p08.textbook.s080205.RemoteControl;

public class Audio implements RemoteControl {
	
	private int volume;
	private boolean mute;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오 그만켜");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
System.out.println("오디오를 그만꺼");
	}
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
		public void setMute(boolean mute) {
			this.mute = mute;
			if(mute) {
				System.out.println("무음처리합니다.");
			}else {
				System.out.println("무음을 해제합니다.");
			}
		}
	}
	
	


