package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)switch syntax
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		
		int a=2,b=3,z;
		// Declare a String variable with input as operations (Tip:
		String x = "";
		
		// Initiate switch case for operations
		
		switch(x) {
		
		case "add":
			z= a+b;
			System.out.println("Added Value :"+z);
			break;
			
		case "sub":
			z= a-b;
			System.out.println("sub :"+z);
			break;
			
		case "mul":
			z= a*b;
			System.out.println("Mul :"+z);
			break;
			
		default:
			System.out.println("illegal expression");
			break;
			
		}
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
