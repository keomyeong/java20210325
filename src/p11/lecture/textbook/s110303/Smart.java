package p11.lecture.textbook.s110303;

public class Smart {
private String company;
private String os;
public Smart(String company, String os) {
	this.company = company;
	this.os = os;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
	return company +os;
	}


}
