package com.rays.iostream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputFromKeyboard {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter(new FileWriter("C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\hello.txt",true));
		
		System.out.println("Start writing your text here....");
		
		InputStreamReader kb =new InputStreamReader(System.in);
		
		BufferedReader in= new BufferedReader(kb);
		
		String line =in.readLine();
		
		while(!line.equals("exit")) {
			pw.println(line);
			line=in.readLine();		
			}
		in.close();
		pw.close();
		kb.close();
	}

}
