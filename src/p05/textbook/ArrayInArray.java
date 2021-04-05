package p05.textbook;

public class ArrayInArray {
public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		for(int i = 0; i<mathScores.length; i++) {
			for(int k = 0; k<mathScores[i].length; k++) {
				System.out.print(mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] enlishScores = new int[2][];
		enlishScores[0] = new int[2];
		enlishScores[1] = new int[3];
		
		for(int i = 0; i<enlishScores.length; i++) {
			for(int k = 0; k<enlishScores[i].length; k++) {
				System.out.print(enlishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95,80},{92,96,80}};
		for(int i = 0; i<javaScores.length; i++) {
			for(int k = 0; k<javaScores[i].length; k++) {
				System.out.print(javaScores[i][k]);
				if(k<javaScores[i].length-1) {
					System.out.print(",");
				}
			}
		}
		System.out.println();
		
	}
}

