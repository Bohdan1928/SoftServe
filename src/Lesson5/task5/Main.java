package Lesson5.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        String s;


        for (int i = 0; i < 5; i++) {
            s = sc.nextLine();
            if (!(s.contains("Р") || s.contains("р"))) {
                words.add(s);
                if(s.contains("Л") || s.contains("л")){
                    words.add(s);
                }
            }
        }
        System.out.println(words);
    }
    //todo method fix
}
