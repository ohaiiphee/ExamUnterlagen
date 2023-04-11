package Folie3.Arrays;

public class UniArray_Sum_Average_Smallest_Biggest {
    public static void main(String[] args) {
        uebung02ArraySchleife();
    }

    public static void uebung02ArraySchleife(){
        //Deklaration und Initialisierung aller Elemente
        int zahlen[] = {1,2,3,4,5,6,7,8,9,10};
        int summeAller = 0;
        int durchschnitt = 0;
        int kleinsteZahl = zahlen[5];
        int groesteZahl = 0;

        //In einer Schleife das Array zahlen, Element für Element durchgehen
        for(int num : zahlen){
            //Summe aller Elemente
            summeAller = summeAller + num;
            //Kleinste Zahl
            if(kleinsteZahl > num){
                kleinsteZahl = num;
            }
            //Groesste Zahl
            if(groesteZahl < num){
                groesteZahl = num;
            }
        }
        //Durchschnitt aller Elemente
        durchschnitt = summeAller/zahlen.length;

        System.out.println("Die Summe aller Zahlen betraegt: "+summeAller+" | der Durschnitt: "+durchschnitt+" | die kleinste Zahl: "+kleinsteZahl+" | die groesste Zahl: "+groesteZahl);
    }
}
