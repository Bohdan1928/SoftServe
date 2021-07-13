package Lesson2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnS = new Scanner(System.in);
        Scanner scnN = new Scanner(System.in);

        System.out.println("Input student's name: ");
        String nameStudent1 = scnS.nextLine();
        System.out.println("Input student's rating: ");
        int ratingStudent1 = scnN.nextInt();
        System.out.println("Input student's name: ");
        String nameStudent2 = scnS.nextLine();
        System.out.println("Input student's rating: ");
        int ratingStudent2 = scnN.nextInt();
        System.out.println("Input student's name: ");
        String nameStudent3 = scnS.nextLine();
        System.out.println("Input student's rating: ");
        int ratingStudent3 = scnN.nextInt();


        Student st1 = new Student(nameStudent1, ratingStudent1);
        Student st2 = new Student(nameStudent2, ratingStudent2);
        Student st3 = new Student(nameStudent3, ratingStudent3);

        if(st3.betterStudent(st2, st3)){
            System.out.println(st2);
        }else{
            System.out.println(st3);
        }

        System.out.println("Students " + st1.getName() + st1.getRating() + ", " + st2.getName() + st2.getRating() + ", " + st3.getName() + st3.getRating());
    }
}
