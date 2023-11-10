package org.lessons.java;

import java.util.Scanner;

public class Snack8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci una parola: ");
		String inputString = in.nextLine();
		
		in.close();
		
		String result = "";
		
		for(int i = 0; i < inputString.length(); i++) {
			char letter = inputString.charAt(i);
			
			if(letter == 'o') {
				letter = 'a';
			} else if (letter == 'a') {
				letter = 'o';
			}
			
			result += letter;
		}
		
		System.out.println(result);
	}
}
