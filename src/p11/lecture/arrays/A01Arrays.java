package p11.lecture.arrays;

import java.util.Arrays;

public class A01Arrays {
	public static void main(String[] args) {
		int[] arr1 = {7,8,9,98,4,56,12};
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr1, 1, 4);
		System.out.println(Arrays.toString(arr3));

	}
}
