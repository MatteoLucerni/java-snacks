package org.lessons.java;

public class Snack6 {
	public static void main(String[] args) {
		String string = "12321";
		int result = 0;
		
		for(int i = 0; i < string.length(); i++) {
			char charAsString = string.charAt(i);
			
			int charAsNumeric = charAsString - '0';
			
			result = result * 10 + charAsNumeric;
		}
		System.out.println(result);
	}
}
