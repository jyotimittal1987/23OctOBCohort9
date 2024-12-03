package exceptions;

import java.io.*;
public class CheckedExceptionEx {

	static void read() throws FileNotFoundException,IOException {
		
		/*
		 * try { FileReader fr=new FileReader("sample.txt"); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		FileReader fr=new FileReader("sample.txt");
		fr.close();

	}

	public static void main(String[] args) {
		try {
			read();
		} catch (IOException e) {
			System.out.println("File does not exists ");
		}
	}

}
