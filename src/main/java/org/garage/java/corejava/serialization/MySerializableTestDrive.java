package org.garage.java.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MySerializableTestDrive {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		MySerializable myObj = new MySerializable();
		myObj.setSomeString("Evyaan");
		myObj.setSomeInt(500);
		MyClass myclass = new MyClass();
		myObj.setMyclass(myclass);
		
		System.out.println("myObj"+myObj);
		FileOutputStream fos = new FileOutputStream("myobj3.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(myObj);
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("myobj3.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		MySerializable myObjBack = (MySerializable) ois.readObject();
		
		ois.close();
		fis.close();
		System.out.println("myObjBack"+myObjBack);

	}

}
