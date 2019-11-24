package day1.classroom;

public class SumOfDigits {

	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1) using mod, remainder
	 * 2) looping until a specified condition is met
	 
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input number (int)

		int input=123;
		int quotient;
		int remainder;

		// Initialize an integer variable by name: sum
		int sum=1;

		// Use loop to calculate the sum: which loop to use until the number goes less than 10??

		while (input  > 10) {

			// Print the remainder to confirm
			remainder = input % 10;
			System.out.println("------>"+remainder );

			// Within loop: add that remainder to the sum
			sum = sum + remainder; 	 
			System.out.println("------>"+sum );

			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			quotient = input/10;
			input =quotient;
			
			// Print the quotient to confirm
			
			System.out.println("------>"+quotient );		


		}

		// Outside the loop: print the final sum
		System.out.println("Final Sum--->"+sum );	

	}

}
