package Folie6.MethodenUeberladung;

public class Mathe {

    //Gib mir das minimum einer int Zahl zurueck
    public int minimumBerechnen(int x, int y){
        if(x < y){ return x;
        } else { return y; }
    }

    //Gib mir das minimum einer double Zahl zurueck
    public double minimumBerechnen(double x, double y){
        if(x < y){ return x;
        } else { return y; }
    }

    //Gib mir das minimum einer double Zahl aus 3 Zahlen zurueck
    public double minimumBerechnen(double x, double y, double z){
        if(x < y) {
            if (x < z) { return x;
            } else { return z; }
        } else { return y; }
    }

    public String minimumBerechnen(String x){
        return "Das ist keine Zahl!";
    }
}
