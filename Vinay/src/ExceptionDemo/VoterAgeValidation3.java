package ExceptionDemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class VoterAgeValidation3 {

	public static void main(String[] args) throws Throwable {

		voterDetails(17);
	}

	public static void voterDetails(int age) throws NumberFormatException, FileNotFoundException, IOException {
		if (age >= 18) {
			System.out.println("valid voter");
		} else {
			System.out.println("voter age is not valid");
		}
		throw new NumberFormatException();
		throw new NullPointerException();
		throw new ArrayIndexOutOfBoundsException();
		throw new FileNotFoundException();
		throw new IOException();
		throw new SQLException();
		throw new Exception();

	}
	System.out.println("voter details continue.....");
}
	


