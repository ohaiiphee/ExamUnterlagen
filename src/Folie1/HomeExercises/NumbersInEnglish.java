package Folie1.HomeExercises;

import java.util.Scanner;

public class NumbersInEnglish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number < 1 || number > 10) {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
            if (number < 1 || number > 10) {
                System.out.println("Invalid number entered. Please try again.");
            }
        }
        String word = "";
        switch (number) {
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            case 10:
                word = "ten";
                break;
        }
        System.out.println("The English word for " + number + " is " + word);
    }
}

