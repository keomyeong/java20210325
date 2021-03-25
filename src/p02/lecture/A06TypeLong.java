package p02.lecture;

public class A06TypeLong {
public static void main(String[] args) {
	//long : 8byte(64bit)
	//
	System.out.println("최대값");
	System.out.println(Long.MAX_VALUE);
	System.out.println("최소값");
	System.out.println(Long.MIN_VALUE);
	
	long longVar;
	// longVar = 9223372036854775807;  숫자 자체(literal)는 int값입니다.
	longVar = 9223372036854775807L;
	
	longVar =  1_000_000;
	longVar = 100_0000; // 큰수일때 언더 바도 좋아요~~
}
}
