package com.support;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
	
	public String Filereader() throws IOException{
		
	
	File file= new File("C:\\Users\\user\\Desktop\\QA training\\Flipkart_Automation\\test.txt");
	
	FileReader reader= new FileReader(file);
	BufferedReader bfreader=new BufferedReader(reader);
	System.out.println(bfreader.readLine());
	return bfreader.readLine();
	}

}
