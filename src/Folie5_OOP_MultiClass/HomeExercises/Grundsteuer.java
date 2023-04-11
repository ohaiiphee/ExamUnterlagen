public class Grundsteuer {
    public static double grundsteuerBerechnen(int[][] grundstuecke) {
        double summe = 0.0;
        for (int[] grundstueck : grundstuecke) {
            int typ = grundstueck[0];
            int laenge = grundstueck[1];
            int breite = grundstueck[2];
            double flaeche = laenge * breite;
            double steuer = 0.0;
            switch (typ) {
                case 1:
                    steuer = flaeche * 3.20;
                    break;
                case 2:
                    steuer = flaeche * 2.10;
                    break;
                case 3:
                    steuer = flaeche * 0.90;
                    break;
                default:
                    System.out.println("Ungueltiger Typ: " + typ);
            }
            summe += steuer;
        }
        return summe;
    }
}
