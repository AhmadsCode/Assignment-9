/*
 * @author Ahmad Wahedi
 * CSC 201-004N
 * Assignment 9
 * Problem 9.4
 * (Use the Random class) Write a program that creates a Random object with seed  *
 * 1000 and displays the first 50 random integers between 0 and 100 using the     *
 * nextInt(100) method.
 */
import java.util.Random;

public class Assignment9 {

    public static void main(String[] args) {

        Random random = new Random(1000);  		// Create a Random object with seed 1000

        for (int i = 0; i < 50; i++) {                 // Displays the first 50 random integers between 0 and 100

            System.out.printf("%3d ", random.nextInt(101)); // displays 1-99
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }


    }


}