package com.FileOprationsTests;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class C2_Properties_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		// prop.setProperty("FirstName", "Nikil");
		// prop.setProperty("LastName", "Gunda");
		// prop.setProperty("Institute", "PVN");
		prop.putIfAbsent("LastName", "G");
		prop.putIfAbsent("Course", "Selenium");
		FileOutputStream fos = new FileOutputStream("Src4\\..\\PropertiesFile_Write.properties", true);
		prop.store(fos, "User Name details");

		System.out.println("Properties are written");

	}

}
