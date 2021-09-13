package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number between 0 and 100");
        int guess = 0;
        Random randomNumber = new Random();
        int secretNumber = randomNumber.nextInt(100);
if (guess == secretNumber)
                System.out.println("congratulations you guessed the correct number");
else
    System.out.println("your guess was incorrect please guess again" );
	// write your code here
    }
}
