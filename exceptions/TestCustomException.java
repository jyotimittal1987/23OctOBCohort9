package exceptions;

public class TestCustomException {

	static void testAge(int age) throws InvalidAgeException {
		if (age < 18) {
			//explicitly throw an exception
			throw new InvalidAgeException("Not eligible for vote");

		} else {
			System.out.println("You are eligible for vote");
		}
	}

	public static void main(String[] args) {
		try {
			testAge(8);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
