public class Rezept {
    private int anzahlPersonen;
    private String[] zutatenName;
    private double[][] zutaten;

    //Konstruktor - mit this.variable zeigen wir auf die hier definierte Klassenvariable
    public Rezept(int anzahlPersonen, String[] zutatenName, double[][] zutaten) {
        this.anzahlPersonen = anzahlPersonen;
        this.zutatenName = zutatenName;
        this.zutaten = zutaten;
    }

    //Pruefen wir ob im Rezept die uebergebene Zutat, auf welche die Person allergisch ist, dabei ist
    public boolean allergisch(String zutat) {
        //Gehen wir alle Zutatennamen durch und vergleichen jeden String
        for (int i = 0; i < zutatenName.length; i++) {
            //Achtung, hier werden Strings verglichen ;)
            if (zutatenName[i].equals(zutat)) { //ein toLowerCase waere empfehlenswert aber kein Muss wenn ich es weiss
                //Falls Ja -> Dann wissen geben wir true zurueck
                return true; //Achtung: Sobald ein return erreicht wird, springen wir komplett raus aus der Methode! - hier ist Schluss, falls wir hier ankommen
            }
        }
        //Ein Return muss immer erreicht werden, daher liegt auch eines draussen, denn wenn das true nicht zurueckgebeben
        //wurde, dann kommen wir ziemlich sicher hier an und beenden die Funktion/Methode an dieser Stelle - jedes Return schmeisst uns raus aus der Methode!
        return false;
    }

    //Gleiche Pruefung wie in der Methode darueber nur pruefen wir hier auf die zwei Worte milch und kaese
    public boolean laktoseFrei() {
        boolean removed = false;
        for (int i = 0; i < zutatenName.length; i++) {
            String name = zutatenName[i].toLowerCase();
            if (name.contains("milch") || name.contains("käse")) {
                //Falls wir sie finden, dann schhmeissen wir sie aus dem Rezept raus und setzen die Variable removed auf Wahr
                zutaten[i][0] = 0;
                zutaten[i][1] = 0;
                removed = true;
            }
        }
        //Je nachdem ob Wahr oder Falsch, wissen wir ob wir was rausgeschmissen haben aus dem Rezept oder eben nicht,
        //Falls ja, wuerde es vl. sinn machen den Preis neu zu berechnen, falls dieser schon berechnet wurde, ansonsten
        //nur zur Info
        return removed;
    }

    //Zum berechnen der Kosten fuer das Rezept
    public double kostet() {
        double sum = 0; //Hilfsvariable um die Summe aller Kosten festzuhalten
        double preisProEinheit = 0;
        for (int i = 0; i < zutaten.length; i++) {
            //Zuerst den Preis pro Einheit berechnen, sprich 1gramm kostet soviel

            //ABER ACHTUNG: Falls es Laktoseprodukte sind und wir sie entfernt haben, dann steht hier der Wert 0
            //Eine Division durch 0 ist nicht moeglich, daher muessen wir diese IF hier einbauen!
            if(zutaten[i][1] == 0 || zutaten[i][0] == 0){
                preisProEinheit = 0; //Einfach mit 0 initialisieren, statt die Division durchzfuehren
            } else {
                //Nun berechnen wir den Preis pro Einheit, sprich 1 gramm kostet soviel €
                preisProEinheit = zutaten[i][1]/zutaten[i][0];
                        //Beispiel 300g Tomatensosse kostet 1€
                        //also 1€ / 300g Tomatensosse = 0,003€ pro 1g Tomatensosse
                        //..nun wissen wir wie viel 1 Gramm kostet, nachfolgend berechnen wir die Menge MAL den Gramm-Kosten
            }

            //Dann die angegebene Menge MAL dem Preis-Pro-Einheit .. also den Gramm-Preis MAL der Gramm-Anzahl
            sum += zutaten[i][0] * preisProEinheit;
        }
        //Retourniert nur die am Ende errechnete Summe des gesamten Rezptes
        return sum;
    }

    //Gibt mir nur die Kosten DURCH die anzahl der Personen zurueck
    public double kostetProPerson() {
        //Ich kann auch in einer Methode eine andere aufrufen, d.h. es wird nun zuerst die Methode kosten() abgearbeitet
        //und deren ReturnValue landet hier unten rein, wird dann durch die anzahlPersonen dividiert und erst dann
        //zur "Aufrufstelle" von kostetProPerson als double-Wert retourniert
            return kostet() / anzahlPersonen;
    }

    //Das waere eig. eine Art Setter-Methode, denn wir setzten hier den Wert der Variable anderePersonen um, allerdings
    //ist davor noch eine gewisse Logik, wo wir die Menge und die Kosten fuer dieses Rezept skalieren und an die Menge
    //der neuen Personen anpassen -> Daher keine reine SETTER-Methode sondern eine Funktion, eine reine Setter-Methode
    //waere es, wenn ich NUR die Variable anzahlPersonen veraendern wuerde ohne jegliche weitere Logik und Manipulation
    public void aenderePersonen(int anzahl) {
        if (anzahl > 0) {
            //Im nachstehenden stetht ein (double) das konvertiert im Zuge der Rechnung die Variable anzahl aus einem
            //int zum double damit die Rechnung mit gleiche Datentypen stattfinden kann
            double factor = (double) anzahl / anzahlPersonen;
            //Die Hilfsvariable Faktor brauchen wir um alle Zutatenmengen und -kosten entsprechend zu skalieren
            for (int i = 0; i < zutaten.length; i++) {
                zutaten[i][0] *= factor; //ist gleich wie: zutaten[i][0] = zutaten[i][0] * factor;
                zutaten[i][1] /= factor; //ist gleich wie: zutaten[i][0] = zutaten[i][0] * factor;
            }
            //Am Ende der Funktion veraendern wir noch die entsprechende Variable -> Das hier waere jetzt reine
            //Setter-Methoden-Logik
            anzahlPersonen = anzahl;
        }
    }

    //Getter-Methode um die aktuelle Anzahl der Personen zu erfragen - falls benoetigt
    public int getAnzahlPersonen(){
        return anzahlPersonen;
    }
}
