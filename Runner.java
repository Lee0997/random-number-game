package com.qa;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int attempt = 1;
        int guess = 0;
        int randomNumber = (int)(Math.random() * 99 + 1);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the random number generator game");
    }
}
