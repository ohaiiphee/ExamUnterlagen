public class AutoTest {
    public static void main(String[] args) {
        //Hier werden zwei Instanzen von Auto erzeugt
        Auto auto1 = new Auto("Toyota", "Camry", 2018);
        Auto auto2 = new Auto("BMW", "M550i", 2020);


        //Nun Testen wir die Methoden von Auto mit auto1
        auto1.gasGeben(100.0);
        System.out.println(auto1.toString());
        System.out.println("\nNun kommt ein Reh auf die Fahrbahn --> BREMSEN!");
        auto1.bremsen(60);
        System.out.println(auto1.toString());
        System.out.println("\n---------- Zweites Auto -----------");
        auto2.gasGeben(260);
        System.out.println(auto2.toString());


    }
}
