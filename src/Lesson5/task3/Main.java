package Lesson5.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        int num = 5;
        String word;

        for (int i = 0; i < num; i++) {
            word = sc.nextLine();
            words.add(0, word);
            if (i == 2) {
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}
