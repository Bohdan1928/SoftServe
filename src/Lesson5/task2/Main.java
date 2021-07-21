package Lesson5.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 20;
        int num1 = 0;

        ArrayList <Integer> allNum2 = new ArrayList<>();
        ArrayList <Integer> allNum3 = new ArrayList<>();

        for(int i = 0; i < num; i++){
            num1 = sc.nextInt();
            if((num1 % 2) == 0){
                allNum2.add(num1);
            }if((num1 % 3) == 0){
                allNum3.add(num1);
            }if(!((num1 % 2) == 0) && !((num1 % 3) == 0)) {
                System.out.println(num1 + " Sorry");
            }
        }

        System.out.println("AllNum2: " + allNum2);
        System.out.println("AllNum3: " + allNum3);
    }
}
