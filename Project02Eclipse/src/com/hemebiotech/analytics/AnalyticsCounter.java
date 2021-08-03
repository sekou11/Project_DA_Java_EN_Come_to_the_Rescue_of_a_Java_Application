package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.nio.file.Paths;
/*
 This is a main class
 the program will read a file which contains a list of sypmtoms and count theses 
 and print the result by the count and sorting in another file
 
 
  
 */

public class AnalyticsCounter {
	public static void main(String[] args) {
		final String path;
		// dans args le PATH qui contiendra le fichier symptomes.txt
		// Nous utilisons le même PATH pour déposer result.out
		
		if (args.length == 1) {
			path = args[0];
		} else {
			path=".";
			System.out.println("Usage: java <PGMJAVA> <Le path vers le fichier>");
			System.exit(0);
		}
		System.out.printf("REP=%s FICH=%s\n", Paths.get(path).getParent(), Paths.get(path).getFileName());
		final String inputFile = path;
		final String outputName = Paths.get(path).getParent().toString() + "/result.out";

		ReaderSymptomsDataFromFile reader = new ReaderSymptomsDataFromFile(inputFile);
		List<String> namesOfSymptomes = reader.getSymptoms();

		NumberOfOccurrences countSymptomes = new NumberOfOccurrences();
		Map<String, Integer> getNumberOfOccurrences = countSymptomes.getNumberOfOccurrences(namesOfSymptomes);

		WriteSymptoms writeSymptoms = new WriteSymptoms(outputName);
		writeSymptoms.writeSymptomsInAFile(getNumberOfOccurrences);
	}
}
