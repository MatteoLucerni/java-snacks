package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String userInputString = "";
		
		while(true) {
			System.out.println("Scrivi qualcosa (0 per interrompere): ");
	        
	        userInputString += in.nextLine();
	        
	        if (userInputString.contains("0")) break;
	        System.out.println("La tua password: " + userInputString);
		}
		in.close();
        
	}
}
