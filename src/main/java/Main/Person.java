package Main;

public class Person {
    private String name, jobTitle;
    private int age;

    public Person(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
    }

    public String getName() {
        return name;
    }
}
