package p15.lecture.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex03List {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(7, 3, 5, 1, 0, 1, 2);
		List<Integer> list2 = Arrays.asList(3, 4, 4, 5);

		List<Integer> merge1 = merge1(list1, list2);
		System.out.println(merge1);

		List<Integer> merge2 = merge2(list1, list2);
		System.out.println(merge2);
		
		Collections.reverse(list1);
		System.out.println(list1);
	}

	private static List<Integer> merge2(List<Integer> list1, List<Integer> list2) {
		List<Integer> merge = new ArrayList<>();
		int i1 = list1.size() - 1;
		int i2 = list2.size() - 1;

		while (i1 >= 0 || i2 >= 0) {
			if (i1 >= 0) {
				merge.add(list1.get(i1));
			}

			if (i2 >= 0) {
				merge.add(list2.get(i2));
			}

			i1--;
			i2--;
		}
		return merge;
	}

	private static List<Integer> merge1(List<Integer> list1, List<Integer> list2) {
		List<Integer> list = new ArrayList<>();
		int lt = list1.size() + list2.size();

		for (int i = 0; i < lt; i++) {
			if (i < list1.size()) {
				list.add(list1.get(i));
			}
			if (i < list2.size()) {
				list.add(list2.get(i));
			}
		}
		return list;
	}
}
