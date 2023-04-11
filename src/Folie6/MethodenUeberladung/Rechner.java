package Folie6.MethodenUeberladung;

class Rechner {

    //Addieren von 2 int-Zahlen
    public int addieren(int a, int b) {
        return a + b;
    }

    //Addieren von 2 double-Zahlen
    public double addieren(double a, double b) {
        return a + b;
    }

    //Addieren von 3 int Zahlen
    public int addieren(int a, int b, int c) {
        return a + b + c;
    }

    //addieren von 3 double Zahlen
    public double addieren(double a, double b, double c) {
        return a + b + c;
    }

    //Hauptmethode zum Programmausfuehren
    public static void main(String[] args) {
        Rechner rechner = new Rechner();

        //Es wird aus dieser Perspektive, IMMER die gleiche Methode aufgerufen, Java entscheidet erst im Hintergrund
        //..anhand der uebergebenen Parameter, welche Methode es tatsaechlich aufruft
        System.out.println("Addieren von zwei ganzen Zahlen: " + rechner.addieren(5, 7));
        System.out.println("Addieren von zwei Fließkommazahlen: " + rechner.addieren(5.5, 7.3));
        System.out.println("Addieren von drei ganzen Zahlen: " + rechner.addieren(5, 7, 10));
        System.out.println("Addieren von drei Fließkommazahlen: " + rechner.addieren(5.5, 7.3, 10.2));
    }
}

