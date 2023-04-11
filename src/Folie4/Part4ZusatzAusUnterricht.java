import java.util.Arrays;

public class Part4ZusatzAusUnterricht {
    public static void main(String[] args) {
        multiArraysEinfuehrung(); //Hier geben wir NUR die erste Dimension des Arrays aus
        multiArrayKennenlernen(); //Wesentlich detaillierter -> hier gehen wir schon einen Schritt weiter und geben die ZWEITE Dimension aus
    }

    public static void multiArraysEinfuehrung(){
        //Spielfeld erstellen mit laenge=8 Felder und breite=8 Felder
        boolean[][] spielFeld = new boolean[6][7]; //erste Zahl = Hoehe/Reihen | zweite Zahl = Breite/Spalten

        //Ausgabe des Arrays wie bisher bekannt
        System.out.println(Arrays.toString(spielFeld)); //--> GEHT NICHT, da die toString-Methode damit nicht klar kommt

        System.out.println("\n---Trennstrich---\n\n");
        //so geht die Ausgabe richtig -> nur mit einer Schleife
        for(boolean[] reihe : spielFeld){ //Achtung die Variable reihe ist hier auch ein Array, daher die eckigen Klammern bei boolean []
            //..denn wir bekommen hier erst die zweite Dimension von spielFeld uebergeben, sprich ein weiteres Array

            System.out.println(Arrays.toString(reihe)); //Daher benoetigen wir HIER nun das ARRAYS.toString(reihe) -> Weil wir hier
            //..nun wirklich ein ganzes Array ausgeben und nicht die einzelnen Werte. Um die einzelnen Werte auszugeben
            //..muessten wir eine weitere verschachtelte Schleife erstellen! -> Siehe im spaeteren Verlauf der Folien
        }

        System.out.println("\n---Trennstrich---\n\n");
        //Setzen wir nun etwas auf das Spielfeld in die 2.te Reihe und der 4.ten Spalte
        spielFeld[1][3] = true; //Wir veraendertn dieses eine Feld
        //..und geben nun das gleiche wie oben erneut aus um die veraenderung zu betrachten
        for(boolean[] reihe : spielFeld){
            System.out.println(Arrays.toString(reihe));
        }

        //Kurzschreibweise auch hier gleich wie bei eindimensionalen Arrays
        int[][] multiArr1 = {{1,2,3}, {4,5,6}, {1,2,3}};
        //oder
        String[][] multiArr2 = {
                {"Das", "ist", "die", "erste", "Reihe"},
                {"Und", "hier", "kommt", "die 2.te"},
                {"hier", "noch", "die", "dritte", "Reihe", "!"},
                {"und weils Spass macht, noch eine 4.te mit nur einem Element :)"}
        };
        //Ausgabe des zweiten Arrays also multiArr2 -> Achtung: der Datentyp in der For:each-Schleife muss dem Array-DAtentyp gleich sein!
        for(String[] ma : multiArr2){
            System.out.println(Arrays.toString(ma));
        }
    }

    public static void multiArrayKennenlernen() {
        int[][] multiArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] ersteDimension : multiArray) {
            System.out.println("Hier wird nur die erste Dimension des Multiarrays ausgegeben!");
            System.out.println("Daher ist noch das Arrays.toString() fuer eine Ausgabe notwendig! - Siehe hier\n");
            //Beispiel 1
            System.out.println("Ausgabe ohne Arrays.toString(): " + ersteDimension);
            System.out.println("-----Trennstrich-----");
            //Beispiel 2
            System.out.println("Ausgabe mit Arrays.toString(): " + Arrays.toString(ersteDimension));
            System.out.println("-----Trennstrich-----");

            //Nun greifen wir auf inneren Arrays zu bzw. auf die zweite Dimension
            for (int zweiteDimension : ersteDimension) {
                System.out.println("Nun befinden wir uns in der zweiten Schleife, hier wird nun die zweite Dimension ausgegeben!");
                System.out.println("Hier ist das Arrays.toString() nicht mehr notwendig, da wir hier auf die direkten Endwerte zugreifen und keine Arrays mehr haben!");
                //Ausgabe aller verspeicherten Werte
                System.out.println("Ausgabe aller Werte einzeln: " + zweiteDimension);
            }
        }

        for (int[] ersteDimension : multiArray) {
            //Hier greifen wir auf die aeusseren Arrays zu bzw. auf die ERSTE Dimension
            //Ausgabe jedes inneren Arrays als ganze Zeile
            System.out.println(Arrays.toString(ersteDimension));

            for (int zweiteDimension : ersteDimension) {
                //Hier greifen wir auf die inneren Arrays zu bzw. auf die ZWEITE Dimension

                //Ausgabe aller verspeicherten Werte -> EINZELN
                System.out.println("Ausgabe aller Werte einzeln: " + zweiteDimension);
            }
        }
    }
}
