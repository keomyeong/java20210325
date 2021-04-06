package p05.lecture;

import java.util.Arrays;

public class A31MatrixSum {
	public static void main(String[] args) {
		int[][] mat1 = {
				{1,2,3},
				{5,6,3},
				{4,6,7},
				{2,3,4},
		};
		int[][] mat2 = {
				{12,21,32},
				{53,13,32},
				{4,64,4},
				{0,3,45},
		};
		int[][] mat3 = sum(mat1, mat2);
		
		for(int[] row : mat3) {
			System.out.println(Arrays.toString(row));
		}
	}

	private static int[][] sum(int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		
		int[][] c = new int [a.length][a[0].length];
		
		
		for (int i = 0; i < c.length; i++) {
			for(int j = 0; j< c[i].length; j++) {
				c[i][j] = a[i][j] * b[i][j];
			}
		}
		
		return c;
	}
	private static int[][] sum2(int[][] a, int[][] b) {
		int[][] c = new int[a.length][];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new int[a[i].length];
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}

}
