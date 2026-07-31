package com.rays.iostream;

import java.io.FileReader;


public class ReadTextbyFile {
	public static void main(String[] args) throws Exception {
		FileReader file =new FileReader("C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\hello.txt");
		
		int i= file.read();
		
		while(i!=-1) {
			System.out.println((char)i+" = "+i);
			i=file.read();	
			}
		
		file.close();
	}
	

}
