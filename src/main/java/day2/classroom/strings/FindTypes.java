package day2.classroom.strings;

public class FindTypes {


	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Automation Class $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		
		char testarraychar[] = test.toCharArray();
		
		for (int i = 0; i < testarraychar.length; i++) {
			
			if (Character.isLetter(testarraychar[i])) {
				letter = letter+1;
				
				
			}
			else if(Character.isDigit(testarraychar[i])){
				num = num +1;
			}
			else if(Character.isSpaceChar(testarraychar[i])){
				space = space +1;
			}
			else {
				specialChar+=1;
				
			}
		}
		
		System.out.println("Total letters:"+letter);
		System.out.println("Total numbers:"+num);
		System.out.println("Total numbers:"+space);
		System.out.println("special character count :"+specialChar);
		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/

		
	}

}
