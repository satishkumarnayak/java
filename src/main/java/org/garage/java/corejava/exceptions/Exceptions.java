package org.garage.java.corejava.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {

	public void doSomeStuff() {
		try {
			System.out.println(10 / 0);
		} /*
			 * catch(CloneNotSupportedException e) { // Compilation error
			 * 
			 * }
			 */
		catch (NullPointerException ae) {
			System.out.println("statement1");
		} catch (ArithmeticException ae) {
			System.out.println("statement2");

			return;

		} catch (Exception e) {
			System.out.println("statement3");

		}

		finally {

			System.out.println("finally");

		}
	}

	public void tryWithResources() {

		try (Scanner sc = new Scanner("path"); Scanner sc1 = new Scanner("path");) {
			System.out.println("try with resources");
		}

	}

	public void multiCatch() {
		try {
			System.out.println("multi catch try");
			// throw new NullPointerException("");
			// throw new ArithmeticException();
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("multi catch catch");
			e.printStackTrace();
		}
	}

}
