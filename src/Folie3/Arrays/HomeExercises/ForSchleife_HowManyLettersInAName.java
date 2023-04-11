package Folie3.Arrays.HomeExercises;

public class ForSchleife_HowManyLettersInAName {
    public static void main(String[] args) {
        //Ein Array von 8 Strings erzeugen und die Werte gleich entsprechend zuweisen
        String[] namen = {"Anna", "Berta", "Carla", "Daniel", "Emma",
                "Fritz", "Gabi", "Hans"};
        //Die Laenge eines jeden einzelnen Strings herausfinden und gleichzeitig ausgeben - EasyCheasy
        for (int i = 0; i < namen.length; i++) {
            System.out.println("Der Name " + namen[i] + " hat " +
                    namen[i].length() + " Buchstaben.");
        }
    }
}

