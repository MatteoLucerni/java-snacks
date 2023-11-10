package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci una parola: ");
        String userInputString = in.nextLine();

        in.close();

        String reverseString = "";

        for (int i = userInputString.length() - 1; i >= 0; i--) {
            reverseString += userInputString.charAt(i);
        }
        
        boolean isPalindrome = userInputString.equals(reverseString);

        String message = isPalindrome ? "La parola è palindroma" : "La parola non è palindroma";

        System.out.println(message);
    }
}

