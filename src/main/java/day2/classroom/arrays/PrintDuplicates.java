package day2.classroom.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintDuplicates {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};		
		Arrays.sort(data);
		int arraylength = data.length;
		
		System.out.println("length:"+arraylength);
		
		for(int i= 0; i< arraylength-1; i++) {
			
			
			if(data[i] == data[i+1]) {
				System.out.println("duplicate :"+data[i]);
			}
			
		}

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Loop through each array item
		 3) If the consecutive array items are same -> then print as duplicates
		 */
		
		
		
		
		
		
		
		// Print the second largest number	
		
		
	}

}
