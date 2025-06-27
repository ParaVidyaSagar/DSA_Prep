package com.string;

import java.io.IOException;
import java.io.StringReader;

public class ReadingString {
	public static void main(String[] args) {
		String s = "Hello world";
	
		//Creating a new string Reader
		StringReader sr = new StringReader(s);
		try {
			//read the first five characters
			for(int i =0; i<5;i++) {
				char c= (char) sr.read();
				System.out.print(" "+c);
			}
			//close the stream
			sr.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
