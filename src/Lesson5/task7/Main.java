package Lesson5.task7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        String s;
        int longestLine = 0;

        for (int i = 0; i < 10; i++){
            s = sc.nextLine();
            words.add(s);
        }
        for (int j = 0; j < words.size(); j++){
            if(words.get(longestLine).length() > words.get(j).length()){
                System.out.println(j);
                break;
            }
        }
        System.out.println(words);
    }
}
