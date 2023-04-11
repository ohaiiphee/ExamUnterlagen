package Folie1.HomeExercises;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance;
        // Prompt the user to enter their account balance
        System.out.print("Enter your account balance: ");
        balance = scanner.nextDouble();
        // Display the menu and prompt the user to select an option
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Handle the user's choice
            switch (choice) {
                case 1:
                    // Prompt the user to enter the deposit amount and update the balance
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.printf("Your new balance is " + balance);
                    break;
                case 2:
                    // Prompt the user to enter the withdrawal amount and update the balance
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                        System.out.printf("Your new balance is " + balance);
                    } else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 3:
                    // Display the current balance
                    System.out.printf("Your balance is " + balance);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Goodbye");
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

