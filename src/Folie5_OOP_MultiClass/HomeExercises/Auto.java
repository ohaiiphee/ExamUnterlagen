public class Auto {
    //Wir deklarieren alle Variablen als Private und nur in dieser Klasse sichtbar!
    private String marke;
    private String modell;
    private int jahr;
    private double geschwindigkeit;

    public Auto(String marke, String modell, int jahr) {
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
        this.geschwindigkeit = 0.0;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void gasGeben(double geschwindigkeitZunahme) {
        this.geschwindigkeit += geschwindigkeitZunahme;
    }

    public void bremsen(double geschwindigkeitAbnahme) {
        this.geschwindigkeit -= geschwindigkeitAbnahme;
    }

    //Das @Override ist eine spezielle Besonderheit und soll eine schon existierende Methode der Oberklasse ueberschreiben
    //Die Methode toString() gibt es schon in der Oberklasse (AutoTest) und da diese hier gleich heissen soll, muessen
    //wir hier ein @Override vor der Methode hinschreiben, damit Java weiss dass es die toString()-Methode der Oberklasse
    //mit deiser nachfolgenden toString()-Methode ueberschreiben darf/soll
    @Override //Natuerlich koennten wir auch einfach den Methodennamen abaendern aber sie sollen wissen, dass es dieses Phaenomen gibt!
    public String toString() {
        return "Marke: " + marke + ", Modell: " + modell + ", Jahr: " + jahr + ", Geschwindigkeit: " + geschwindigkeit;
    }
}
