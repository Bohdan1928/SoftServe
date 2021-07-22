package Lesson5.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Words words = new Words(new ArrayList<String>(), new Scanner(System.in), null);
       words.fix();
    }
}
