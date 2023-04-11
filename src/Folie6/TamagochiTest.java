package Folie6;

public class TamagochiTest {
    public static void main(String[] args) {
        Tamagochi t = new Tamagochi(); //neues Objekt der eigenen Klasse anlegen

        //Man koennte die nachfolgenden 2 Werte auch ueber die Scanner-Klasse einlesen lassen, aber wir testen es mal Hardcoded
        t.fuettern(9); //Die Methode/Funktion Fuettern ausfuehren und den Wert 9 als Parameter an die Methode uebergeben
        t.fuettern(5);
        t.koordinatensetzen(6,4); //Die Methode/Funktion Koordinatensetzen ausfuehren mit entsprechenden Parametern

        int futterstand = t.getF();
        System.out.println("Futterstand: "+futterstand);
        for(int i=0; i<futterstand; i++){ //schauen ob ich mit der Futtermenge an die Stelle 0/0 komme
            if(t.getX()!=0){
                t.bewegung("Links");
            } //Falls X != 0 geh um eine Position nach Links
            if(t.getY()!=0){
                t.bewegung("Unten");
            } //Falls Y != 0 geh um eine position nach Unten
        }
    }
}
