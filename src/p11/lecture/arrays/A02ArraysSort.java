package p11.lecture.arrays;

import java.util.Arrays;

public class A02ArraysSort {
	public static void main(String[] args) {
		int[] arr1 = {
				29,2,2,41,5,2,1,23,421,2
		};
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));

		String[] arr2 = {"spring","java","python", "sugar"};
		
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
