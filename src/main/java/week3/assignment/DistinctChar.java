package week3.assignment;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DistinctChar {
	
		public static void main(String[] args) 
		{
			
			String str = "Amazon India Private Limited";
			str = str.replaceAll("\\s", "");
			System.out.println(str);
			char[] strary = str.toCharArray();
			
			
			
		//	Map<Character,Integer> cmap = new LinkedHashMap<>();
			
			Map<Character, Integer> cmap = new LinkedHashMap<>();
			
			for (char c : strary) 
			{
				if(!cmap.containsKey(c))
				{
					
					cmap.put(c, 1);
					//Integer val = cmap.get(c)+1;
					//cmap.put(c, val);
				}
				else
				{
					cmap.put(c, cmap.get(c)+1);
				}
			}
			System.out.println(cmap);
			
			 for (Entry<Character, Integer> entry : cmap.entrySet())
			 {
				 	//duplicate char
		           // if (!entry.getValue().equals(1)) 
				 
				 //Distinct
				 if (entry.getValue().equals(1))
		            {
		                System.out.print(entry.getKey());
		            }
		}
	}
	}



