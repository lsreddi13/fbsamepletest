package com.FileOprationsTests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class C4_TextFile_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter flwr = new FileWriter(".\\Files\\TextWrite.txt",
				true);

		flwr.write("Hi This is Nikil");
		flwr.write("Giving a Session");
		flwr.write("on File Operations");

		BufferedWriter bfrwr = new BufferedWriter(flwr);
		bfrwr.write("Session Date is : 26th Jan 2020");
		bfrwr.newLine();
		bfrwr.write("Its a republic day!!!");
		bfrwr.flush();
		System.out.println("Written into file");

	}

}


//Tasks
//Create a Textfile in properties file format(i.e., Key = Value) and create methods to get the values from the text file.
//get(Using Key)
//Check if key is present or not
//Get all the Keys
//Get all the Values







