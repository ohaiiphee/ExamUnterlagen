package LastExercise;//Kurze Info:
//Diese Klasse ist nur unser Paket und "macht" nix, sie hat keine Funktionen, weil ein Paket auch keine Funktionen hat
//Sie ist nur dafuer da, dass wenn wir ein Paket erstellen moechten, diese Daten nicht jedes Mal extra haendisch
//hinschreiben muessen - sondern mit einem einzigen Zeilenaufruf, sofort ein Paket erstellt haben
//.. zB. mit: Paket p = new Paket(id, adresse);

public class Paket {
        private int id;
        private String adresse;

        public Paket(int id, String adresse) {
            this.id = id;
            this.adresse = adresse;
        }

        public int getId() {
            return id;
        }

        public String getAdresse() {
            return adresse;
        }
}

