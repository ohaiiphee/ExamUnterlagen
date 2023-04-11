package Folie1.HomeExercises;

import java.util.Scanner;

public class ReverseString_EvenOrOdd_CountingVowels_CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nPlease choose from the following options:");
            System.out.println("1. Reverse a string");
            System.out.println("2. Check if an integer is even or odd");
            System.out.println("3. Count the number of vowels in a phrase");
            System.out.println("4. Calculate the factorial of a positive integer");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    reverseString();
                    break;
                case 2:
                    checkEvenOrOdd();
                    break;
                case 3:
                    countVowels();
                    break;
                case 4:
                    calculateFactorial();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
    }
    public static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scanner.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
    public static void countVowels() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a phrase: ");
        String phrase = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char c = Character.toLowerCase(phrase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in phrase: " + count);
    }
    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
