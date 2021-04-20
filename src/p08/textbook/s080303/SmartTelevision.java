package p08.textbook.s080303;

import p08.textbook.s080205.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
private int volume;

@Override
public void search(String url) {
	// TODO Auto-generated method stub
	System.out.println(url + "을 검색합니다.");
}

@Override
public void turnOn() {
	// TODO Auto-generated method stub
	System.out.println("티비를 켭니다.");
}

@Override
public void turnOff() {
	// TODO Auto-generated method stub
	System.out.println("티비를 끕니다.");
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

}


