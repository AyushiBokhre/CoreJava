package com.rays.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteValidEmails {
	public static void main(String[] args) throws IOException {

		FileReader source = new FileReader("C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\source.txt");
		FileWriter target = new FileWriter("C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\target.txt");

		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(target);

		String email = br.readLine();

		while (email != null) {
			if (email.endsWith("gmail.com")) {
				System.out.println(email);
				bw.write(email);
				bw.newLine();
			}
			email = br.readLine();
		}
		br.close();
		bw.close();
	}

}
