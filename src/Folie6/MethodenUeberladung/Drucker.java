package Folie6.MethodenUeberladung;

class Drucker {

    //Drucken von STRING
    public void drucken(String s) {
        System.out.println("Zeichenkette: " + s);
    }

    //Drucken von INT
    public void drucken(int i) {
        System.out.println("Ganze Zahl: " + i);
    }

    //Drucken von DOUBLE
    public void drucken(double d) {
        System.out.println("Fließkommazahl: " + d);
    }

    //Drucken von BOOLEAN
    public void drucken(boolean b) {
        System.out.println("Boolescher Wert: " + b);
    }

    //MainMethode um das Programmerl auszufuehren
    public static void main(String[] args) {
        Drucker drucker = new Drucker(); //Objekt drucker erstellen

        //Aufruf der gleichen Funktion, jedoch immer anderer Output - JE NACH Parametertyp
        drucker.drucken("Hallo, Welt!");
        drucker.drucken(42);
        drucker.drucken(3.141592);
        drucker.drucken(true);
    }
}

