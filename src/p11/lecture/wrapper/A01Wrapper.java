package p11.lecture.wrapper;

public class A01Wrapper {
public static void main(String[] args) {
	//8개 기본타입 말고는 나머지는 모두 다른타입
	//wrapper class들
	//Byte Short Integer Long
	//Character Boolean
	//Float, Double
	
	Integer i1 = new Integer(100);
	System.out.println(i1.hashCode());
	
	Object[] arr1 = new Object[] {"java",3,true,3.14,'a'};
	
	Object o1 = new Integer(3); // boxing
	Object o2 = 3; //  auto boxing
	
	//int intVAr1 = o1; x
	Integer i2 = new Integer(88);
	
	int intVar2 = i2; //Auto unboxing
	
	intVar2 = i2.intValue();//boxing
}
}
