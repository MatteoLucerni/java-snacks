package org.lessons.java;

public class Snack9 {
	public static void main(String[] args) {
        int[] numbers = {7,2,4,12,24,13,121};

        int nEven = 0;
        int nOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                nEven++;
            } else {
                nOdd++;
            }
        }

        int[] evenArray = new int[nEven];
        int[] oddArray = new int[nOdd];

        int Ieven = 0;
        int Iodd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenArray[Ieven] = numbers[i];
                Ieven++;
            } else {
                oddArray[Iodd] = numbers[i];
                Iodd++;
            }
        }

        System.out.print("Numeri pari: ");
        for (int i = 0; i < evenArray.length; i++) {
        	System.out.print(evenArray[i] + " ");
        }
        System.out.println();
        
        System.out.print("Numeri dispari: ");
        for (int i = 0; i < oddArray.length; i++) {
        	System.out.print(oddArray[i] + " ");
        }
        System.out.println();
        }
}
