package Lesson5.task6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Words words = new Words(new Scanner(System.in), new ArrayList<String>(), null);
        words.doubleValues();
    }
}
