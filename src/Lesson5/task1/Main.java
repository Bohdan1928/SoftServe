package Lesson5.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        ArrayList<String> list = new ArrayList<>();

        int num = 5;
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            String str = scn.nextLine();
            list.add(str);
        }

        String st1;
        String st2;
        int len1;
        int len2;
        int bub;
        for (int i = 0; i < list.size(); i++) {
            st1 = list.get(i);
            len1 = st1.length();
            for (int j = 1; j < list.size(); j++) {
                st2 = list.get(j);
                len2 = st2.length();

                if (len1 > len2) {
                    bub = len1;
                    len1 = len2;
                    len2 = bub;
                    System.out.println(len2);
                } else if (len1 < len2) {
                    bub = len2;
                    len2 = len1;
                    len1 = bub;
                    System.out.println(len1);
                }
            }
        }*/
/*        ArrayList<String> list = new ArrayList<>();

        int num = 5;
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < num; i++) { // вводимо 5 стрінгів
            String str = scn.nextLine();
            list.add(str);
        }

        int longestLine = 0; // робимо по дефолту самою довгою першу стрінгу
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).length() < list.get(i).length()) { // перевіряєм чи iй елемент більший за попередній
                longestLine = i; // якщо та то просто запам'ятовуємо його індекс
            }
        }

        // якщо не було елементів більший за 0 то він і лишиться найбільшим
        // просто виводим результат на екран
        System.out.println("Longest element - " + longestLine + ", string: " + list.get(longestLine));*/
        /*ArrayList<String> list = new ArrayList<>();

        int num = 5;
        Scanner scn = new Scanner(System.in);

        int longestLine = 0; // робимо по дефолту самою довгою першу стрінгу
        for (int i = 0; i < num; i++) { // вводимо 5 стрінгів
            String str = scn.nextLine();
            list.add(str);
            if (i > 0) {
                if (list.get(longestLine).length() < list.get(i).length()) { // перевіряєм чи найбільший на даний момент елемент більший за ій
                    longestLine = i; // якщо та то просто запам'ятовуємо його індекс
                }
            }
        }
        // якщо не було елементів більший за 0 то він і лишиться самим більшим
        // просто виводим що в нас виийшло на екран
        System.out.println("Longest element - " + longestLine + ", string: " + list.get(longestLine));*/
    }
}
