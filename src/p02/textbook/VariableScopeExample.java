package p02.textbook;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 -10;
		}
		//int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기에 에러가 뜹니다..
	}
}
