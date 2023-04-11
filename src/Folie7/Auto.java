package Folie7;

public class Auto {
    static int ccm; //Kubikanzahl des Autos
    static int counterAuto = 0; //Zaehler wie viele Autos erstellt wurden
    private String marke;
    private String typ;
    private int ps;

    //Konstruktor von Auto mit allen moeglichen Variablen als Parameter
    public Auto(String marke, String typ, int ps){
        this.marke = marke;
        this.typ = typ;
        this.ps = ps;
        counterAuto++; //somit wird Anzahl der erstellten Auotsmit jedem Konruktoraufruf erhoeht
    }

    //Getter
    public String getMarke(){
        return this.marke;
    }

    public String getTyp(){ return typ; }

    public static void fahren(){

        System.out.println("Ich fahre und bin eine statische Methode");
    }

    //In einer statischen Methode auf die Attribute eines Objektes zugreifen
    public static void gibMirMarkeAus(){
       //System.out.println("Die Marke ist "+marke);
    } //Geht  NICHT, weil die statische Methode idR NICHT an einem Objekt haengt und
    //..die Objektattribute bei einem Aufruf einer statischen Methode nicht existieren

    public void autoFahren(){
        //Zuerst muessen wir immer  tanken!
        autoTanken(); //Diese Methode ist private, daher ist sie nur in dieser Klasse auffindbar und aufrufbar
        System.out.println("Tanken fertig, nun koennen wir fahren! :)");
    }

    //geheimer Tankprozess, will es nicht von woanders aufrufen koennen, also machen wir die Methode private
    private void autoTanken(){
        System.out.println("Auto wird nun getankt! ...");
    }

}


