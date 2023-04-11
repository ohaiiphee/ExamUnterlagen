package Folie4.HomeExercises;

import java.util.Random;

public class Array3D_Min_Max_Sum_Average {
    public static void main(String[] args) {
        // Erstelle ein 3-dimensionales Array mit den Dimensionen 4x3x2
        double[][][] array = new double[4][3][2];
        // Fülle das Array mit zufälligen Doubles zwischen 0,0 und 1,0
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = rand.nextDouble();
                }
            }
        }
        // Finde und gib aus: Summe aller Elemente im Array
        double summe = 0.0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    summe += array[i][j][k];
                }
            }
        }
        System.out.println("Summe aller Elemente: " + summe);
        // Finde und gib aus: Durchschnitt aller Elemente im Array
        double durchschnitt = summe / (array.length * array[0].length *
                array[0][0].length);
        System.out.println("Durchschnitt aller Elemente: " + durchschnitt);
        // Finde und gib aus: Maximum im Array
        double maximum = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] > maximum) {
                        maximum = array[i][j][k];
                    }
                }
            }
        }
        System.out.println("Maximum im Array: " + maximum);
        // Finde und gib aus: Minimum im Array
        double minimum = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] < minimum) {
                        minimum = array[i][j][k];
                    }
                }
            }
        }
        System.out.println("Minimum im Array: " + minimum);
    }
}

