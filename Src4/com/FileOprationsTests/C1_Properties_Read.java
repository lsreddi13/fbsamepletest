package com.FileOprationsTests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class C1_Properties_Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties props = new Properties();
		InputStream fis = new FileInputStream("Src4\\..\\PropertiesFile_Read.properties");
		props.load(fis);

		System.out.println(props.get("Url"));
		System.out.println(props.get("UName"));
		System.out.println(props.get("FirstName"));
		System.out.println("is PVN value present .? :"+props.containsValue("PVN"));
		System.out.println("Last Name is:"+props.getOrDefault("LastName", "Gunda"));
		System.out.println("is FirstName key present.? :"+props.containsKey("FirstName"));
		System.out.println("First Name is:"+props.getOrDefault("FirstName", "Nikil"));
		

	}

}
