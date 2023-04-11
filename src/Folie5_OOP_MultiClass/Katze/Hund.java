package Folie5_OOP_MultiClass.Katze;

public class Hund {
    private String name;
    private int alter;
    private String rasse;
    private String farbe;

    //Konstruktor anlegen
    public Hund(String name, int alter, String rasse, String farbe) {
        this.name = name;
        this.alter = alter;
        this.rasse = rasse;
        this.farbe = farbe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
