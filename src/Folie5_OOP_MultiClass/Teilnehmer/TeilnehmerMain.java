package Folie5_OOP_MultiClass.Teilnehmer;

public class TeilnehmerMain {
    public static void main(String[] args) {
        //Objekterstellung und Initialisierung
        Teilnehmer t1 = new Teilnehmer("Maxi", 20, "Hauptstrasse 120, 8020 Graz");
        Teilnehmer t2 = new Teilnehmer("Elke", 22, "Triesterstrasse 10, 8010 Graz");

        //Ausgabe von Informationen der Objekte -> Eigene Logik dafuer in der Klasse TN, dann muss ich den Code nicht 100 mal schreiben wenn ich 100 TN ausgeben moechte
        t1.teilnehmerInfo();
        t2.teilnehmerInfo();

        //t1 hat eine Frage gestellt +1 beim Counter rechnen
        t1.hatFragenGestellt();

        //Wie viele Fragen wurden bisher gestellt?
        t1.ausgabeFragenCounter();
        t2.ausgabeFragenCounter();

        //Setter-Methode nutzen um auf spezifische Variablendaten zuzugreifen und sie zu manipulieren
        t1.setName("Maximilian");
        t1.teilnehmerInfo(); //Siehe da, der Name des Objektes t1 hat sich veraendert

        //Getter-Methode nuzten
        System.out.println("-----Trennstrich-----");
        String vorname = t1.getName(); //Um spezifische Variablendaten zu holen und den Wert anzeigen zu lassen oder zu speichern
        System.out.println("Der Rueckgabewert ist: "+vorname); //Ausgabe des soeben geholten WErtes
    }
}
