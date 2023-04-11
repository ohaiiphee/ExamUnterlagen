package Folie6;

public class Tamagochi {
    //Globale Variablen, können in der gesamten Klasse in allen Methoden genutzt werden
    //..wuerde ich sie in einer Methode deklarieren, dann wuerden sie nur dort gueltig bzw. nutzbar sein
    int x = 0;
    int y = 0;
    int f = 1;

    //Methode bzw. Funktion des Tamagochi um sich in eine Richtung zu bewegen, die Richtung wird per Parameter beim
    //..Methodenaufruf mitgegeben und dann wird per IF (switch waere auch moeglich) entschieden in welche Richtung
    //..es sich bewegen soll
    public void bewegung(String richtung){
        if(f < 1){
            //System.out.println("Kein Futter mehr, bitte nachfuettern!");
            return;
        } else if(richtung.equals("Links")){
            x = x-1; //x--
        } else if (richtung.equals("Rechts")) {
            x = x+1;
        } else if (richtung.equals("Oben")) {
            y = y+1;
        } else if (richtung.equals("Unten")) {
            y = y-1; //y--
        }
        f = f-1; //f--
        System.out.println("x: "+x+" | y: "+y+" | f: "+f);
    }

    //Methode bzw. Funktion des Tamagochi um gefuettert zu werden, pro Futter-Wert kann es sich genau 1 Feld bewegen
    public void fuettern(int f){
        this.f = this.f+f;
         //10  =    1  + 9;
        //this.f = f;
    }

    //Methode um die Startkoordinaten des Tamagochi zu setzen, von da aus, muss es sich zu 0 bewegen
    public void koordinatensetzen(int xneu, int yneu){
        this.x = xneu;
        this.y = yneu;
    }

    //Einfach nur die GETTER-Methoden (Setter brauch ma bei dem Programmerl nicht, also weglassen)
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getF(){ return f; }
}
