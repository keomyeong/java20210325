package p99.programamers;

import java.util.Scanner;

public class P12969 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("입력해주세요");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        for(int i=0; i<b; i++) { // @1
				for(int j=0; j<a; j++) { // @2
					System.out.print("*"); 
				}
				System.out.println(); // @4
			}
	    }
}
