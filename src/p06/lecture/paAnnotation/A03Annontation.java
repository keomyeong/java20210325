package p06.lecture.paAnnotation;

import p05.textbook.s050701.Week;

public class A03Annontation {
	@MyAnnotation2(value = "java", attr1 = 3, attr2 = {3,4,5}, 
			attr3 = "ghaha", attr4 =Week.SATURDAY , attr6= "spring" )
	public void method1() {
		
	}
}
