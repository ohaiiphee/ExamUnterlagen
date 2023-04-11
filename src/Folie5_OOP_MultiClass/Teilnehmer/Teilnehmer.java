package Folie5_OOP_MultiClass.Teilnehmer;

public class Teilnehmer {

    //Deklaration von private Variablen -> NUR in dieser Klasse sichtbar!
    private String name;
    private int alter;
    private String adresse;
    private int counter = 0;

    //Konstruktor bzw. Constructor
    Teilnehmer(String name, int a, String adr){
        this.name = name; //Das this.variable zeigt immer auf die Klassenvariable! Somit, auch wenn die Variablen gleich heissen, weiss java was es mit was initialisiert
        this.alter = a;
        this.adresse = adr;
    }

    //Immer wenn eine Teilnehmerinn eine Frage stellt, soll der Counter um 1 erhoeht werden, damit ich als Lektor am
    //..Ende des Semesters sehe, wie viele Fragen gestellt wurden
    public void hatFragenGestellt(){
        counter++;
    }

    //Logik um die aktuellen Fragen der aktuellen Person auszugeben
    public void ausgabeFragenCounter(){
        System.out.println("Die Person "+name+" hat bisher "+counter+" Fragen gestellt!");
    }

    //Logik um Infos ueber den akteullen Teilnehmer, die aktuelle Teilnehmerin auszugeben
    public void teilnehmerInfo(){
        System.out.println("Die Person "+name+" ist "+alter+" Jahre alt und wohnt an der "+adresse);
    }

    //Hier kommen noch die Getter-Methoden und die Setter-Methoden
    //Das Programm formatiert einzeilige Methoden ab und zu in einer Zeile, nicht davon irritieren lassen
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    //Wird in dem Programmerl zwar nicht benoetigt, aber der Vollstaendigkeit halber
    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
