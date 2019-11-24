package assignments;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) for and if loop
	 * 2) assigning variable to another variable
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		int range = 8, firstNum=0,secNum=1;
		// Iterate from 1 to the range
		for (int i = 1; i <= range; i++) {
			if(i==1) {
			System.out.print("Output "+firstNum);
			} else {
				System.out.print(", "+firstNum);
			}
			int sum = firstNum + secNum;

			firstNum = secNum;

			secNum = sum;

		}
			// Print first number 
			
			// add first and second number
			
			// Assign second nuumber to the first number
			
			// Assign sum to the second number
			
		

	}

}
