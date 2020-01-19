package com.exercise21hashmap.app;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
	public static void main(String...args) 
	{
		HashMap<Integer, String> miHashMap = new HashMap<Integer, String>();
		
		miHashMap.put(1, "Ary");
		miHashMap.put(2, "Alex");
		miHashMap.put(3, "Ale");
		miHashMap.put(4, "Cristina");
		
		for (int i = 1; i <= miHashMap.size(); i++)
		{
			if (miHashMap.containsKey(i))
				System.out.println(miHashMap.get(i));
		}
		
		for (Map.Entry<Integer, String> miMap : miHashMap.entrySet())
		{
			System.out.format("Key: %d Value: %s \n", miMap.getKey(), miMap.getValue());
		}
	}
}
