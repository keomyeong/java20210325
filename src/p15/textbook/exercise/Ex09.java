package p15.textbook.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxS = 0;
		int toS = 0;
		int sum = 0;
		
//		Set<String> keys = map.keySet();
//
//		for (String key : keys) {
//			sum += map.get(key);
//			if (map.get(key) > toS) {
//				toS = map.get(key);
//			}
//		}
//		maxS = sum / map.size();
		
		Set<Map.Entry<String, Integer>> entries = map.entrySet();

		for (Map.Entry<String, Integer> entry : entries) {
			if(entry.getValue()>maxS) {
			name = entry.getKey();
			maxS = entry.getValue();
			}
			sum += entry.getValue();
		}
		toS = sum / map.size();
		System.out.println("평균점수 : " + maxS);
		System.out.println("최고점수 : " + toS);
		System.out.println(name);

	}
}
