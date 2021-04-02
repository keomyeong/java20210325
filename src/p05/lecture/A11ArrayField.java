package p05.lecture;

public class A11ArrayField {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];

		System.out.println(arr1.length);
		System.out.println(arr2.length);

		arr1[0] = 10;
		arr1[1] = 11;
		arr1[2] = 12;

		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		arr2[3] = 400;
		arr2[4] = 500;
		System.out.println("arr1");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		System.out.println("arr2");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);

		System.out.println("Arr1 for 출력");
		for (int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		int sum = 0;
		System.out.println("Arr2 for 출력");
		for (int i = 0; i < 5; i++) {
			System.out.println(arr2[i]);
			sum += arr2[i];
		}
		System.out.println(sum);
		System.out.println("arr1 출력 (for)");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println("arr2 출력 (for)");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		/*
		 * arr1[0] = 10; arr1[1] = 11; arr1[2] = 12;
		 */
		// for
		System.out.println("3번출력");
		int[] arr3 = new int[3];
		for (int i = 0; i < 1; i++) {
			for(int j = 10; j<13; j++) {
				System.out.println(arr3[i] = j);
			}
		}
		
		for (int i = 0; i <arr1.length; i++) {
			arr1[i] = i+10;
			System.out.println(arr1[i]);
			}
		

		/*
		 * arr2[0] = 100; arr2[1] = 200; arr2[2] = 300; arr2[3] = 400; arr2[4] = 500;
		 */
		// for
		for (int i = 0; i <arr2.length; i++) {
			arr2[i] = 100* (i+1);
			System.out.println(arr2[i]);
			}
		}
	}

