package Lesson3.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int day = scn.nextInt();

        switch (day){
            case 1:
                System.out.println("Українською: Понеділок. " + "Англійською: Monday. " + "Німецькою: Montag.");
                break;
            case 2:
                System.out.println("Українською: Вівторок. " + "Англійською: Tuesday. " + "Німецькою: Dienstag.");
                break;
            case 3:
                System.out.println("Українською: Середа. " + "Англійською: Wednesday. " + "Німецькою: Mittwoch.");
                break;
            case 4:
                System.out.println("Українською: Четвер. " + "Англійською: Thursday. " + "Німецькою: Donnerstag.");
                break;
            case 5:
                System.out.println("Українською: П'ятниця. " + "Англійською: Friday. " + "Німецькою: Freitag.");
                break;
            case 6:
                System.out.println("Українською: Субота. " + "Англійською: Saturday. " + "Німецькою: Samstag.");
                break;
            case 7:
                System.out.println("Українською: Неділя. " + "Англійською: Sunday. " + "Німецькою: Sonntag.");
                break;
        }
    }
}
