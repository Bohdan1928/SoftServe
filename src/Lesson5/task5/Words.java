package Lesson5.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    private ArrayList<String> words;
    private Scanner sc;
    private String s;

    public Words() {
    }

    public Words(ArrayList<String> words, Scanner sc, String s) {
        this.words = words;
        this.sc = sc;
        this.s = s;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void fix(){
        for (int i = 0; i < 5; i++) {
            s = sc.nextLine();
            if (!(s.contains("Р") || s.contains("р"))) {
                words.add(s);
                if (s.contains("Л") || s.contains("л")) {
                    words.add(s);
                }
            }
        }
        System.out.println(words);
    }

    @Override
    public String toString() {
        return "Words{" +
                "words=" + words +
                ", sc=" + sc +
                ", s='" + s + '\'' +
                '}';
    }
}
