package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {8,5,3,9,2,1};
		int min = array[0];
		
		// int max = Integer.MIN_VALUE;
		//int min = Integer.MAX_VALUE;
		int sum = 0;
		double avg = 0;
		for(int i = 0; i<array.length; i++) {
				if(array[i] > max) {				
					max = array[i];
				}			
		}
		for(int i = 0; i<array.length; i++) {
			if(array[i] < min) {		
				min = array[i];
			}			
	}
		for(int i = 0; i<array.length; i++) {
				sum += array[i];
				
	}		avg = (double)sum/array.length;
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		

	}
}
