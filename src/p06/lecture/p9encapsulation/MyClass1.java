package p06.lecture.p9encapsulation;

public class MyClass1 {
	private String str;
	private int memory;
	private boolean on;
	private String model;
	private int ssd;
	
	public String getStr() {
		return str;
	}
	public int getMemory() {
		return memory;
	}
	public boolean isOn() {
		return on; //is 로 하는데 get으로 나도 상관 없음
	}
	public String getModel() {
		return model;
	}
	public int getSsd() {
		return ssd;
	}
}
