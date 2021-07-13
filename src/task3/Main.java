package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input price: ");
        int[] c = new int[3];
        c[0] = scanner.nextInt();
        c[1] = scanner.nextInt();
        c[2] = scanner.nextInt();

        System.out.println("Input time: ");
        int[] t = new int[3];
        t[0] = scanner.nextInt();
        t[1] = scanner.nextInt();
        t[2] = scanner.nextInt();

        int count = 0;
        int count2;
        int all = 0;

        for (int i = 0; i < c.length; i++) {
            for (int y = 0; y < t.length; y++) {
                count = c[i] * t[i];
            }
            System.out.println("c" + c[i] + " = " + count);
            count2 = count;
            all += count2;
        }
        System.out.println(all);
    }
}
