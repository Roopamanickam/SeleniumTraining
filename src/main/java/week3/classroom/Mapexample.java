package week3.classroom;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapexample {
	
	
	
	
	public static void main(String[] args) {
		String myname = "Roopa";
		char[] mynameary = myname.toCharArray();
		
		Map<Character,Integer> mapmyname = new LinkedHashMap<>();
		
		for (char ch : mynameary) 
		{
			if(mapmyname.containsKey(ch)) 
			{
				Integer value = mapmyname.get(ch) +1;
				mapmyname.put(ch, value);
				
				
		    }else 
		    {
			mapmyname.put(ch, 1);
		    }
		/*int count =0;
		for (int i = 0; i < mynameary.length; i++) 
		{
			mapmyname.put(mynameary[i], i+1);
			System.out.print(mapmyname);
			
			if(mapmyname.containsKey(mapmyname[i])) {
				
			}*/
			
		}
		
		//Set<Map.Entry<Character,Integer>> pnt = mapmyname.entrySet(); 
		for(Entry<Character, Integer> each: mapmyname.entrySet()) {
		System.out.println(each.getKey()+"  "+each.getValue());
		}
		
		
	}

}
