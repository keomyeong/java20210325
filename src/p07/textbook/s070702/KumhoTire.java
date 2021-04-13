package p07.textbook.s070702;

public class KumhoTire extends Tire {
public KumhoTire(String location, int maxRotation) {
	super(location,maxRotation);
}

@Override
	public boolean roll() {
	++accmulatedRotation;
	if(accmulatedRotation<maxRotation) {
		System.out.println(location+"KmhoTire 수명: "+(maxRotation-accmulatedRotation)+"회");
		return true;
	}else {
		System.out.println("***"+location+"KmhoTire 펑크 ***");
		return false;
		
	}
}
}
