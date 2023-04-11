package Folie5_OOP_MultiClass.Hund;

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

    //Funktion Bellen implementieren
    public void bellen(){
        System.out.println("Wuff Wuff");
    }

    //Funktion Stock bringen Ja/Nein ? implementieren
    public void stoeckchenBringen(boolean kannHund){
        //User gibt beim Methodenaufruf an ob der Hund das kann oder nicht, wir erwarten uns also TRUE oder FALSE in der Variable kannHund
        if(kannHund){ //ist das gleich wie wenn ich: kannHund == ture eingeben wuerde
            System.out.println("Ja, "+name+" kann Stoeckhen bringen!");
        } else { //wir muessen hier nicht auf kannHund == false pruefen, da dies noch die einzige moegliche Option ist, falls kannHund != true
            System.out.println("Nein, "+name+" kann das noch nicht!");
        }
    }

    //Ab hier alle Getter und Setter
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
