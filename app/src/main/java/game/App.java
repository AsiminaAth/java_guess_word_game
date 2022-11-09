package game;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    private static Random rand = new Random();
    private static Scanner input = new Scanner(System.in);
    private static List<String> words = new ArrayList<>();
    private static Scanner reader = null;

    private static int playGame(List<String> words) {
        //TODO: calculate score
        int score = 5;
        return score;
    }
    public static void main(String[] args) {
        //TODO: initialize reader

        while(reader.hasNextLine()) {
            String word = reader.nextLine();
            words.add(word);
        }

        int score = playGame(words);

        System.out.println("Your score: " + score);
    }
}