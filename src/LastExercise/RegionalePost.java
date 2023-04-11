package LastExercise;

public class RegionalePost {

    //Einleitung in diese uebung:
    //Sie sind die Regionalleitung der PostAG und sie haben die Aufgabe alle Pakete die bei der Regionalleitung
    //hereinkommen, auf die umliegenden Filialen zu verteilen! - Nun erstellen Sie in dieser Klasse Ihre einzelnen
    //Filialen und geben denen auch gleich mit an, wie gross das Paketvolumen pro Filiale ist.
    //ZB. Bei der Filiale in Kalsdorf haben nur 10 Pakete plazt.

    public static void main(String[] args) {
        
        //zwei neue Filialen der Post erzeugen, eine in Kalsdorf mit einem Paketvolumen von 10 und eine in Graz mit 15 Paketplaetzen
        FilialPost fp1 = new FilialPost(10,"Filiale Kalsdorf");
        FilialPost fp2 = new FilialPost(15, "Filiale Graz");

        //Neues Paket erstellen um es der FilialPost zuzuweisen
        Paket p1 = new Paket(2, "Hauptstrasse 113");

        //Das neue Paket an die FilialPost Kalsdorf uebergeben
        fp1.paketHinzufügen(p1);
        //Zwei neuee Pakete an  die Filiale Graz uebergeben und das Paket-Objekt erst im Uebergabeparameter erstellen
        fp2.paketHinzufügen(new Paket(34, "Grazer Strasse 27"));
        fp2.paketHinzufügen(new Paket(54, "Koerblergasse 126"));

        System.out.println("\nDas Array mit allen darin befindlichen !!Objekten!! bzw. !Referenzen! anzeigen");
        //Alle Pakete der FilalPost Kalsdorf und Graz in der Konsole anzeigen
        fp1.paketeAnzeigen();
        fp2.paketeAnzeigen();

        System.out.println("\nAlle Paketdetails anzeigen");
        //Alle Details eines bestimmten Pakets - in diesem Fall dem Paket in der Filiale Kalsdorf an der Stelle 0
        fp1.paketDetails(0);
        fp2.paketDetails(1); //In diesem Fall dem Paket in der Filiale Graz an der Stelle 1

        System.out.println("\nPaket mit ID 2 im Array suchen und loeschen");
        //Nun entfernen wir das Paket aus der Filiale in Kalsdorf an der Stelle 0
        fp1.paketEntfernen(2);
        //Und lassen uns nochmal das gesamte Array anzeigen
        fp1.paketeAnzeigen();
    }
}