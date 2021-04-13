package p07.textbook.s070201;

public class DumCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
		
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색삭 : "+ dmbCellPhone.color);
		System.out.println("채널 : " + dmbCellPhone.channel );
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동 인데요.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.trunOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}
}
