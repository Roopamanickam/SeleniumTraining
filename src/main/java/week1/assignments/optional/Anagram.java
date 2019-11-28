package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "pots";
				
				int a = text1.length();
				int b = text2.length();
				
				if(a == b)
				{
					char[] a1 =text1.toCharArray();
					char[] b1 =text2.toCharArray();
							
					Arrays.sort(a1);
					Arrays.sort(b1);
					
					/*System.out.println(a1);
					System.out.println(b1);*/
							if(Arrays.equals(a1, b1) )
							{
								System.out.println("Anagram");
							}
				}
				else
				{
					System.out.println("Not anagram");
				}
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */

	}

}
