package Lesson3.task5;

import java.util.Objects;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getNameEquals(Dog dog){
        System.out.println(!name.equals(dog.name));
    }
    public void getOldDog(Dog dog){
        if (age > dog.age){
            System.out.println(name + " " + breed);
        }else{
            System.out.println(dog.name + " " + dog.breed);
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
