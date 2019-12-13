package week3.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDupliates {

	public static void main(String[] args)
	{
		String name = "PayPal India";
		name = name.replaceAll("\\s", "");
		System.out.println(name);
		char[] nameary = name.toCharArray();


		//	List<Character> listC = new ArrayList<>();

		Map<Character, Integer> cmap = new LinkedHashMap<>();
		for (char c : nameary) 
		{

			if(cmap.containsKey(c))
			{
				Integer val = cmap.get(c)+1;
				cmap.put(c, val);
			}
			else
			{
				cmap.put(c, 1);
			}
			//System.out.println(cmap.keySet());
		}

		for (char cfinal : cmap.keySet()) 
		{

			if (cmap.get(cfinal).equals(1))
			{
				System.out.println(cfinal+ "-" + cmap.get(cfinal));
			}

		}
	}
}
