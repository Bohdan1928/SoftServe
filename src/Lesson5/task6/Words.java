package Lesson5.task6;

import java.util.ArrayList;
import java.util.Scanner;

public class Words {

   private Scanner sc;
   private ArrayList<String> words;
   private String s;

    public Words() {
    }

    public Words(Scanner sc, ArrayList<String> words, String s) {
        this.sc = sc;
        this.words = words;
        this.s = s;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void doubleValues() {
        for (int i = 0; i < 10; i++) {
            s = sc.nextLine();
            words.add(s);
            words.add(s);
        }
        System.out.println(words);
    }

    @Override
    public String toString() {
        return "Words{" +
                "sc=" + sc +
                ", words=" + words +
                ", s='" + s + '\'' +
                '}';
    }
}
