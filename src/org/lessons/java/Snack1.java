package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int inputNumber = in.nextInt();
		
		if(!(inputNumber % 2 == 0)) inputNumber++;
		
		System.out.println("Risultato: "+ inputNumber);
	}
}
