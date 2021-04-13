package p07.lecture.p6polymorphism.ex2;

public class A06TypeCasting {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.cry();
		t1.hunt();
		
		KindaCat k1 = t1;
		
		k1.cry();
		Tiger t2 = (Tiger) k1;
		t2.cry();
		t2.hunt();
		
	}
}
