package Lesson2.task3;

public class Person {
    private String firstName;
    private String secondName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person(String firstName, String secondName, int birthYear) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        int age = 2021 - this.birthYear;
        System.out.println(age);
        return age;
    }

    public void input(String newFirstName, String newSecondName, int newBirthYear) {
        this.firstName = newFirstName;
        this.secondName = newSecondName;
        this.birthYear = newBirthYear;
    }

    public void output(){
        System.out.println(this.firstName + " " + this.secondName + " " + this.birthYear);
    }

    public void changeName(String fn, String sn){
        this.firstName = fn;
        this.secondName = sn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
