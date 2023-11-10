package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String userString = "";
		int nNum = 0;
		int nChars = 0;
		int nSpecialChars = 0;
		
		while(true) {
			System.out.println("Scrivi qualcosa (0 per interrompere): ");
	        
			String userInput = in.nextLine();
			if (userInput.equals("0")) break;
			
			userString += userInput;
			
	        System.out.println("La tua stringa: " + userString);
		}
		in.close();
		
		for(int i = 0; i < userString.length(); i++) {
			 char currentChar = userString.charAt(i);
			 
			 if(Character.isDigit(currentChar)) {
				 nNum++;
			 } else if(Character.isAlphabetic(currentChar)) {
				 nChars++;
			 } else {
				 nSpecialChars++;
			 }
		}
		
		System.out.println("La tua stringa contiene " + nChars + " lettere " + nNum + " numeri e " + nSpecialChars + " caratteri speciali.");
        
	}
}
