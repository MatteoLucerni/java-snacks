package org.lessons.java;

import java.util.Random;

public class Snack11 {
	public static void main(String[] args) {

        Random random = new Random();
        
        int[] numbers = new int[10];
        
        for(int i = 0; i < 10; i++) {
        	numbers[i] = random.nextInt(0,100);
        }
        
        int min = 100;
        int max = 0;
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
        	if(numbers[i] < min) {
        		min = numbers[i];
        	} else if(numbers[i] > max) {
        		max = numbers[i];
        	}
        	
        	sum += numbers[i];
        }
        
        int avg = sum / numbers.length;
        
        System.out.print("Numeri generati: ");
        for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        System.out.println("Numero massimo: " + max);
        System.out.println("Numero minimo: " + min);
        System.out.println("Numero medio: " + avg);
	}
}
