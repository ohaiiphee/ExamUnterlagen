package Folie7.StatischeMethoden;

public class MatheRechner {
    // Static methode fuer addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Static methode fuer subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Static methode fuer multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static methode fuer division
    public static double divide(int a, int b) {
        //Falls eines von beiden 0 dann nicht rechnen!
        if (b == 0 || a == 0) {
            System.out.println("Division durch 0 ist nicht erlaubt!");
            return 0;
        } else {
            //ansonsten einifach rechnen und retournieren
            return (double) a / b;
        }
    }
}
