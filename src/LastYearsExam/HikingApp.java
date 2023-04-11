package LastYearsExam;

import java.util.Arrays;

public class HikingApp {
    public static void main(String[] args) {
        Hiking a = new Hiking();
        a.print();

        System.out.println(a.totalNrObstacles('H'));
        System.out.println(a.totalNrObstacles('L'));

        System.out.println(a.countObstaclesPerRow(0));
        System.out.println(a.countObstaclesPerRow(2));

        System.out.println(a.energyNeededInRow(0));
        System.out.println(a.energyNeededInRow(2));

        System.out.println(a.ableToFinishHiking(10));
        System.out.println(a.ableToFinishHiking(15));
        System.out.println(a.ableToFinishHiking(20));
    }
}
