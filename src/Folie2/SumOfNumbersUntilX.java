package Folie2;

import java.util.Scanner;

public class SumOfNumbersUntilX {
    public static void main(String[] args) {
        uebung01();
    }

    public static void uebung01(){
        //01 - Summe aller Zahlen
        //Schreibe ein Programm, das den Benutzer nach einer positiven ganzen Zahl fragt und dann die Summe
        // aller ganzen Zahlen von 1 bis zu dieser Zahl ausgibt.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine positive Integer-Zahl ein: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum +i; //Das wuerde auch gehen: sum += i;
            i++; //i muss unbedingt erhoeht werden, damit wir keine Endlosschleife haben ;)
        }
        System.out.println("Die Summe aller Zahlen von 1 bis " + n + " ist " + sum + ".");
    }
}
