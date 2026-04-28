package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompts for the user to enter their age
        System.out.print("Enter your age: ");
        //storing as int instead of a double because not expecting decimals
        int age = scanner.nextInt();

        int difference = 100 - age;
        System.out.print("You are " + difference + " years away from being 100 years old!");
    }
}