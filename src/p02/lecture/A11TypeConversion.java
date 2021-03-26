package p02.lecture;

public class A11TypeConversion {
public static void main(String[] args) {
	// 정수 : byte, short, int, long
	///////////////////////////////
	// 자동형변환
	byte byteVar1 = 100;
	short shortVar1 = byteVar1;
	int intVar1 = shortVar1;
	intVar1 = byteVar1;
	
	long longVar1 = intVar1;
	longVar1 = shortVar1;
	///////////////////////////////
	int intVar2 = 100;
	short shortVar2 = 100;
	//shortVar2 = intVar2; //xx
	// 강제형변환 (type casting) casting
	shortVar2 = (short) intVar2;
	System.out.println(shortVar2);
	
	// 타입케스팅을 할때 쇼트바가 감당할수있는 범위내에서 해야함
}
}
