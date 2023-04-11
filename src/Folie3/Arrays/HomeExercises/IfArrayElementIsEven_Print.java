package Folie3.Arrays.HomeExercises;

public class IfArrayElementIsEven_Print {
    public static void main(String[] args) {
        //Erzeugen von Array mit 20 Werten
        int[] zahlen = {5, 8, 12, 15, 18, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90};
        for (int i = 0; i < zahlen.length; i++) {
            //Pruefen ob die Zahl gerade ist bzw. durch 2 teilbar
            if (zahlen[i] % 2 == 0) {
                //Ausgabe in die Konsole falls TRUE
                System.out.println(zahlen[i] + " ist eine gerade Zahl.");
            }
        }
    }

}

