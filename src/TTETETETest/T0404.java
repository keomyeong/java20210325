package TTETETETest;

public class T0404 {
	public static void main(String[] args) {
		
		while (true) {		
			int com1 = (int)(Math.random()*6)+1;
			int com2 = (int)(Math.random()*6)+1;
			
			if((com1+com2)==5) {
			 System.out.println("<"+com1+com2+">");
			 System.out.println("합이"+(com1+com2)+"입니다.");
			 break;
			}else {
			 System.out.println("<"+com1+com2+">");
			 System.out.println("합이"+(com1+com2)+"입니다.");
			}
			
		
		}
	}
}
