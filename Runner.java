package com.qa;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int randomNumber = (int) (Math.random() * 99 + 1);
		int guess;
		
		System.out.println("Welcome to the random number generator game");
		System.out.print("Pick a number: ");
		guess = userInput.nextInt();
		
		if (guess == randomNumber) {
			System.out.println("Well done, the number was: " + randomNumber + ", you got the right number!");
		} else if (guess != randomNumber) {
			System.out.println("Sorry, the number was: " + randomNumber +  ", looks like you were incorrect! Better luck next time");
		}
		userInput.close();
	}
}
