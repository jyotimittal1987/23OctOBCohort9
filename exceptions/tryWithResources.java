package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class tryWithResources {

	static void read() {
		try (FileReader fr = new FileReader("sample.txt");) {

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		read();
	}
}
