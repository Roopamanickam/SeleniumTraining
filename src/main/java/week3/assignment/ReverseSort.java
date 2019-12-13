package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseSort {
	
	public static void main(String[] args){
		List<String> cpy = new ArrayList<String>(); 
		
		cpy.add("CTS");
		cpy.add("HCL");
		cpy.add("Aspire systems");
		
		Collections.sort(cpy);
		Collections.reverse(cpy);
		
		System.out.println("Reverse Sort :"+cpy);
	}

	
}
