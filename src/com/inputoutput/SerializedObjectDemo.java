package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//close method is used because if you will not used that the stream will continuously remain open for input or output
//read and write (Person) object type of data
public class SerializedObjectDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Person p=new Person(1,"Ruturaj");
		
		FileOutputStream fos=new FileOutputStream("PersonDetails.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(p);
		fos.close();
		oos.close();
		
		System.out.println("File created");
		System.out.println("=================");
		System.out.println("Reading the object from file i.e. deserialization");
		
		FileInputStream fis=new FileInputStream("PersonDetails.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Person pob=(Person) ois.readObject();//(Explicit conversion)data that you are reading from file that is a bytestream data
		System.out.println("Person id "+pob.getpId());
		System.out.println("Person name "+pob.getpName());
		
		fis.close();
		ois.close();
		
		

	}

}
