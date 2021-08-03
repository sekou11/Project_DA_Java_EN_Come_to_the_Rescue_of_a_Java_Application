package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NumberOfOccurrences {

	public Map<String, Integer> getNumberOfOccurrences(List<String> lines) {
		Map<String, Integer> occurrences = new TreeMap<>();
		for (String line : lines) {
			if (occurrences.containsKey(line)) {
				occurrences.put(line, occurrences.get(line) + 1);
			} else {
				occurrences.put(line, 1);
			}
		}
		for (Map.Entry<String, Integer> map : occurrences.entrySet()) {
			System.out.printf("le symptome %s :est repeté %d dans le  fichier \n", map.getKey(), map.getValue());
		}

		return occurrences;
	}
}
