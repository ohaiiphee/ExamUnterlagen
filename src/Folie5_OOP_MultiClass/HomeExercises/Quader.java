public class Quader {
    private double laenge;
    private double breite;
    private double hoehe;

    public Quader(double laenge, double breite, double hoehe) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double grundflaeche() {
        return laenge * breite;
    }

    public void skaliere(double faktor) {
        laenge *= faktor;
        breite *= faktor;
        hoehe *= faktor;
    }

    public double volumen() {
        return laenge * breite * hoehe;
    }

    public double oberflaeche() {
        return 2 * (laenge * breite + laenge * hoehe + breite * hoehe);
    }
}
