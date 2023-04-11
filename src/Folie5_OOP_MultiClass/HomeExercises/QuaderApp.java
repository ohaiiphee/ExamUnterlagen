public class QuaderApp {
    public static void main(String[] args) {
        Quader q = new Quader(2.0, 3.0, 4.0);
        System.out.println("Grundflaeche: " + q.grundflaeche());
        System.out.println("Volumen: " + q.volumen());
        System.out.println("Oberflaeche: " + q.oberflaeche());
        q.skaliere(2.0);
        System.out.println("Grundflaeche nach Skalierung: " + q.grundflaeche());
        System.out.println("Volumen nach Skalierung: " + q.volumen());
        System.out.println("Oberflaeche nach Skalierung: " + q.oberflaeche());
    }
}
