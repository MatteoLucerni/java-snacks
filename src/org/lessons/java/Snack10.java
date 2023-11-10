package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int firstNumber = in.nextInt();
		
		System.out.println("Inserisci un alro numero: ");
		int secondNumber = in.nextInt();
		
		in.close();
		
		int sum = 0;
		
		if(firstNumber == secondNumber) {
			sum = firstNumber * 2;
			System.out.println("Somma: " + sum);
			return;
		}
		
		int minNumber = firstNumber;
		int maxNumber = secondNumber;
		
		if(firstNumber > secondNumber) {
			minNumber = secondNumber;
			maxNumber = firstNumber;
		} 
		
		while(minNumber <= maxNumber) {
			sum += minNumber++;
		}
		
		System.out.println("Somma: " + sum);
	}
}
