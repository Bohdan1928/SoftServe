package Lesson3.task5;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("qwer", "asdf", 1);
        Dog dog2 = new Dog("tyui", "ghjk", 2);
        Dog dog3 = new Dog("opas", "lzxc", 3);

        dog1.getNameEquals(dog2);
        dog1.getOldDog(dog2);
    }
}
