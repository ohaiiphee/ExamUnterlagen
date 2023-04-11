package Folie7.Rekursion;

public class FibonacciRekursiv {
    public static void main(String[] args) {

        //Bereits bekannte Loesung mit einer Schleife
        System.out.println("--- Bekannte Loesung mit Schleife ---");
        uebung01Fibonacci();

        //Rekursive Loesung - Option 1
        System.out.println("\n\n--- OPTION 1 mit Rekursion ---");
        printFibonacci(0,20);

        //Rekursive Loesung - Option 2
        System.out.println("\n\n--- OPTION 2 mit Rekursion ---");
        int n = 20; // Anzahl der Fibonacci-Zahlen, die angezeigt werden sollen
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void uebung01Fibonacci(){
        int davor = 0; int aktuell = 1;
        for (int i = 0; i < 20; i++) {
            System.out.print(aktuell + " ");
            int naechste = davor + aktuell;
            davor = aktuell;
            aktuell = naechste;
        }
    }

    //OPTION 1
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //OPTION 2 (diese Greift sogar auf die Methode von OPTION 1 zu fuer die Berechnung)
    public static void printFibonacci(int current, int max) {
        if (current < max) {
            System.out.print(fibonacci(current) + " ");
            printFibonacci(current + 1, max);
        }
    }
}
