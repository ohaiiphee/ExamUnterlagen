package Folie2.HomeExercises;

import java.util.Scanner;

public class MultiplicationAndDivisionTower {
    public static void main(String[] args) {

        //mit for-schleife
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte eine Zahl fuer den Turm eingeben: ");
        int zahl = eingabe.nextInt();
        long result = 0;
        long resultb = 0;
        for (int j = 0; j <= 1; j++) {
            for (int i = 0; i < 10; i++) {
                if (i == 0 && j == 0) {
                    System.out.println(zahl);
                    result = zahl;
                } else if (j == 0 && i != 1) {
                    resultb = result;
                    result = result * i;
                    System.out.println(resultb + " * " + i + " = " + result);
                } else if (i != 0 && i != 1) {
                    resultb = result;
                    result = result / i;
                    System.out.println(resultb + " / " + i + " = " + result);
                }
            }
        }

        //mit while-schleife
//        Scanner eingabe = new Scanner(System.in);
//        System.out.println("Bitte eine Zahl fuer den Turm eingeben: ");
//        int zahl = eingabe.nextInt();
//        long result = 0;
//        long resultb = 0;
//        int j = 0;
//        int i = 0;
//        while (j <= 1) {
//            i = 0;
//            while (i < 10) {
//                if (i == 0 && j == 0) {
//                    System.out.println(zahl);
//                    result = zahl;
//                } else if (j == 0 && i != 1){
//                    resultb = result;
//                    result = result * i;
//                    System.out.println(resultb + " * " + i + " = " + result);
//                } else if (i != 0 && i != 1){
//                    resultb = result;
//                    result = result / i;
//                    System.out.println(resultb + " / " + i + " = " + result);
//                }
//                i++;
//            }
//            j++;
//        }
    }
}
