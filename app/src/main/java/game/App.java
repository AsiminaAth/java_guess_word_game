package game;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.google.common.collect.Lists;

public class App {
    private static Random rand = new Random();
    private static Scanner input = new Scanner(System.in);
    // public static List<String> words = new ArrayList<>();
    private static Scanner reader = null;

    private static int playGame(List<String> words) {
        int score = 5;
        return score;
    }

        List<String> words = Lists.newArrayList("dog", "cat", "lion", "tiger", "bear", "frog", "whale", "monkey", "bird", "fish");
            
        
    public App(List<String> words) {
            this.words = words;
        }


    public static void main(String[] args) {
        while(reader.hasNextLine()) {
            String word = reader.nextLine();
            words.add(word);
        }

        int score = playGame(words);

        System.out.println("Your score: " + score);
    }
}