package com.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//console(hardcode) to file
public class WriteTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("Output.txt");
		
		String str="Copy this to file";
		
		FileWriter write=new FileWriter(f);
		
		write.write(str);
		
		write.close();
		

	}

}

