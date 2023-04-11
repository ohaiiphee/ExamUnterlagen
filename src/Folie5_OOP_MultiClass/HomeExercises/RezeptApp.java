public class RezeptApp {

    //Diese Klasse wurde nur zum Testen der Klasse Rezept erstellt!
    public static void main(String[] args) {
        // Test-Rezept erstellen
        String[] zutatenName = {"Nudeln", "Tomatensoße", "Milch", "Parmesan"};
        double[][] zutaten = {{300, 1.0}, {100, 2.0}, {50, 0.5}, {25, 1.5}};

        //Nun uebergeben wir die Testdaten, sprich Personen und Zutaten und erzeugen ein Rezept
        Rezept rezept = new Rezept(4, zutatenName, zutaten);

        // Testen der Methoden
        System.out.println("Allergisch gegen Milch: " + rezept.allergisch("Milch"));
        System.out.println("Allergisch gegen Eier: " + rezept.allergisch("Eier"));
        System.out.println("Kosten des Rezepts: " + rezept.kostet() + " Euro");
        System.out.println("Kosten pro Person: " + rezept.kostetProPerson() + " Euro");
        System.out.println("Laktosefreies Rezept: " + rezept.laktoseFrei());

        //Neue Anzahl von Personen berechnen
        rezept.aenderePersonen(4);
        System.out.println("Rezept für 4 Personen: " + rezept.getAnzahlPersonen() + " Personen");
        System.out.println("Kosten pro Person: " + rezept.kostetProPerson() + " Euro");
    }
}
