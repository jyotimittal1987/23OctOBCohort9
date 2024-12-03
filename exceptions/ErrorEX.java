package exceptions;

public class ErrorEX {
	static void read() {
		System.out.println("Reading Data...");
		read();
	}

	public static void main(String[] args) {
		read();
	}
}
