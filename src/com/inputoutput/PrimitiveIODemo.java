package com.inputoutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveIODemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("Primitive.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeDouble(2.3);
		dos.writeBoolean(false);
		dos.writeInt(2);
		dos.writeFloat(2.3f);
		
		dos.close();
		fos.close();
		
		System.out.println("File has been created");
		System.out.println("======================");
		System.out.println("File reading");
		
		FileInputStream fis=new FileInputStream("Primitive.txt");
		DataInputStream dis=new DataInputStream(fis);
		
		System.out.println("Double data "+dis.readDouble());
		System.out.println("Boolean data "+dis.readBoolean());
		System.out.println("Int data "+dis.readInt());
		System.out.println("Float data "+dis.readFloat());
		
		dis.close();
		fis.close();

	}

}
