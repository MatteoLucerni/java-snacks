package org.lessons.java;

public class Snack2 {
	public static void main(String[] args) {
		String[] names = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] surnames = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("Invitato numero " + (i+1) + ": " + names[i] + " " + surnames[i]);
		}
	}
}
