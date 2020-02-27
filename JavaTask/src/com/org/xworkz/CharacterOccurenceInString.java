package com.org.xworkz;

import java.util.HashMap;

public class CharacterOccurenceInString {
	
	public static void main(String args[]) {
		
		System.out.println("Main programs starts here");
	String str = "XworkzDevelopmentCenter";
	HashMap <Character, Integer> map = new HashMap<>();
	
	for(int i = str.length() - 1;i>=0;i--)
	{
		if (map.containsKey(str.charAt(i))) {
			int count = map.get(str.charAt(i));
			map.put(str.charAt(i), ++count);
		} else {
			map.put(str.charAt(i), 1);
		}
	}System.out.println(map);
}
}
