package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Paths;

/*
 Read a list of data  from a file , 
 count the number of words and write them in the file
 */
public class ReadeSymptomDataFromFile implements ISymptomReader {
	private BufferedReader br;
	String fileInputName = "C:\\Users\\Gonan\\eclipse-workspace\\OpenclassRoom_Project02\\src\\com\\hemebiotech\\symptomes.txt";
	private ArrayList<String> symptomesList = new ArrayList<String>();
//	private String fileInputName = inputFile;

	public ReaderSymptomsDataFromFile() {
		// TODO Auto-generated constructor stub
	}

	public ReaderSymptomsDataFromFile(String fileInputName) {
		this.fileInputName = fileInputName;
	}

	@Override
	public List<String> getSymptoms() {

		File file = new File(fileInputName);

		try {
			String lines;
			int compteur = 0;
			br = new BufferedReader(new FileReader(file));

			while ((lines = br.readLine()) != null) {
				compteur = compteur + 1;

				System.out.println(compteur + ")" + lines);
				symptomesList.add(lines);

			}
			
			System.out.println("*************************************************");
			System.out.printf("Le fichier %s contient %d lignes \n", Paths.get(fileInputName).getFileName(), compteur);
			System.out.println("*************************************************");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return symptomesList;
	}

}
