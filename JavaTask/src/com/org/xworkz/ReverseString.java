package com.org.xworkz;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		System.out.println("Main programs starts here");
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string value");
		str = sc.nextLine();
		char ch[] = str.toCharArray();
		int n = ch.length;
		System.out.println("Reversed string is");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("Main programs ends here");
	}
	

}
