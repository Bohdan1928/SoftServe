package Lesson4;

public class Cat {
    private static Cat cats;
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setCats(Cat cats) {
        Cat.cats = cats;
    }

    public static Cat getCats() {
        return cats;
    }

    public void printCat(){
        System.out.println(cats);
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
