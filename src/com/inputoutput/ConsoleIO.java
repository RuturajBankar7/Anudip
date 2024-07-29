package com.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//console to console
//reading the data on console and writing the data on console 

public class ConsoleIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your string");
		
		InputStreamReader isr=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(isr);
		
		String line;
		
		while((line=br.readLine())!=null && line.length()!=0)
		{
			System.out.println(line);
		}

	}

}
