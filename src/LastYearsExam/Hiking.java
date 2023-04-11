package LastYearsExam;

import java.util.Objects;

public class Hiking {

    public char[][] environment = {
            {'0', '0', '0', 'H', '0', '0', '0', '0', '0', '0'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', 'H', '0', '0', 'H', 'H'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', '0', 'H'},
            {'0', '0', '0', 'H', 'H', '0', '0', 'L', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', 'H', '0'},
            {'L', '0', '0', 'H', '0', '0', '0', '0', '0', '0'},

    };

    public void print() {
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                System.out.format("%c\t", environment[i][j]);
            }
            System.out.println();
        }
    }

    public int totalNrObstacles(char enemyType) {
        int barriers = 0;
        int holes = 0;
        for (char[] row : environment) {
            for (char item : row) {
                if (item == 'H') {
                    barriers++;
                }
                if (item == 'L') {
                    holes++;
                }
            }
        }
        if (enemyType == 'H') {
            System.out.println("The total number of barriers is: ");
            return barriers;
        } else {
            System.out.println("The total number of holes is: ");
            return holes;
        }
    }

    public int[] countObstaclesPerRow(int row) {
        int[] obstaclePerRow = new int[environment.length];
        char charStore = ' ';
        int counter = 0;
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                charStore = environment[i][j];
                if (Objects.equals(charStore, 'H') || Objects.equals(charStore, 'L')){
                    counter++;
                }

            }
            obstaclePerRow[i] = counter;
            counter = 0;
        }
        System.out.println("The total number of obstacles in row " + row + " is: " + obstaclePerRow[row]);
        return obstaclePerRow;
    }

    public int energyNeededInRow(int row) {
        int[] energyPerRow = new int[environment.length];
        int energyThisRow = energyPerRow[row];
        char charStore = ' ';
        int energy = 0;
        boolean isHole = false;
        for (int i = row; i == row; i++) {
            if (!isHole) {
                for (int j = 0; j < environment[i].length; j++) {
                    charStore = environment[i][j];
                    if (Objects.equals(charStore, 'H')) {
                        energy = energy + 2;
                    }
                    if (Objects.equals(charStore, 'L')) {
                        isHole = true;
                        break;
                    }
                }
                energyPerRow[i] = energy;
                energyThisRow = energyPerRow[i];
                energy = 0;
            }
        }

        if (isHole == false) {
            System.out.println("The total number of energy needed in row " + row + " is: " + energyThisRow);
            return energyThisRow;
        } else {
            System.out.println("Bunny is trapped in a hole!");
            return -1;
        }
    }


    public int ableToFinishHiking(int points) {
        int[] obstaclePerRow = new int[environment.length];
        char charStore = ' ';
        int energy = points;
        boolean isHole = false;
        int rowCounter = 0;
        for (int i = 0; i < environment.length; i++) {
            if (isHole == false && energy > 0) {
                for (int j = 0; j < environment[i].length; j++) {
                    charStore = environment[i][j];
                    if (Objects.equals(charStore, 'H')) {
                        energy = energy - 2;
                    }
                    if (Objects.equals(charStore, 'L')) {
                        isHole = true;
                        rowCounter = rowCounter -1;
                        break;
                    }
                }
                rowCounter++;
            }

        }
        if (isHole == false) {
            System.out.println("Bunny completed :" + rowCounter + " rows with: " + points + " energy");
        } else {
            System.out.println("Bunny completed :" + (rowCounter) + " rows with: " + points + " energy before it got stuck in a hole!");
        }
        return rowCounter;
    }
}