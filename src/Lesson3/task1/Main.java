package Lesson3.task1;

public class Main {
    public static void main(String[] args) {

        int[] a = {33, 44, 55};

        for (int j : a) {
            if ((j % 2) != 0) {
                System.out.println("odd: " + j);
            } else {
                System.out.println("twin: " + j);
            }

        }
    }
}
