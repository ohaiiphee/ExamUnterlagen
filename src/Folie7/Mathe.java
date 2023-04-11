package Folie7;

public class Mathe {

    //Gib mir das minimum einer int Zahl zurueck
    public int minimumBerechnen(int x, int y){
        if(x < y){ return x;
        } else { return y; }
    }

    //Gib mir das minimum einer double Zahl zurueck
    public double minimumBerechnen(double x, double y){
        if(x < y){ return x;
        } else { return y; }
    }

    //Gib mir das minimum einer double Zahl aus 3 Zahlen zurueck
    public double minimumBerechnen(double x, double y, double z){
        if(x < y) {
            if (x < z) { return x;
            } else { return z; }
        } else { return y; }
    }

    public String minimumBerechnen(String x){
        return "Das ist keine Zahl!";
    }

    public static int maximumBerechnen(int x, int y){
        if(x > y){
            return x;
        } else {
            return y;
        }
    }

    //MultiArray im Parameter uebergeben bekommen, dieses aendern und zurueckgeben
    public static int[][] testArray(int[][] arr){
        arr[0][0] = 10; //Die Stelle 0/0 im Array mit 10 initialisieren
        arr[0][1] = 987; //Die Stelle 0/1 im Array mit 987 initialisieren
        return arr; //Das manipulierte/veraenderte Array zurueckgeben
    }

    //Uberladene Methode testArray weil wir hier nur ein 1.dimensionales Array uebergeben bekommen
    //Die Funktion und Logik bleibt dieselbe, lediglich der Uebergabeparameter und die Klammern beim int[] haben sich geaendert
    public static int[] testArray(int[] arr){
        arr[0] = 10;
        arr[2] = 987;
        return arr;
    }

}
