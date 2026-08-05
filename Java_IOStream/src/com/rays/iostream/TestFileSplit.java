package com.rays.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileSplit {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\hello.txt");
		BufferedReader fileToCount = new BufferedReader(new FileReader(file));
		int count = 0;
		String s = fileToCount.readLine();

		while (s != null) {
			count++;
			s = fileToCount.readLine();
		}

		System.out.println("Total Lines in the Files: " + count);

		BufferedReader br = new BufferedReader(new FileReader(file));

		for (int i = 1; i <= count; i++) {
			String line = br.readLine();
			System.out.println("Create file " + i + " for line: " + line);
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\hello.txt"));
			bw.write(line);
			bw.close();
		}
		br.close();
		fileToCount.close();
		System.out.println("File split into " + count + " parts.");

	}

}
