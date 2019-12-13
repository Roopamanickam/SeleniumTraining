package week1.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		int count = 0;
		  String[] txtSplit = text.split(" ");
		  
		  System.out.println(txtSplit);
		  
		  for (int i = 0; i < txtSplit.length; i++) 
		  {
			  
			  if(txtSplit[i] != null) 
			  {				  
				  for (int j = 0; j < txtSplit.length; j++) 
				  {					 
					  if (txtSplit[i].equals (txtSplit[j])) 
					  {
						  count = count +1;						  
						  if(count > 1)
						  {
							  txtSplit[j] = null;
							// System.out.println(txtSplit[i]);
						  }						  
						  System.out.println(txtSplit[j]);  					
					  }			  
					  
				  }		
				  
			   }			  
		   }
		
	}

}

/*
 * Pseudo code 
 * a) Split the String into array and iterate over it 
 * b) Initialise another loop to check whether the word is there in the array 
 * c) if it is available then increase and count by 1. 
 * d) if the count > 1 then replace the word as "" 
 * e) print the each word
 */

/*public static void main(String[] args)
{
	String input="We learnt java basics as part of java sessions in week1"; 		//Input String	
	String[] words=input.split(" ");	//Split the word from String
	for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
	{
		if(words[i]!=null)
		{
		
		for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
		{
			
		if(words[i].equals(words[j]))	//Checking for both strings are equal
			{
				words[j]=null;			//Delete the duplicate words
			}
		}
		}
	}
	for(int k=0;k<words.length;k++)		//Displaying the String without duplicate words	
	{
		if(words[k]!=null)
		{
			System.out.println(words[k]);
		}
		
     }  
}*/
