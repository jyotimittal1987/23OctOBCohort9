package exceptions;

import java.util.*;

public class TryCatchEx {

	static void calculate_division() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		try {
			System.out.println("Enter two numbers");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println(num1 / num2);
			int arr[] = { 45, 67, 88 };
			System.out.println(arr[4]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		/*
		 * catch (ArithmeticException e) {
		 * System.out.println("You are trying to divide by zero"); } catch
		 * (ArrayIndexOutOfBoundsException r) { System.out.println(r.getMessage()); }
		 */ /*
			 * catch (InputMismatchException t) { t.printStackTrace(); }
			 */
		catch (Exception e) {
			System.out.println("Exception occured :" + e.getMessage());
		}
		finally
		{
			sc.close();
			System.out.println("Closing the resources");
		}
		System.out.println("After catch block");
	}

	public static void main(String[] args) {
		calculate_division();
		System.out.println("After method execution");
	}

}
