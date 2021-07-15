package Lesson3.task4;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("Сало", 112.5F, 5);
        Product pr2 = new Product("Ковбаса", 185.5F, 30);
        Product pr3 = new Product("Огірки", 15.5F, 100);
        Product pr4 = new Product("Сир", 133.5F, 19);

        Product[] arr = {pr1, pr2, pr3, pr4};
        pr1.getMostPrice(pr1, pr2, pr3, pr4);
        pr1.getMostQuantity(pr1, pr2, pr3, pr4);
    }
}
