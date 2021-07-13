package Lesson2.task1;

public class Student {

    private String name;
    private int rating;

    static int avgRating;

    public Student() {
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static int getAvgRating() {
        return avgRating;
    }

    public static void setAvgRating(int avgRating) {
        Student.avgRating = avgRating;
    }

    public boolean betterStudent(Student st1, Student st2){
        boolean b = st1.rating < st2.rating;
        System.out.println(b);
        return b;
    }
    public int averageRate(Student[] students){
        int sum = 0;
        for (Student student : students) {
            sum = +student.rating;
            avgRating = sum / students.length;
        }
        return avgRating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
