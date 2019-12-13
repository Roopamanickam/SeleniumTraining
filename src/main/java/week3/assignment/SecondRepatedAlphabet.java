package week3.assignment;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SecondRepatedAlphabet {
	
	public static void main(String[] args) 
	{
		
		String str = "PayPal India";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
		char[] strary = str.toCharArray();
			
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (char c : strary) 
		{
		
			if(map.containsKey(c))
			{
				Integer val = map.get(c)+1;
				map.put(c, val);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		//System.out.println(entries);
		
		Set<Integer> count = new TreeSet<Integer>();
		
		for (Entry<Character, Integer> each : entries) {
			Integer value = each.getValue();
			count.add(value);
		}
		
		List<Integer> c1 = new ArrayList<Integer>(count);
		for (Entry<Character, Integer> newchar : entries) 
		{
			if(newchar.getValue() == c1.get(c1.size()-2))
			{
				System.out.println(newchar.getKey()+" " + newchar.getValue());
			}
		}
		
	} 

}
