package Lesson2.task3;

public class Main {
    public static void main(String[] args) {
        Person vova = new Person("Vova", "Gord", 2002);
        Person nestor = new Person("Nestor", "Trush", 2003);
        Person andriy = new Person("Andriy", "Penuk", 2001);
        Person bodia = new Person();
        Person dia = new Person();

        vova.changeName("Volodimir", "Gordeychuk");
        nestor.output();
        andriy.getAge();
        bodia.input("Bohdan", "Bihun", 2002);
        dia.input("Diana", "Mazepa", 2004);

        System.out.println(vova + " " + andriy + " " + bodia + " " + dia);

    }
}
