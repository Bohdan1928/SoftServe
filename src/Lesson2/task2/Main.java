package Lesson2.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnS = new Scanner(System.in);
        Scanner scnN = new Scanner(System.in);

        System.out.println("Input employee's name: ");
        String nameEmployee1 = scnS.nextLine();
        System.out.println("Input employee's rating: ");
        int ratingEmployee1 = scnN.nextInt();

        System.out.println("Input employee's name: ");
        String namEmployee2 = scnS.nextLine();
        System.out.println("Input employee's rating: ");
        int ratingEmployee2 = scnN.nextInt();

        System.out.println("Input employee's name: ");
        String nameEmployee3 = scnS.nextLine();
        System.out.println("Input employee's rating: ");
        int ratingEmployee3 = scnN.nextInt();


        Employee st1 = new Employee(nameEmployee1, ratingEmployee1);
        Employee st2 = new Employee(nameEmployee1, ratingEmployee1);
        Employee st3 = new Employee(nameEmployee1, ratingEmployee1);
    }
}
