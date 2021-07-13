package Lesson2.task2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static int totalSum;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    public float getSalary(int rate, int hours){
        float salary = rate * hours;
        System.out.println(salary);
        return salary;
    }
    public int changeRate(int newRate){
        rate = newRate;
        System.out.println(newRate);
        return newRate;
    }
    public float getBonuses(int oldSalary){
        int count = oldSalary/10;
        float newSalary = oldSalary + count;
        System.out.println(newSalary);
        return newSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
