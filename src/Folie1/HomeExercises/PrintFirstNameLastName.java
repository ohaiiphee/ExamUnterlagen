package Folie1.HomeExercises;

import java.util.Scanner;

public class PrintFirstNameLastName {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            System.out.print("Enter your age: ");
            int age = input.nextInt();
            System.out.printf("Hello, %s! You are %d years old.", name, age);
        }
}
