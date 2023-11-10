package org.lessons.java;

public class Snack7 {
	public static void main(String[] args) {
		
		int seconds = 8345;
		
		int s = seconds % 60;
		int min = (seconds % 3600) / 60;
		int hours = seconds / 3600;
		
		System.out.println("secondi → " + hours + ":" + min + ":" + s);
	}
}
