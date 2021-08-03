package com.hemebiotech.analytics;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 Create a file(result.out) for write all a symptoms from anathor file(symptomes.txt)
 with their occurrence(no duplicate)
 */
public class WriteSymptoms {

	String fileOutputName = "C:\\Users\\Gonan\\eclipse-workspace\\OpenclassRoom_Project02\\src\\com\\hemebiotech\\result.out";

	public WriteSymptoms(String fileOutputName) {
		super();
		this.fileOutputName = fileOutputName;
	}

	public void writeSymptomsInAFile(Map<String, Integer> getNumberOfOccurrences) {

		try {
			List<String> listWritter = getNumberOfOccurrences.entrySet().stream()
					.map(entry -> entry.getKey() + ":" + entry.getValue()).collect(Collectors.toList());
			Files.write(Paths.get(fileOutputName), listWritter);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
