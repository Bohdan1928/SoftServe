package Lesson5.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <String> words = new ArrayList<>();

        words.add("Мама");
        words.add("мила");
        words.add("раму");

        for (String s : words){
            System.out.println(s);
            for(int i = 2; i < words.size(); i++){
                System.out.println("Іменно");
            }
        }
    }
}
