package Lesson3.task4;

import java.lang.reflect.Array;

public class Product {
    private String name;
    private float price;
    private int quantity;

    public Product() {
    }

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getMostPrice(Product pr1, Product pr2, Product pr3, Product pr4){
        if (pr1.price > pr2.price && pr1.price > pr3.price && pr1.price > pr4.price) {
            System.out.println(pr1);
        } else if (pr2.price > pr1.price && pr2.price > pr3.price && pr2.price > pr4.price){
            System.out.println(pr2);
        } else if (pr3.price > pr1.price && pr3.price > pr2.price && pr3.price > pr4.price){
            System.out.println(pr3);
        }else {
            System.out.println(pr4);
        }
    }
    public void getMostQuantity(Product pr1, Product pr2, Product pr3, Product pr4){
        if (pr1.quantity > pr2.quantity && pr1.quantity > pr3.quantity && pr1.quantity > pr4.quantity) {
            System.out.println(pr1);
        } else if (pr2.quantity > pr1.quantity && pr2.quantity > pr3.quantity && pr2.quantity > pr4.quantity){
            System.out.println(pr2);
        } else if (pr3.quantity > pr1.quantity && pr3.quantity > pr2.quantity && pr3.quantity > pr4.quantity){
            System.out.println(pr3);
        }else {
            System.out.println(pr4);
        }
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
