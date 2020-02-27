package com.org.xworkz;

import java.util.Arrays;

public class AnagramProgram {
	
	public static void main(String args[]) {
		System.out.println("Main programs starts here");
	      String x = "recitals";
	      String y = "articles";
	      if (x.length()==y.length()) {
	         char[] ch = x.toCharArray();
	         Arrays.sort(ch);
	         System.out.println(Arrays.toString(ch));
	         char[] ch2 = y.toCharArray();
	         Arrays.sort(ch2);
	         System.out.println(Arrays.toString(ch2));
	         System.out.println(Arrays.equals(ch, ch2));
	         if(ch.equals(ch2)) {
	            System.out.println("Given strings are anagrams");
	         } else {
	            System.out.println("Given strings are not anagrams");
	         }
	      }
	      System.out.println("Main programs ends here");
	   }

}
