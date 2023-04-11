package Folie4.HomeExercises;

import java.util.Random;

public class Array2D_Min_Max_Sum_Average {
    public static void main(String[] args) {
        // Erzeuge ein 2-dimensionales Array mit den Dimensionen 8x8
        int[][] array = new int[8][8];
        // Fülle das Array mit zufälligen ganzen Zahlen zwischen 1 und 100
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100) + 1;
            }
        }
        // Berechne und gib die Summe aller Elemente im Array aus
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summe += array[i][j];
            }
        }
        System.out.println("Summe aller Elemente: " + summe);
        // Berechne und gib den Durchschnitt aller Elemente im Array aus
        double durchschnitt = (double) summe / (array.length *
                array[0].length);
        System.out.println("Durchschnitt aller Elemente: " + durchschnitt);
        // Finde und gib das Maximum im Array aus
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Maximum im Array: " + max);
        // Finde und gib das Minimum im Array aus
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Minimum im Array: " + min);
    }
}

