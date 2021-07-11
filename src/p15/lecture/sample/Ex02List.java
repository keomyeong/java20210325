package p15.lecture.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02List {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(5, 2, 6, 7, 0);
		List<Integer> list2 = Arrays.asList(3, 5, 9, 7, 2);

		List<Integer> merge1 = merge1(list1, list2);
		System.out.println(merge1);

		List<Integer> merge2 = merge2(list1, list2);
		System.out.println(merge2);

	}

	private static List<Integer> merge2(List<Integer> list1, List<Integer> list2) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < list1.size(); i++) {
			int e1 = list1.get(i);
			int e2 = list2.get(i);

			if (!list.contains(e1)) {
				list.add(e1);
			}

			if (!list.contains(e2)) {
				list.add(e2);
			}
		}

		return list;
	}

	private static List<Integer> merge1(List<Integer> list1, List<Integer> list2) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < list1.size(); i++) {
			list.add(list1.get(i));
			list.add(list2.get(i));

		}

		return list;

	}
}
