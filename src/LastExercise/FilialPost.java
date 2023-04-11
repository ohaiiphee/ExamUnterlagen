package LastExercise;

import java.util.Arrays;

//Kurze Info zu dieser Klasse:
// Die Hauptklasse "RegionalePost" erstellt eine Instanz von dieser klasse, wenn eine neue Filiale in der Region
// entstehen soll.  Damit sie nicht jedes mal so viel Code schreiben muessen, wenn Pakete hinzugefuegt und entfernt
// werden, besitzt diese Klasse die Funktionen PaketHinzufuegen, PaketEntfernen, PaketAnzeigen und PaketDetails
//

public class FilialPost {
        private String filialname; //Damit wir die verschiedenen Filialen unterschieden koennen
        private Paket[] pakete; //Jede Filiale hat ein eigenes Array mit eigenen Paketen, die groesse des Arrays wird ueber den Konsturkotr mitgeteilt
        private int anzahlPakete = 0; //Paketecounter Hilfsvariable

        public FilialPost(int maxAnzahlPakete, String filialname) {
            this.filialname = filialname;
            //Hier erstelle ich das Array mit der uebergebenen Groesse dynamisch
            pakete = new Paket[maxAnzahlPakete];
        }

        //Methode um ein Paket zum Array dieser Klasse hinzuzufuegen
        //Es wird ein Paket-Objekt im Parameter, von der aufrufenden Klasse, uebergeben
        public void paketHinzufügen(Paket paket) {
            //Hier pruefe ich nur ob das Array pakete nicht bereits voll ist, denn dann gibt es keinen Platz mehr
            if (anzahlPakete < pakete.length) {
                //Falls noch platz ist, dann fuege ich das uebergebene Paket-Objekt an die Stelle "anzahlPakete"
                //..und erhoehe die Variable anzahlPakete um 1, sodass beim nachesten Mal die naechste Stelle
                //..im Array pakete belegt werden kann
                pakete[anzahlPakete] = paket;
                anzahlPakete++;
            } else {
                //Sollte die Anzahl bereits groesser als die Laenge des Paket-Arrays sein, dann koennen wir ja nichts
                //..mehr hinzufuegen, da wir sonst eine "OutOfBounds-Exception" bekommen -> in diesem Fall geben wir
                //..einfach eine Fehlermeldung in der Konsole aus und machen NICHTS mit dem uebergebenen Objekt.
                System.out.println("Die Filiale hat bereits die maximale Anzahl an Paketen erreicht.");
            }
        }

        //Methode um ein Paket aus einem bestehenden Array zu entfernen
        public void paketEntfernen(int paketId) {
            //Die Schleife soll so oft durchlaufen werden, wie es Pakete gibt, daher nehmen wir anzahlPakete in den
            //..Schleifenkopf als Bedingung mit hinein, denn solange i kleiner ist, gehen wir die Schleife durch.
            for (int i = 0; i < anzahlPakete; i++) {
                //Pruefen ob das Paket mit der uebergebenen ID in dieser Iteration vorkommt
                if (pakete[i].getId() == paketId) {
                    //Falls wir unser Paket gefunden haben, sagen wir, dass das Array an dieser Stelle nun
                    //..ein null einfuegen soll und somit ist das Objekt aus dem Array geloescht!
                    pakete[i] = null; // Lösche das Paket aus dem Array
                    System.out.println("Paket mit id "+paketId+" an der Stelle "+i+" im Array, wurde geloescht!"); //kurze Info fuer uns
                    return; //an dieser Stelle beenden wir die Methode, da wir ja haben, was wir wolllten
                }
            }
            //Gab es keinen Treffer, so stehen wir hier und koennen dem Nutzer ueber die Konsole bescheid geben
            System.out.println("Paket mit ID " + paketId + " konnte nicht gefunden werden.");
        }

        //Methode um alle Pakete in der aktuellen Filiale anzuzeigen
        public void paketeAnzeigen(){
            System.out.println("Die "+filialname+" hat folgende Pakete bei sich: "+ Arrays.toString(pakete));
        }

        //Methode um Paketdetails (also ID und Adresse) anzeigen zu lassen
        public void paketDetails(int paketStelleImArray){
            System.out.println("Das Paket mit der uebergebenen Paket-ID: "+pakete[paketStelleImArray].getId()+" muss an die Adresse "+pakete[paketStelleImArray].getAdresse());
        }
}
