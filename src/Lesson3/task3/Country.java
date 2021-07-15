package Lesson3.task3;

public enum Country {
    UKRAINE ("Eurasia"),
    USA ("North America"),
    CANADA ("North America");

    private String title;

    Country(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                '}';
    }
}

