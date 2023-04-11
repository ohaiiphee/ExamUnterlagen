package Folie6.MethodenUeberladung;

public class Auto {
    private String marke;
    private String typ;
    private int ps;

    //Konstruktor von Auto mit allen moeglichen Variablen als Parameter
    public Auto(String marke, String typ, int ps){
        this.marke = marke;
        this.typ = typ;
        this.ps = ps;
    }

    //Falls ein Auto ohen PS-Anzahl uebermittelt wird, nehme an, dass es 150PS sind
    public Auto(String marke, String typ){
        this.marke = marke;
        this.typ = typ;
        this.ps = 150;
    }

    //Falls ein Auto ohne jeglichen Angaben uebermittelt wird, erstelle ein Dummy objekt
    public Auto(){
//        this.marke = "Dummy-Auto";
//        this.typ ="Dummy-Typ";
//        this.ps = 0;
    }

    //KOnstruktor nur Name
    public Auto(String marke){
        this.marke = marke;
    }

    //Gibt mir die wichtigsten Informationen ueber das Auto in die Konsole aus
    public void autoInformationen(){
        System.out.println("Das Auto "+marke+" "+typ+" hat mindestenst "+ps+" unter der Haube!");
    }

    //Getter
    public String getMarke(){
        return this.marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
