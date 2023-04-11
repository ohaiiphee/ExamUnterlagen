package Folie5_OOP_MultiClass.Rechteck;

public class Rechteck {
    //Attribute der Klasse Rechteck als private deklarieren
    private double width;
    private double height;

    //Konstruktor mit Uebergabewerten erstellen
    Rechteck(double width, double height) {
        //Durch this.width weiss Java, dass es die Klassenvariable initialisieren soll
        // ... mit dem uebergebenem width aus den Methodenparametern
        this.width = width;
        this.height = height;
    }

    //Getter-Methoden um die aktuellen Werte der angefuehrten Variablen an eine externe Klasse zurueck zu geben
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    //Setter-Methoden um die Werte dieser Klasse/bzw. des Instanzierten-Objektes mit den in der Methode als
    //... Parameter uebergebenen Werten neu zu setzen und zu veraendern
    public void setWidth(double width) {
        //Setzt einfach nur die aktuelle Klassenvariable width mit dem neuuebergebenem Wert aus dem Methodenparameter
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Logik des Programms, hier wird einfach nur die Flaeche berechnet und zurueckgegeben an die Stelle wo es aufgerufen wurde
    public double getArea() {
        double area = width * height;
        return area;
    }

    //..hier wird nur der Umfang berechnet und zurueckgegeben
    public double getPerimeter () {
        return 2* (width+height); //Man kann es auch so schreiben
    }
}
