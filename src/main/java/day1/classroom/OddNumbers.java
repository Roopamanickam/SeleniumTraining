package day1.classroom;

public class OddNumbers {
	
	/*
	 * Goal: Find the odd numbers in the specific range of numbers
	 * 
	 * Input: range of numbers (starting to end) [1 to 20]
	 * Output: Printing only odd numbers [1,3,5,7,9...,19]
	 * 
	 * Shortcuts:
	 * 1) Print : type 'syso', followed by ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 * 
	 * What are my learnings from this code?
	 * 
	 * 1) variable declaration
	 * 2) ruunning same logic for a specified number of times
	 * 3) printing an element in output
	 * 
	 */

	public static void main(String[] args) {
		
		System.out.println("Printing only the odd numbers from 1 to 20");

		//	Iterate from 1 to 20 (tip: using loop concept)
		for (int i = 0; i <=20; i++) {
			
			int a = (i%2);
			
			if(a!=0)
			{
				System.out.println("odd Numbers:"+i); 
			}
		}

		//	Within loop -> check whether the integer is odd (tip: use mod operator)

		//	Within loop -> print the odd integer

	}

}
