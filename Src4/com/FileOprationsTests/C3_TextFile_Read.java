package com.FileOprationsTests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C3_TextFile_Read {

	public static void main(String[] args) throws IOException {

		FileReader flr = new FileReader(".\\Files\\TextRead.txt");
		System.out.println("Using Read Method");
//		System.out.println(flr.read());
//		System.out.println(flr.read());
//		System.out.println(flr.read());
//		System.out.println(flr.read());
//		System.out.println(flr.read());
//		System.out.println(flr.read());
//		System.out.println(flr.read());

		BufferedReader buffrdr = new BufferedReader(flr);
		System.out.println("Using readLine Method");

		String linetxt = buffrdr.readLine();
		while (linetxt != null) {
			System.out.println(linetxt);
			linetxt = buffrdr.readLine();
			
		}

	}

}
